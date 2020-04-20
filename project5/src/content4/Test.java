package content4;

public class Test {

	public static void main(String[] args) {
		CurrencyUnit s = CurrencyUnit.EUR;
		if(s == CurrencyUnit.CNY) {
			System.out.println("Yes");
		}
		else System.out.println(s.getName());
		
		Country c = Country.EUROPE;
		if(c==Country.CHINA)
			System.out.println("Yes");
		else
			System.out.println(c);
		
	}

}
