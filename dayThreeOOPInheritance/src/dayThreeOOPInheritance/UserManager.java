package dayThreeOOPInheritance;

public class UserManager {

	public void signIn(User user) {
		System.out.println(user.getUserName() + " user logged in");
	}

	public void logOut(User user) {
		System.out.println(user.getUserName() + " user logged out");
	}

	public void getAllUsers(User[] users) {
		for (User user : users) {
			System.out.println(user.getUserName() + ' ' + user.getUserSurname());
		}
	}
}
