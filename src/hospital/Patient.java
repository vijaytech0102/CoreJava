package hospital;

public class Patient extends Person implements Billable {
    private String patientId;
    private String type; // "General" or "Surgery"

    public Patient(String name, int age, String contact, String patientId, String type) {
        super(name, age, contact);
        this.patientId = patientId;
        this.type = type;
    }

    @Override
    public void getDetails() {
        System.out.println("Patient: " + name + " | Type: " + type);
    }

    @Override
    public double generateBill() {
    	// ternary operator
//    	if(type.equalsIgnoreCase("Surgery"))
//    	{
//    		return 5000;
//    	}
//    	else {
//    		return 1000;
//    	}
        return type.equalsIgnoreCase("Surgery") ? 5000.0 : 1000.0;
    }

	public String getPatientId() {
		return patientId;
	}

	public void setPatientId(String patientId) {
		this.patientId = patientId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

    
}

