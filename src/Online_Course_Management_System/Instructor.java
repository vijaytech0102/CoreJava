package Online_Course_Management_System;

public class Instructor {
    private String instructorId;
    private String instructorName;
    private String instructorNumber;

    public Instructor(String instructorId, String instructorName, String instructorNumber) {
        this.instructorId = instructorId;
        this.instructorName = instructorName;
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorId() { return instructorId; }
    public String getInstructorName() { return instructorName; }
    public String getInstructorNumber() { return instructorNumber; }

    public void displaySummary() {
        System.out.println("Instructor: " + instructorName + " (" + instructorId + ")");
    }

	@Override
	public String toString() {
		return "Instructor [instructorId=" + instructorId + ", instructorName=" + instructorName + ", instructorNumber="
				+ instructorNumber + "]";
	}
    
}