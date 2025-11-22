package Online_Course_Management_System;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CourseSystem {

    // [] --> list
	//[obj1->(name, id, contact,password,type,[courselist1]), obj2->(name, id, contact,password,type,[courselist1]),obj3->(name, id, contact,password,type,[courselist1]),]]==> students
	private static List<Student> students = new ArrayList<>();
    //[obj1(id, name ,numner), obj2(id, name ,numner), obj3(id, name ,numner)]
	private static List<Instructor> instructors = new ArrayList<>();
    //[obj1(id, name, price)]
	private static List<Course> courses = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        initializeCourse();
        int choice;
        do {
        	System.out.println("\n--- Welcome Online_Course_Management_System ---");
            System.out.println("1. Show Courses");
            System.out.println("2. Student Registration");
            System.out.println("3. Course Purchase");
            System.out.println("4. Display Course Purchases");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");
            choice = scanner.nextInt();

            switch (choice) {
                case 1 -> showCourse();
                case 2 -> studentRegistration();
                case 3 -> coursePurchase();
                case 4 -> displayCoursePurchase();
                case 5 -> System.out.println("Thank you..");
                default -> System.out.println("Invalid choice.");
            }

        } while (choice != 5);
    }

    private static void initializeCourse() {
    	Course obj=new LiveCourse("C001", "Java", 5000, "live");
    	courses.add(obj);
    	courses.add(new VideoCourse("C002", "Python", 5000, "video"));
    }

    private static void showCourse() {
        System.out.println("\n📋 Available Courses:");
        for (Course v : courses) {
            System.out.println(v);
        }
    }

    private static void studentRegistration() {
        scanner.nextLine(); // consume newline
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        Student obj=findStudentById(studentId);
        //1. Check whether  student already present in the student list
        if(obj!= null)
        {
        	System.out.println("Student already exist!!");
        	return;
        }
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        System.out.print("Enter Student Contact: ");
        int contact = scanner.nextInt();
        scanner.nextLine(); // consume newline

        System.out.print("Enter Student Password: ");
        String password = scanner.nextLine();

        System.out.print("Enter The Course Type: ");
        String type = scanner.nextLine();
        Student obj1 = new Student(studentId, name, contact, password, type);
        students.add(obj1);
        System.out.println(" Student registered successfully!");
    }

    private static void coursePurchase() {
        scanner.nextLine(); // consume newline
        System.out.print("Enter Student ID: ");
        String studentId = scanner.nextLine();
        System.out.print("Enter Course Name: ");
        String courseName = scanner.nextLine();

        //1. Check whether student present in the purchased list
        Student student = findStudentById(studentId);  
        Course  obj = findStudentInEnrolledCourses(student, courseName);
        if(obj!=null)
        {
        	System.out.println("Already purchased");
        	return;
        }
        for (Student s : students)
        {
            if (s.getStudentId().equalsIgnoreCase(studentId))
            {
                student = s;
                break;
            }
        }
        if (student == null) {
            System.out.println(" Student not found.");
            return;
        }
        
        
        for (Course v : courses) {
            if (v.getName().equalsIgnoreCase(courseName)) {
                try {
                    v.enroll(student);
                    System.out.println(" Course purchased successfully!");
                } catch (EnrollmentException e) {
                    System.out.println("EnrollmentException: " + e.getMessage());
                }
                return;
            }
        }

        System.out.println(" Course not found.");
    }

    private static Course findStudentInEnrolledCourses(Student student, String courseName) {
		List<Course> list= new ArrayList<>();
		list=student.getEnrolledCourses();
		for(Course obj: list)
		{
			if(obj.getName().equals(courseName))
			{
				return obj;
			}
		}
		return null;
	}

	private static void displayCoursePurchase() {
        if (students.isEmpty()) {
            System.out.println("No students have purchased courses yet.");
            return;
        }

        for (Student v : students) {
            v.displaySummary();
        }
    }

    private static Instructor findInstructorById(String instructorId) {
        for (Instructor c : instructors) {
            if (c.getInstructorId().equalsIgnoreCase(instructorId)) {
                return c;
            }
        }
        return null;
    }

    private static Course findCourseById(String courseId) {
        for (Course d : courses) {
            if (d.getCourseId().equalsIgnoreCase(courseId)) {
                return d;
            }
        }
        return null;
    }
    private static Student  findStudentById(String sid)
    {

        for (Student s : students) {
            if (s.getStudentId().equalsIgnoreCase(sid)) {
                return s;
            }
        }
        return null;
    }
}