package content4;

public enum Country{
	CHINA("�й�",CurrencyUnit.CNY),AMERICA("����",CurrencyUnit.USD),
	JAPAN("�ձ�",CurrencyUnit.JPY),EUROPE("ŷ��",CurrencyUnit.EUR),
	ENGLAND("Ӣ��",CurrencyUnit.GBP);
	
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
