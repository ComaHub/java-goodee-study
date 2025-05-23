package sec03.exam03;

public class PaypalPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("Paypal을 통해 결제합니다.");
		System.out.println("Paypal 서버와 연결 중...");
		
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제 성공!");
	}
}
