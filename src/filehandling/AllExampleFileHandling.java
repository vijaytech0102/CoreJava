package filehandling;

import java.io.*;
import java.nio.file.*;
import java.nio.channels.*;
import java.util.*;

public class AllExampleFileHandling {

    // 1. Create File
    public static void createFile() throws IOException {
        File file = new File("report.txt");
        if (file.createNewFile()) {
            System.out.println("File created: " + file.getName());
        } else {
            System.out.println("File already exists.");
        }
    }

    // 2. Write File
    public static void writeFile() throws IOException {
        try (FileWriter writer = new FileWriter("report.txt")) {
            writer.write("Transaction ID: 12345\nStatus: SUCCESS");
        }
    }

    // 3. Read File
    public static void readFile() throws IOException {
        try (BufferedReader reader = new BufferedReader(new FileReader("report.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                System.out.println("Read: " + line);
            }
        }
    }

    // 4. Append File
    public static void appendFile() throws IOException {
        try (FileWriter fw = new FileWriter("report.txt", true)) {
            fw.write("\nNew Transaction Added");
        }
    }

    // 5. Delete File
    public static void deleteFile() {
        File file = new File("old_report.txt");
        if (file.delete()) {
            System.out.println("Deleted: " + file.getName());
        }
    }

    //6. Directory Handling
    public static void createDirectory() {
        File dir = new File("logs");
        if (!dir.exists()) {
            dir.mkdir();
            System.out.println("Directory created: logs");
        }
    }

    //7. NIO Example
    public static void nioExample() throws IOException {
        Path path = Paths.get("report.txt");
        Files.write(path, "Industrial Data Export".getBytes());
        String content = Files.readString(path);
        System.out.println("NIO Content: " + content);
    }

    // 8. Atomic Write
    public static void atomicWrite() throws IOException {
        Path tempFile = Paths.get("temp.txt");
        Path finalFile = Paths.get("atomic_report.txt");
        Files.write(tempFile, "Safe atomic write".getBytes());
        Files.move(tempFile, finalFile, StandardCopyOption.REPLACE_EXISTING, StandardCopyOption.ATOMIC_MOVE);
    }

    // 9. Log Rotation
    public static void logRotation() throws IOException {
        File logFile = new File("app.log");
        if (logFile.exists() && logFile.length() > 1024) { // 1 KB for demo
            Path archive = Paths.get("archive/app_" + System.currentTimeMillis() + ".log");
            Files.createDirectories(archive.getParent());
            Files.move(logFile.toPath(), archive);
            System.out.println("Log rotated to: " + archive);
        }
    }

    // 10. File Locking
    public static void fileLocking() throws IOException {
        RandomAccessFile raf = new RandomAccessFile("shared.txt", "rw");
        FileChannel channel = raf.getChannel();
        FileLock lock = channel.lock();
        try {
            raf.writeBytes("Writing safely with lock\n");
        } finally {
            lock.release();
            channel.close();
            raf.close();
        }
    }

    // 11. Resume Processing
    public static void resumeProcessing() throws IOException {
        int lastProcessedLine = 0;
        File checkpoint = new File("checkpoint.txt");
        if (checkpoint.exists()) {
            try (BufferedReader br = new BufferedReader(new FileReader(checkpoint))) {
                lastProcessedLine = Integer.parseInt(br.readLine());
            }
        }
        try (BufferedReader br = new BufferedReader(new FileReader("example.txt"))) {
            String line;
            int lineNumber = 0;
            while ((line = br.readLine()) != null) {
                lineNumber++;
                if (lineNumber <= lastProcessedLine) continue;
                System.out.println("Processing: " + line);
                try (FileWriter fw = new FileWriter("checkpoint.txt")) {
                    fw.write(String.valueOf(lineNumber));
                }
            }
        }
    }

    // 12. Secure Path Handling
    public static void securePath() {
        Path safePath = Paths.get("uploads").resolve("userfile.txt").normalize();
        if (!safePath.startsWith(Paths.get("uploads"))) {
            throw new SecurityException("Path traversal detected!");
        }
        System.out.println("Safe path: " + safePath);
    }

    // 13. Config File Reading
    public static void readConfig() throws IOException {
        Properties props = new Properties();
        props.load(new FileInputStream("config.properties"));
        System.out.println("DB User: " + props.getProperty("db.user"));
    }

    // 14. Audit Logging
    public static void auditLog() throws IOException {
        try (FileWriter fw = new FileWriter("audit.log", true)) {
            fw.write("User Vijay accessed file at " + java.time.LocalDateTime.now() + "\n");
        }
    }

    // 15. Report Generation
    public static void generateReport() throws IOException {
        try (PrintWriter pw = new PrintWriter("report_" + java.time.LocalDate.now() + ".csv")) {
            pw.println("ID,Name,Status");
            pw.println("101,Vijay,Active");
            pw.println("102,Sen,Inactive");
        }
    }

    // MAIN METHOD
    public static void main(String[] args) {
        try {
            createFile();
            writeFile();
            readFile();
            appendFile();
            deleteFile();
            createDirectory();
            nioExample();
            atomicWrite();
            logRotation();
            fileLocking();
            resumeProcessing();
            securePath();
            readConfig();
            auditLog();
            generateReport();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}