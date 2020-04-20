package content1;

import java.io.Serializable;

public class Student implements Serializable{
	private int id;
	private String name;
	private int age;
	private double grade;
	
	public Student() {
		this.id=0;
		this.name="";
		this.age = 18;
		this.grade = 0;
	}
	
	public Student(int id,String name, int age, double grade) {
		this.id=id;
		this.name=name;
		this.age = age;
		this.grade = grade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public double getGrade() {
		return grade;
	}

	public void setGrade(double grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return this.getId()+" "+this.getName()+" "+this.getAge()+" "+this.getGrade();
	}
	
	
}
