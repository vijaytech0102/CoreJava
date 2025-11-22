package Online_Course_Management_System;

public class VideoCourse extends Course {

    public VideoCourse(String courseId, String name, float price, String type) {
        super(courseId, name, price, type);
    }

    @Override
    public void enroll(Student student) throws EnrollmentException {
        if (student == null) throw new EnrollmentException("Student cannot be null");
        student.addCourse(this);
    }

    @Override
    void ShowDetails() {
        System.out.println("Video Course: " + getName() + " | Price: " + getPrice());
    }
}