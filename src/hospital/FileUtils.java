package hospital;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public final class FileUtils {
    private FileUtils() { }

    // serialize--> to save the object in the file
    public static <T> void saveList(File file, List<T> list) throws IOException {
        // ensure parent dirs
        File parent = file.getParentFile();
        if (parent != null && !parent.exists()) parent.mkdirs();

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(file))) {
            oos.writeObject(list);
        }
    }
    // de-serialize--> to load the object from the file to local class
    @SuppressWarnings("unchecked")
    public static <T> List<T> loadList(File file) throws IOException, ClassNotFoundException {
        if (!file.exists()) return new ArrayList<>();
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream(file))) {
            Object obj = ois.readObject();
            if (obj instanceof List) {
                return (List<T>) obj;
            }
            return new ArrayList<>();
        }
    }
}
