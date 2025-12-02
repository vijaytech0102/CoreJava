package hospital;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;

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
	
    public static void main(String[] args) {
      // call 
    	initializeData();
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
    }

    private static void cancelAppointment() {
		// TODO Auto-generated method stub
		
	}

	private static void updateAppointment() {
		// TODO Auto-generated method stub
		scanner.nextLine();
		System.out.println("Enter the Appointment Id:");
		String apid=scanner.nextLine();
		Appointment obj= findAppointmentById(apid);
		Patient pobj=obj.getPatient();
		System.out.println("Enter the name to update:");
		String u_name=scanner.nextLine();
		pobj.setName(u_name);
		System.out.println("Name updated succesfully");
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
    	System.out.println("Do you want update patient name!! Please enter correct name");
    	String u_name=scanner.nextLine();
    	pobj.setName(u_name);
    
    	System.out.println("Patient Name updated Successfully");
    	return;
	}

	private static void initializeData() {
        doctors.add(new Doctor("Dr. Mehta", 45, "9999999999", "D101", "Cardiology"));
        doctors.add(new Doctor("Dr. Kapoor", 50, "8888888888", "D102", "Orthopedics"));
        doctors.add(new Doctor("Dr. Neeraj", 45, "45554556454", "D103","Heart Specialist"));
 
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
        LocalDate date = LocalDate.parse(dateStr);
        System.out.println("Enter the appointment Id:");
        String appointmentId=scanner.nextLine();
        
        try {
            Appointment appointment = new Appointment(appointmentId, patient, doctor, date);
            try (ObjectOutputStream obj = new ObjectOutputStream(new FileOutputStream("appointment.ser"))) {
                obj.writeObject(appointment);
                System.out.println("Object serialized!");
            } catch (IOException e) {
                e.printStackTrace();
            }
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
}

