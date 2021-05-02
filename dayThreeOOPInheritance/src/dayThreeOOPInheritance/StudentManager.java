package dayThreeOOPInheritance;

public class StudentManager extends UserManager {

	@Override
	public void signIn(User user) {
		System.out.println("A student named " + user.getUserName() + " has logged in");
	}

	@Override
	public void logOut(User user) {
		System.out.println("A student named " + user.getUserName() + " has logged out");
	}

}
