package content4;

public enum CurrencyUnit {
	//��Ԫ��Ӣ����ŷԪ������ҡ���Ԫ
	RMB("�����"),CNY("�����"),USD("��Ԫ"),JPY("��Ԫ"),EUR("ŷԪ"),GBP("Ӣ��");
	
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
