package hospital;

import java.time.LocalDate;

import java.time.LocalDate;
import java.util.*;

public class HospitaltSystem {
	
	private static List<Doctor> doctors = new ArrayList<>();
    private static List<Patient> patients = new ArrayList<>();
    private static List<Appointment> appointments = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeData();
        int choice;
        
        do {
            System.out.println("\n--- Welcome To Hightech Hospital ---");
            System.out.println("1. Register Patient");
            System.out.println("2. Book Appointment");
            System.out.println("3. Display Appointments");
            System.out.println("4. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> registerPatient();
                case 2 -> bookAppointment();
                case 3 -> displayAppointments();
                case 4 -> System.out.println("Thank you..");
                default -> System.out.println("Invalid choice.");
            }
            
        } while (choice != 4);
    }

    private static void initializeData() {
        doctors.add(new Doctor("Dr. Mehta", 45, "9999999999", "D101", "Cardiology"));
        doctors.add(new Doctor("Dr. Kapoor", 50, "8888888888", "D102", "Orthopedics"));
    }

    private static void registerPatient() {
        scanner.nextLine(); // consume newline
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
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter Contact: ");
        String contact = scanner.nextLine();
       
        System.out.print("Enter Type (General/Surgery): ");
        String type = scanner.nextLine();
        Patient obj=new Patient(name, age, contact, id, type);
        patients.add(obj);
        System.out.println("Patient Registered Successfully1!.");
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
        		System.out.println("Appointment already booked");
        	}
        }
        //2. check whether patient present in the in patient list
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
        LocalDate date = LocalDate.parse(dateStr);

        try {
            Appointment appointment = new Appointment(patient, doctor, date);
            appointments.add(appointment);
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
            a.displaySummary();
        }
    }

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
}

