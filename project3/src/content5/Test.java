package content5;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("please input a,b,c:");
		double a,b,c;
		a=in.nextDouble();
		b=in.nextDouble();
		c=in.nextDouble();
		QuadraticEquation q = new QuadraticEquation(a, b, c);
		System.out.println("Discriminant:"+q.getDiscriminant());
		if(q.getDiscriminant()<0)
			System.out.println("The equation has no roots.");
		else if(q.getDiscriminant()==0)
			System.out.println(q.getRoot1());
		else
			System.out.println(q.getRoot1()+" "+q.getRoot2());
	}

}
