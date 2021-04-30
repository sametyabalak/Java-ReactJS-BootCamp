package dayTwoOOPBasics;

public class Course {
 int courseId;
 String courseName;
 String instructorName;
 
 public	Course() {
	 //default constructor 
	 System.out.println("Default Constructor çalıştı.");
 }

 	// with attribute constructor method
	public Course(int courseId, String courseName, String instructorName) {
		this.courseId = courseId;
		this.courseName = courseName;
		this.instructorName = instructorName;
	}
 
}
