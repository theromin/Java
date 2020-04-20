package content4;

public class Test {

	public static void main(String[] args) {
		PlainRect a = new PlainRect();
		System.out.println(a);
		System.out.println(a.getArea());
		System.out.println(a.getPerimeter());
		System.out.println("=================");
		System.out.println(a.isInside(12, 12));
		System.out.println(a.isInside(10, 10));
		System.out.println(a.isInside(5, 5));
		
		PlainRect b = new PlainRect(12, 15, 7, 8);
		System.out.println(b);
		System.out.println(b.isInside(18, 16));
	}

}
