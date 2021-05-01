package dayThreeOOPInheritance;

public class InstructorManager extends UserManager {

	@Override
	public void signIn(User user) {
		System.out.println("A instructor named " + user.getUserName() + " has logged in");
	}

	@Override
	public void signUp(User user) {
		System.out.println("A instructor named " + user.getUserName() + " has logged out");
	}

}
