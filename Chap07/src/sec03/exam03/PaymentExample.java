package sec03.exam03;

public class PaymentExample {
	public static void main(String[] args) {
		PaymentService payServ;
		
		payServ = new CardPayment();
		payServ.pay(50000);
		System.out.println();
		
		payServ = new PaypalPayment();
		payServ.pay(30000);
		System.out.println();
		
		payServ = new BankTransferPayment();
		payServ.pay(150000);
	}
}
