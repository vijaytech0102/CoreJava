package Online_Course_Management_System;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentId;
    private String name;
    private int contact;
    private String password;
    private String type;
    private List<Course> enrolledCourses = new ArrayList<>();

    public Student(String studentId, String name, int contact, String password, String type) {
        this.studentId = studentId;
        this.name = name;
        this.contact = contact;
        this.password = password;
        this.type = type;
    }

    public String getStudentId() { return studentId; }

    public void addCourse(Course course) {
        enrolledCourses.add(course);
    }

    public void displaySummary() {
        System.out.println("\nStudent: " + name + " (" + studentId + ")");
        System.out.println("Enrolled Courses:");
        if (enrolledCourses.isEmpty()) {
            System.out.println(" - None");
        } else {
            for (Course c : enrolledCourses) {
                System.out.println(" - " + c.getName() + " (" + c.getType() + ")");
            }
        }
    }

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getContact() {
		return contact;
	}

	public void setContact(int contact) {
		this.contact = contact;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public List<Course> getEnrolledCourses() {
		return enrolledCourses;
	}

	public void setEnrolledCourses(List<Course> enrolledCourses) {
		this.enrolledCourses = enrolledCourses;
	}

	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}
    
}