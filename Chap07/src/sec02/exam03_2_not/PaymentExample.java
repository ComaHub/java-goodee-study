package sec02.exam03_2_not;

public class PaymentExample {
	public static void main(String[] args) {
		
		PaymentService payServ = new PaymentService();
		
		payServ.pay("Card", 50000);
		System.out.println();
		
		payServ.pay("Paypal", 30000);
		System.out.println();
		
		payServ.pay("Bank", 150000);
	}
}
