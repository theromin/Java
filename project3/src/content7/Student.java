package content7;

public class Student {
	private String name;
	private int math;
	private int java;
	private int ds;
	private int total;
	private int average;
	
	public Student (String name,int math,int java ,int ds) {
		this.name=name;
		this.math=math;
		this.java=java;
		this.ds=ds;
		
	}
	
	public Student(String name,int math,int java,int ds,int total,int average) {
		this.name=name;
		this.math=math;
		this.java=java;
		this.ds=ds;
		this.total=total;
		this.average=average;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

	public int getJava() {
		return java;
	}

	public void setJava(int java) {
		this.java = java;
	}

	public int getDs() {
		return ds;
	}

	public void setDs(int ds) {
		this.ds = ds;
	}

	public int getTotal() {
		return total;
	}

	public void setTotal() {
		this.total = this.math+this.java+this.ds;
	}

	public int getAverage() {
		return average;
	}

	public void setAverage() {
		this.average = (this.math+this.java+this.ds)/3;
	}

	@Override
	public String toString() {
		return "name:" + name + ", math:"+math+", java:"+java
				+", ds:"+ds+", total:"+total+ ", average:"+average;
	}
	
	
}
