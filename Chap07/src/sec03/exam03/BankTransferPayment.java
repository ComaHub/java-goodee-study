package sec03.exam03;

public class BankTransferPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("계좌이체로 결제합니다.");
		System.out.println("가상 계좌 입금 확인 중...");
		
		System.out.println("결제 금액: " + amount + "원");
		System.out.println("결제 성공!");
	}
}
