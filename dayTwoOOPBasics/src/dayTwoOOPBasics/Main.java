package dayTwoOOPBasics;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// default constructor instance
		Course firstCourse = new Course();
		firstCourse.courseId = 1;
		firstCourse.courseName = "Java & React Bootcamp";
		firstCourse.instructorName = "Engin Demirog";

		// constructor with parameters
		Course secondCourse = new Course(2, "C# BootCamp", "Engin Demirog");

		Course[] courses = { firstCourse, secondCourse };

		
		//list of the courses and listing properties
		for (Course course : courses) {
			System.out.println(course.courseName + "\n" + course.instructorName + "\n---");
		}
		
		CourseManager courseManager = new CourseManager();

		// business class methods
		courseManager.addToBasket(firstCourse);
		courseManager.deleteFromBasket(firstCourse);
	}

}
