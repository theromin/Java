package content3;

import java.util.Date;

public class Teacher extends Staff {
	//�������ԣ�department(ϵ), speciality(רҵ), postAllowance(��λ����)��
	private String department;
	private String speciality;
	private double postAllowance;
	
	public Teacher() {
		super();
		this.department=null;
		this.speciality=null;
		this.postAllowance=0;
	}
	
	public Teacher(String name, String address, int age, String sex, double salary, Date dateHired,String department,String speciality,double postAllowance) {
		super(name, address, age, sex, salary, dateHired);
		this.setDepartment(department);
		this.setSpeciality(speciality);
		this.setPostAllowance(postAllowance);
	}
	
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getSpeciality() {
		return speciality;
	}
	public void setSpeciality(String speciality) {
		this.speciality = speciality;
	}
	public double getPostAllowance() {
		return postAllowance;
	}
	public void setPostAllowance(double postAllowance) {
		this.postAllowance = postAllowance;
	}
	
	@Override
	public double getSalary() {
		// TODO Auto-generated method stub
		return super.getSalary()+this.postAllowance;
	}
	
	@Override
	public String toString() {
		return "Teacher[name="+super.getName()+",age="+super.getAge()+",sex="
				+super.getSex()+",salary="+this.getSalary()+"]";
	}
}
