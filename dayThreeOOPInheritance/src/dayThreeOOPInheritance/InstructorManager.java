package dayThreeOOPInheritance;

public class InstructorManager extends UserManager {

	@Override
	public void signIn(User user) {
		System.out.println("A instructor named " + user.getUserName() + " has logged in");
	}

	@Override
	public void logOut(User user) {
		System.out.println("A instructor named " + user.getUserName() + " has logged out");
	}

}
