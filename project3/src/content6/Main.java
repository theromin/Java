package content6;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Matrix m = generate(4,4);
		System.out.println("m:");
		m.display();
		System.out.println();
		
		Matrix n = generate(4,4);
		System.out.println("n:");
		n.display();
		System.out.println();
		
		Matrix result;
		
		result=m.add(n);
		System.out.println("add:");
		result.display();
		System.out.println();
		
		result=m.minus(n);
		System.out.println("minus:");
		result.display();
		System.out.println();
		
		result=m.multiple(n);
		System.out.println("multiple:");
		result.display();
		System.out.println();
		
		result=m.transposition();
		System.out.println("transposition:");
		result.display();
		System.out.println();
		
	}
	
	public static Matrix generate(int m,int n) {
		Matrix a=new Matrix(m, n);
		for(int i=0;i<a.getRow();i++) {
			for(int j=0;j<a.getCols();j++) {
				a.setElement(i,j,Math.random()*100);
			}
		}
		return a;
	}

}
