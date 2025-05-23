package sec01.exam03_2;

// child class: 페이팔 결제 서비스
public class PaypalPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("Paypal을 통해 결제합니다.");
		System.out.println("Paypal 서버와 연결 중...");
		
		super.pay(amount);
	}
}
