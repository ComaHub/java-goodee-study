package sec01.exam03_2;

// parent class: 결제 서비스 공통 기능 -> (추상화) -> 추상 클래스: 공통 설계도
public class PaymentService {
	public void pay(int amount) {
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제 성공!");
	}
}
