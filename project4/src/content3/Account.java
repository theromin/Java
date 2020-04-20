package content3;

public class Account {
	//�����ʻ������������ʡ��������ڵȳ�Ա��ͬʱAccount��ӵ�д��(deposit)��ȡ��(withdraw)��������
	private String name;
	private double balance;
	private String openDate;
	
	public Account() {
		this.name=null;
		this.balance=0;
		this.openDate=null;
		
	}
	
	public Account(String name,double balance,String openDate) {
		this.name=name;
		this.balance=balance;
		this.openDate=openDate;
		
	}

	public boolean deposit(double n) {
		this.balance+=n;
		return true;
	}
	
	public boolean withdraw(double n) {
		if(this.balance<n)return false;
		this.balance-=n;
		return true;
	}
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public String getOpenDate() {
		return openDate;
	}

	public void setOpenDate(String openDate) {
		this.openDate = openDate;
	}

	@Override
	public String toString() {
		return "Account [name=" + name + ", balance=" + balance + ", openDate=" + openDate + "]";
	}
	
	
}
