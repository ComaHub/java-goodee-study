package sec02.exam06;

public class UserSeviceExample {
	public static void main(String[] args) {
		UserService service = new UserService();
		
		try {
			service.registerUser(10);
			service.registerUser(-5);
		} catch (InvalidAgeException e) { // e: 예외 객체
			System.out.println(e.getMessage());
		}
	}
}
