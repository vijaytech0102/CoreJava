package hospital;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.*;

public class HospitaltSystem {
    //[doc1, doc2, doc3]
    private static List<Doctor> doctors = new ArrayList<>(); // list of object
    // doctors.get(1)
    //[pa1, pa2, pa3]
    private static List<Patient> patients = new ArrayList<>();
    //[ap1, ap2, ap3]
    private static List<Appointment> appointments = new ArrayList<>();
    // user input Scanner class
    private static Scanner scanner = new Scanner(System.in);

    // persistence files
    private static final File DATA_DIR = new File(System.getProperty("user.dir"), "data");
    private static final File DOCTORS_FILE = new File(DATA_DIR, "doctors.ser");
    private static final File PATIENTS_FILE = new File(DATA_DIR, "patients.ser");
    private static final File APPOINTMENTS_FILE = new File(DATA_DIR, "appointments.ser");

    public static void main(String[] args) {
        // call 
        initializeData();
        loadData();
        int choice;
        do {
            System.out.println("\n--- Welcome To Hightech Hospital ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Display Appointments");
            System.out.println("4. Update Patient");         
            System.out.println("5. Patient List");
            System.out.println("6. Update Appointment");
            System.out.println("7. Cancel Appointment");
            System.out.println("8. Exit");
            System.out.print("Enter your choice: ");
            while (!scanner.hasNextInt()) {
                System.out.println("Please enter a number between 1 and 8.");
                scanner.next();
            }
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> registerPatient();
                case 2 -> bookAppointment();
                case 3 -> displayAppointments();
                case 4 -> updatePatient();
                case 5-> displayPatients();
                case 6-> updateAppointment();
                case 7-> cancelAppointment();
                case 8 -> System.out.println("Thank you..");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 8);

        // save data before exit
        saveAllData();
    }

    private static void cancelAppointment() {
        scanner.nextLine();
        System.out.println("Enter the Appointment Id to cancel:");
        String apid = scanner.nextLine();
        Appointment obj = findAppointmentById(apid);
        if (obj == null) {
            System.out.println("No appointment found with id: " + apid);
            return;
        }
        appointments.remove(obj);
        System.out.println("Appointment cancelled successfully.");
        saveAppointmentsSafely();
    }

    private static void updateAppointment() {
        // TODO Auto-generated method stub
        scanner.nextLine();
        System.out.println("Enter the Appointment Id:");
        String apid=scanner.nextLine();
        Appointment obj= findAppointmentById(apid);
        if(obj==null){
            System.out.println("No appointment found with id: " + apid);
            return;
        }
        Patient pobj=obj.getPatient();
        System.out.println("Enter the name to update:");
        String u_name=scanner.nextLine();
        pobj.setName(u_name);
        System.out.println("Name updated succesfully");
        savePatientsSafely();
        saveAppointmentsSafely();
    }

    private static Appointment findAppointmentById(String apid) {
        // TODO Auto-generated method 
        for(Appointment obj:appointments)
        {
            if(obj.getAid().equalsIgnoreCase(apid))
            {
                return obj;
            }
        }
        return null;
    }

    private static void displayPatients() {
        // TODO Auto-generated method stub
        if(patients.isEmpty()){
            System.out.println("No patients registered.");
            return;
        }
        for(Patient p: patients)
        {
            System.out.println(p);
        }
    }

    private static void updatePatient() {
        // TODO Auto-generated method stub
        scanner.nextLine();
        System.out.println("Enter the Patient Id:");
        String pid=scanner.nextLine();
        Patient pobj=findPatientById(pid);
        if(pobj==null){
            System.out.println("Patient not found with id: " + pid);
            return;
        }
        System.out.println("Do you want update patient name!! Please enter correct name");
        String u_name=scanner.nextLine();
        pobj.setName(u_name);

        System.out.println("Patient Name updated Successfully");
        savePatientsSafely();
        return;
    }

    private static void initializeData() {
        // if doctors file exists, don't overwrite default doctors
        if (DOCTORS_FILE.exists()) return;
        doctors.add(new Doctor("Dr. Mehta", 45, "9999999999", "D101", "Cardiology"));
        doctors.add(new Doctor("Dr. Kapoor", 50, "8888888888", "D102", "Orthopedics"));
        doctors.add(new Doctor("Dr. Neeraj", 45, "45554556454", "D103","Heart Specialist"));
        saveDoctorsSafely();
    }

    private static void registerPatient() {
        scanner.nextLine(); // consume newline Enter key consume

        System.out.print("Enter Patient ID: ");
        String id = scanner.nextLine();

        for(Patient p: patients)
        {
            if(p.getPatientId().equalsIgnoreCase(id))
            {
                System.out.println("Patient already registered");
                return;
            }
        }
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        System.out.print("Enter Age: ");
        while(!scanner.hasNextInt()){
            System.out.println("Please enter a valid integer for age.");
            scanner.next();
        }
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();

        System.out.print("Enter Type (General/Surgery): ");
        String type = scanner.nextLine();
        Patient obj=new Patient(name, age, contact, id, type);
        patients.add(obj);
        // serialize
        savePatientsSafely();
        System.out.println("Patient Registered Successfully!.");
    }

    // list of appointments
    //-->appointments [ap1, ap2, ap3]
    private static void bookAppointment() {
        scanner.nextLine();
        System.out.print("Enter Patient ID: ");
        String pid = scanner.nextLine();

        // 1.check whether patient available in appointment list
        for(Appointment a:appointments)
        {
            Patient old=a.getPatient();
            String oldpid=old.getPatientId();
            if(oldpid.equals(pid))
            {
                System.out.println("Appointment already booked for this patient");
                return;
            }
        }
        //2. check whether patient present in the in patient list --> checking of patient registration
        Patient patient = findPatientById(pid);
        //3. if patient not found then return
        if (patient == null) {
            System.out.println("Patient not found!!!!.");
            return;
        }
        //4. If patient found --> then book appointment
        System.out.print("Enter Specialization: ");
        String spec = scanner.nextLine();
        Doctor doctor = findDoctorBySpecialization(spec);
        //5. if doctor not found
        if (doctor == null) {
            System.out.println("No doctor available with that specialization.");
            return;
        }
        // 6. if doctor available
        System.out.print("Enter Appointment Date (YYYY-MM-DD): ");
        String dateStr = scanner.nextLine();
        LocalDate date;
        try {
            date = LocalDate.parse(dateStr);
        } catch (Exception e) {
            System.out.println("Invalid date format. Use YYYY-MM-DD.");
            return;
        }
        System.out.println("Enter the appointment Id:");
        String appointmentId=scanner.nextLine();

        try {
            Appointment appointment = new Appointment(appointmentId, patient, doctor, date);
//            try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("appointment.ser"))) {
//                obj.writeObject(appointment);
//                System.out.println("Object serialized!");
            appointments.add(appointment);
            saveAppointmentsSafely();
            System.out.println("Appointment Booked Successfully.");
          
        } catch (InvalidAppointmentException e) {
            System.out.println("Error:" + e.getMessage());
        }
    }

    private static void displayAppointments() {
        if (appointments.isEmpty()) {
            System.out.println("No appointments found.");
            return;
        }
        for (Appointment a : appointments) {
            // non static method--> with the help of object
            a.displaySummary();
        }
    }
    // method definition [obj1 101, obj2 102, obj3 103]
    private static Patient findPatientById(String id) {
        for (Patient p : patients) {
            if (p.getPatientId().equals(id)) {
                return p;
            }
        }
        return null;
    }

    private static Doctor findDoctorBySpecialization(String spec) {
        for (Doctor d : doctors) {
            if (d.getSpecialization().equalsIgnoreCase(spec)) {
                return d;
            }
        }
        return null;
    }

    // persistence helpers
    private static void saveDoctorsSafely() {
        try {
            FileUtils.saveList(DOCTORS_FILE, doctors);
        } catch (IOException e) {
            System.err.println("Failed to save doctors: " + e.getMessage());
        }
    }

    private static void savePatientsSafely() {
        try {
        	// Serialize
            FileUtils.saveList(PATIENTS_FILE, patients);
        } catch (IOException e) {
            System.err.println("Failed to save patients: " + e.getMessage());
        }
    }

    private static void saveAppointmentsSafely() {
        try {
            FileUtils.saveList(APPOINTMENTS_FILE, appointments);
        } catch (IOException e) {
            System.err.println("Failed to save appointments: " + e.getMessage());
        }
    }

    private static void loadData() {
        try {
            doctors = FileUtils.loadList(DOCTORS_FILE);
        } catch (Exception e) {
            System.out.println("Could not load doctors, using defaults: " + e.getMessage());
        }
        try {
            patients = FileUtils.loadList(PATIENTS_FILE);
        } catch (Exception e) {
            System.out.println("Could not load patients: " + e.getMessage());
        }
        try {
            appointments = FileUtils.loadList(APPOINTMENTS_FILE);
        } catch (Exception e) {
            System.out.println("Could not load appointments: " + e.getMessage());
        }
    }

    private static void saveAllData() {
        saveDoctorsSafely();
        savePatientsSafely();
        saveAppointmentsSafely();
    }
}