package Online_Course_Management_System;

public abstract class Course implements Enrollable {

	private String courseId;
	private String name;
	private float price;
	private String type;

	public Course(String courseId, String name, float price, String type) {
		this.courseId = courseId;
		this.name = name;
		this.price = price;
		this.type = type;
	}

	public String getCourseId() { return courseId; }
	public String getName() { return name; }
	public float getPrice() { return price; }
	public String getType() { return type; }

	public void displayAllCourse() {
		System.out.println("Course ID: " + courseId +
				", Name: " + name +
				", Price: " + price +
				", Type: " + type);
	}

	@Override
	public String toString() {
		return "Course [courseId=" + courseId + ", name=" + name + ", price=" + price + ", type=" + type + "]";
	}

	abstract void ShowDetails();
}