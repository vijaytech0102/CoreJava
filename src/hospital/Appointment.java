package hospital;

import java.time.LocalDate;

import java.time.LocalDate;

public class Appointment {
    
	private Patient patient;
    private Doctor doctor;
    private LocalDate date;

    public Appointment(Patient patient, Doctor doctor, LocalDate date) throws InvalidAppointmentException {
        if (date.isBefore(LocalDate.now())) {
            throw new InvalidAppointmentException("Cannot book appointment in the past.");
        }
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }

    public void displaySummary() {
        System.out.println("\n--- Appointment Summary ---");
        
        patient.getDetails();
        doctor.getDetails();
        System.out.println("Date: " + date);
        System.out.println("Estimated Bill: ₹" + patient.generateBill());
    }

    public Patient getPatient() {
        return patient;
    }

    public Doctor getDoctor() {
        return doctor;
    }

    public LocalDate getDate() {
        return date;
    }
}
