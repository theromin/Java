package content3;

public class SavingAccount extends Account {
	public SavingAccount() {
		super();
	}
	
	public SavingAccount(String name, double balance, String openDate) {
		super(name,balance,openDate);
	}

	@Override
	public String toString() {
		return "SavingAccount [name=" + super.getName() + ", balance=" + super.getBalance() + ", openDate=" + super.getOpenDate() + "]";
	}
	
	
}
