package hospital;

import java.io.Serializable;
import java.time.LocalDate;

import java.time.LocalDate;

public class Appointment implements Serializable {
    
	private String aid;
	private Patient patient;
    private Doctor doctor;
    private LocalDate date;
    
   
    
    public Appointment(String aid,Patient patient, Doctor doctor, LocalDate date) throws InvalidAppointmentException {
        if (date.isBefore(LocalDate.now())) {
            throw new InvalidAppointmentException("Cannot book appointment in the past.");
        }
        this.aid=aid;
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

	public String getAid() {
		return aid;
	}

	public void setAid(String aid) {
		this.aid = aid;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	public Doctor getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = doctor;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

    
}
