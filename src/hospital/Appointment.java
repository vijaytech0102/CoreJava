package hospital;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.Optional;
import java.time.LocalDate;

public class Appointment implements Serializable {
    
	private String aid;
	private Patient patient;
    private Optional<Doctor> doctor;
    private LocalDate date;
    
   
    
    public Appointment(String aid,Patient patient, Doctor doctor, LocalDate date) throws InvalidAppointmentException {
        if (date.isBefore(LocalDate.now())) {
            throw new InvalidAppointmentException("Cannot book appointment in the past.");
        }
        this.aid=aid;
        this.patient = patient;
        this.doctor = Optional.of(doctor);
        this.date = date;
    }

    public Appointment(String appointmentId, Patient patient2, Optional<Doctor> d, LocalDate date2) {
		// TODO Auto-generated constructor stub
    	this.aid=aid;
        this.patient = patient;
        this.doctor = d;
        this.date = date;
	}

	public void displaySummary() {
        System.out.println("\n--- Appointment Summary ---");
        
        patient.getDetails();
        doctor.orElse(null).getDetails();
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

	public Optional<Doctor> getDoctor() {
		return doctor;
	}

	public void setDoctor(Doctor doctor) {
		this.doctor = Optional.of(doctor);
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

    
}
