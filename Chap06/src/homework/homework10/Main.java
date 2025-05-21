package homework.homework10;

public class Main {
	public static void main(String[] args) {
		Account account1 = new Account("123-456-789", 100000);
		Account account2 = new Account("987-654-321", 50000);
		
		account1.withdraw(30000);
		account2.deposit(100000);
		
		Bank bank = new Bank();
		bank.transfer(account1, account2, 50000);
		
		System.out.println("계좌번호: " + account1.getAccountNumber() + ", 잔액: " + account1.getBalance());
		System.out.println("계좌번호: " + account2.getAccountNumber() + ", 잔액: " + account2.getBalance());
	}
}
