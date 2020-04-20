package content2;

import java.util.Date;

public class Staff {
	//�����������(name, address, age, sex, salary, dateHired)��
	//�����Զ�������salaryΪ���ʣ�dateHiredΪ��Ӷ����(java.util.Date����)��
	private String name;
	private String address;
	private int age;
	private String sex;
	private double salary;
	private Date dateHired;
	
	public Staff() {
		this.name = null;
		this.address = null;
		this.age = 0;
		this.sex = "male";
		this.salary = 0;
		this.dateHired = new Date();
	}
	
	public Staff(String name, String address, int age, String sex, double salary, Date dateHired) {
		super();
		this.name = name;
		this.address = address;
		this.age = age;
		this.sex = sex;
		this.salary = salary;
		this.dateHired = dateHired;
	}
	
	//getter,setter methods
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	public Date getDateHired() {
		return dateHired;
	}
	public void setDateHired(Date dateHired) {
		this.dateHired = dateHired;
	}

	@Override
	public String toString() {
		return "Staff [name=" + name + ", address=" + address + ", age=" + age + ", sex=" + sex + ", salary=" + salary
				+ ", dateHired=" + dateHired + "]";
	}
	
}
