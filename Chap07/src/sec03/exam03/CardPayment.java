package sec03.exam03;

public class CardPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 결제합니다.");
		System.out.println("결제 승인 요청 중...");
		
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제 성공!");
	}
}
