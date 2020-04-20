package content1;

public class Student {
	private String name;
	private String sex;
	private int age;
	private int id;
	private static int count=0;
	public Student(){
		this.name = "";
		this.sex = "male";
		this.age = 0;
		this.id=++count;
	}
	
	public Student(String name , int age) {
		this.name=name;
		this.age=age;
		this.sex = "male";
		this.id=++count;
	}
	
	public Student(String name , int age , String sex) {
		this.name = name;
		this.age = age;
		this.sex = sex;
		this.id = ++count;
	}
	@Override
	public String toString() {
		return "name:" + name + ", sex:" + sex + ", age:" + age + ", id:" + id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getId() {
		return id;
	}

//	public void setId(int id) {
//		this.id = id;
//	}
	
	
}
