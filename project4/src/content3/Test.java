package content3;

public class Test {

	public static void main(String[] args) {
		Account []a=new Account[4];
		a[0]=new CheckingAccount("Xiaoming", 500, "2016-5-13 14:56:23", 1000);
		System.out.println(a[0]);
		
		System.out.println("deposit 100:"+a[0].deposit(100));
		System.out.println(a[0]);
		
		System.out.println("withdraw 234:"+a[0].withdraw(234));
		System.out.println(a[0]);
		
		System.out.println("withdraw 1000:"+a[0].withdraw(1000));
		System.out.println(a[0]);
		
		System.out.println("withdraw 900:"+a[0].withdraw(900));
		System.out.println(a[0]);
		
		System.out.println("=============");
		
		a[1]=new SavingAccount("Rem",400,"2017-3-12 13:45:21");
		System.out.println(a[1]);
		
		a[2]=new CheckingAccount("Monika",200,"2019-8-23 23:46:43",200);
		a[3]=new SavingAccount("Lara",700,"2010-4-12 7:34:24");
		
		System.out.println("=============");
		for(Account x:a) {
			System.out.println(x);
		}
		
	}
	
	

}
