package content2;

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
	public String toString() {
		return "Dean [name=" + super.getName() + ", address=" + super.getAddress() 
				+ ", age=" + super.getAge() + ", sex=" + super.getSex() + ", salary=" 
				+ super.getSalary()	+ ", dateHired=" + super.getDateHired() 
				+ ", department=" + super.getDepartment() + ", speciality=" + super.getSpeciality() 
				+ ", postAllowance=" + super.getPostAllowance() + "adminAward=" + this.adminAward + "]";
	}
}
