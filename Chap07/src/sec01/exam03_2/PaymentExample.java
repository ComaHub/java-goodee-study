package sec01.exam03_2;

public class PaymentExample {
	public static void main(String[] args) {
		// CardPayment cardPayment = new CardPayment();
		// cardPayment.pay(50000);
		
		PaymentService payServ;
		
		// 부모 클래스 변수에 자식 객체를 생성 후 대입 (Upcasting)
		payServ = new CardPayment(); // 카드 결제
		payServ.pay(50000);
		System.out.println();
		
		payServ = new PaypalPayment(); // 페이팔 결제
		payServ.pay(30000);
		System.out.println();
		
		payServ = new BankTransferPayment(); // 계좌 이체
		payServ.pay(150000);
	}
	
	// 중요: overriding은 다형성을 구현하는 핵심 개념 중 하나
	// 다형성을 활용하면 부모 타입을 참조해도 실제 동작은 자식에서 재정의된 메소드가 실행됨
	// 새로운 결제 수단이 추가되어도 기존 코드의 구조를 수정하지 않고 부모 클래스를 상속한 새 결제 수단 클래스에 pay()만 재정의하면 됨
}
