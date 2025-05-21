package homework.homework10;

public class Bank {
	void transfer(Account sender, Account receiver, int amount) {
		sender.withdraw(amount);
		receiver.deposit(amount);
	}
}
