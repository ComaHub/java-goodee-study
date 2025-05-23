package sec01.exam03_2;

// child class: 신용카드 결제 서비스
public class CardPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("신용카드로 결제합니다.");
		System.out.println("결제 승인 요청 중...");
		
		super.pay(amount);
	}
}
