package content2;

import java.util.Date;

public class SecurityGuard extends Staff {
	//包含属性：skills(专技), dangerousAllowance(高危津贴)。
	private String skills;
	private double dangerousAllowance;
	public SecurityGuard() {
		super();
		this.skills=null;
		this.dangerousAllowance=0;
		
	}
	
	public SecurityGuard(String name, String address, int age, String sex, double salary, Date dateHired,String skills,double dangerousAllowance) {
		super(name, address, age, sex, salary, dateHired);
		this.setSkills(skills);
		this.setDangerousAllowance(dangerousAllowance);
		
	}
	
	public String getSkills() {
		return skills;
	}
	public void setSkills(String skills) {
		this.skills = skills;
	}
	public double getDangerousAllowance() {
		return dangerousAllowance;
	}
	public void setDangerousAllowance(double dangerousAllowance) {
		this.dangerousAllowance = dangerousAllowance;
	}
	
	@Override
	public String toString() {
		return "SecurityGuard [name=" + super.getName() + ", address=" + super.getAddress() 
				+ ", age=" + super.getAge() + ", sex=" + super.getSex() + ", salary=" 
				+ super.getSalary()	+ ", dateHired=" + super.getDateHired() 
				+ ", skills=" + this.skills + ", dangerousAllowance="+ this.dangerousAllowance + "]";
	}
}
