package dayThreeOOPInheritance;

public class Main {

	public static void main(String[] args) {

		// An instance has been created from the base user class.
		User baseUsr = new User();
		baseUsr.setUserName("Base");
		baseUsr.setAge(0);
		baseUsr.setUID(0);
		baseUsr.setUserSurname("User");

		// an instance has been created Student from inherited user class
		Student student = new Student();
		student.setUserName("Samet");
		student.setUserSurname("Yabalak");
		student.setAge(24);
		student.setUID(1);
		// only access from student class
		student.setResigsteredCourse("Java & React BootCamp");

		// an instance has been created Instructor from inherited user class
		Instructor instructor = new Instructor();
		instructor.setUserName("Engin");
		instructor.setUserSurname("Demirog");
		instructor.setAge(35);
		instructor.setUID(2);
		// only access from instructor class
		instructor.setProfession("Backend&Frontend Technologies");

		UserManager userManager = new UserManager();
		
		//user manager sign in function run
		userManager.signIn(baseUsr);
		
		//student manager sign in function run
		userManager.signIn(student);
		
		//instructor manager sign in function run
		userManager.signIn(instructor);
		
		User[] users = {baseUsr,student,instructor};
		
		//getAllUsers from userManager class
		userManager.getAllUsers(users);
		
		
	}

}
