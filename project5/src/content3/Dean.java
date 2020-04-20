package content3;

import java.util.Date;

public class Dean extends Teacher {
	private double adminAward;

	public Dean() {
		super();
		this.adminAward=0;
		
	}

	public Dean(String name, String address, int age, String sex, double salary, Date dateHired, String department,
			String speciality, double postAllowance,double adminAward) {
		super(name, address, age, sex, salary, dateHired, department, speciality, postAllowance);
		this.setAdminAward(adminAward);
		
	}

	public double getAdminAward() {
		return adminAward;
	}

	public void setAdminAward(double adminAward) {
		this.adminAward = adminAward;
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+this.adminAward;
	}
	
	@Override
	public String toString() {
		return "Dean[name="+super.getName()+",age="+super.getAge()
				+",sex="+super.getSex()+",salary="+this.getSalary()+"]";
	}
}
