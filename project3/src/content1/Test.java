package content1;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student a = new Student();
		System.out.println(a.getId());
		Student b= new Student();
		System.out.println(b.getId());
		System.out.println(a.toString());
		a.setAge(20);
		a.setName("Tom");
		a.setSex("female");
		System.out.println(a.toString());
		Student c = new Student("Jerry",18,"male");
		System.out.println(c.toString());
	}

}
