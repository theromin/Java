package content4;

public enum Country{
	CHINA("中国",CurrencyUnit.CNY),AMERICA("美国",CurrencyUnit.USD),
	JAPAN("日本",CurrencyUnit.JPY),EUROPE("欧洲",CurrencyUnit.EUR),
	ENGLAND("英国",CurrencyUnit.GBP);
	
	private String name = "default";
	private CurrencyUnit cu = CurrencyUnit.CNY;
	
	private Country(String name,CurrencyUnit cu) {
		this.name=name;
		this.cu = cu;
	}
	
	public String getName() {
		return this.name;
	}
	
	public CurrencyUnit getCu() {
		return this.cu;
	}
	
	@Override
	public String toString() {
		return this.name+" "+this.cu;
	}
}
