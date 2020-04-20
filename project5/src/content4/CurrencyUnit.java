package content4;

public enum CurrencyUnit {
	//美元、英镑、欧元、人民币、日元
	RMB("人民币"),CNY("人民币"),USD("美元"),JPY("日元"),EUR("欧元"),GBP("英镑");
	
	private String name = "default";
	
	private CurrencyUnit(String name) {
		this.name=name;
	}
	
	public String getName() {
		return this.name;
	}
	
	@Override
	public String toString() {
		return this.name;
	}
}
