package sec01.exam06;

public class SmartPhoneExample {
	public static void main(String[] args) {
		SmartPhone smartPhone = new SmartPhone("애플", "iOS");
		
		// toString() 오버라이딩 전후 비교
		System.out.println(smartPhone.toString());
	}
}
