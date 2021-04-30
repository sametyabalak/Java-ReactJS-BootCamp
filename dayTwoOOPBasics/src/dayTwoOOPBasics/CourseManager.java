package dayTwoOOPBasics;

public class CourseManager {
	public void addToBasket(Course course) {
		System.out.println("The product with an ID of " + course.courseId + " has been added to the basket.");
	}

	public void deleteFromBasket(Course course) {
		System.out.println("The product with an ID of " + course.courseId + " has been deleted from the basket.");
	}
}
