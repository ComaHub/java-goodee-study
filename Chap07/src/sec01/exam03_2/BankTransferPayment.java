package sec01.exam03_2;

// child class: 계좌 이체 결제 서비스
public class BankTransferPayment extends PaymentService {
	@Override
	public void pay(int amount) {
		System.out.println("계좌이체로 결제합니다.");
		System.out.println("가상 계좌 입금 확인 중...");
		
		super.pay(amount);
	}
}
