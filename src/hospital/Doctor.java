package hospital;

public class Doctor extends Person {
	
    private static final long serialVersionUID = 1L;

    private String doctorId;
    private String specialization;
    private String add;

    public Doctor(String name, int age, String contact, String doctorId, String specialization) {
        super(name, age, contact);
        this.doctorId = doctorId;
        this.specialization = specialization;
    }

    @Override
    public void getDetails() {
        System.out.println("Doctor: " + name + " | Specialization: " + specialization);
    }

	public String getDoctorId() {
		return doctorId;
	}

	public void setDoctorId(String doctorId) {
		this.doctorId = doctorId;
	}

	public String getSpecialization() {
		return specialization;
	}

	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}

	@Override
	public String toString() {
		return "Doctor [doctorId=" + doctorId + ", specialization=" + specialization + ", add=" + add + ", name=" + name
				+ ", age=" + age + ", contact=" + contact + "]";
	}

    
}