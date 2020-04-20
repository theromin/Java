package content3;

public class CheckingAccount extends Account{
	private double overdraft;
	private double left;
	
	public CheckingAccount() {
		super();
		this.overdraft=0;
		this.left = 0;
	}
	
	public CheckingAccount(String name,double balance,String openDate,double overdraft) {
		super(name,balance,openDate);
		this.overdraft=overdraft;
		this.left = overdraft;
	}
	

	@Override
	public boolean withdraw(double n) {
		if(super.getBalance()+this.left<n)return false;
		if(super.getBalance()>=n) {
			super.withdraw(n);
			return true;
		}
		this.left-=n-super.getBalance();
		super.setBalance(0);
		
		return true;
//		if(this.left>n) {
//			this.left-=n;
//			return true;
//		}
//		super.withdraw(n-this.left);
//		this.left=0;
//		return true;
	}

	@Override
	public boolean deposit(double n) {
		if(this.left<this.overdraft) {
			this.left+=n;
		}
		if(this.left>this.overdraft) {
			n=this.left-this.overdraft;
			this.left=this.overdraft;
		}
		return super.deposit(n);
	}

	public double getOverdraft() {
		return overdraft;
	}

	public void setOverdraft(double overdraft) {
		this.overdraft = overdraft;
	}

	public double getLeft() {
		return left;
	}

	public void setLeft(double left) {
		this.left = left;
	}

	@Override
	public String toString() {
		return "CheckingAccount [name=" + super.getName() + ", balance=" + super.getBalance() + ", openDate=" + super.getOpenDate() + ", overdraft=" + overdraft + ", left=" + left + "]";
	}
	
	
}
