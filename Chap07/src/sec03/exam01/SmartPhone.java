package sec03.exam01;

// 실체 클래스
public class SmartPhone extends Phone {
	public SmartPhone(String owner) {
		super(owner);
	}
	
	public void searchInternet() {
		System.out.println("인터넷을 검색합니다.");
	}
}
