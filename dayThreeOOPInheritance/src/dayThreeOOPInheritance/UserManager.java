package dayThreeOOPInheritance;

public class UserManager {

	public void signIn(User user) {
		System.out.println(user.getUserName() + " user logged in");
	}

	public void signUp(User user) {
		System.out.println(user.getUserName() + " user logged out");
	}
}
