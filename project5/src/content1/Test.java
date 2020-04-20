package content1;

import java.util.ArrayList;
import java.util.Collections;

public class Test {

	public static void main(String[] args) {
		ArrayList<Geometry> a = new ArrayList<Geometry>();
		Cuboid a1=new Cuboid(10,10,10);
		a.add(a1);//a0
		Cuboid a2=new Cuboid(12.3,10.5,7.8);
		a.add(a2);//a1
		
		Spheroid b1=new Spheroid(10);
		a.add(b1);//a2
		Spheroid b2=new Spheroid(7.8);
		a.add(b2);//a3
		
		Cone c1 = new Cone(10,6);
		Cone c=new Cone(10,6);
//		System.out.println(c.equals(c1));
		
		a.add(c1);//a4
		a.add(c);//a5
//		System.out.println(a.get(4).equals(a.get(5)));
		
		Cone c2 = new Cone(7,8);
		a.add(c2);
		
		display(a);
		System.out.println("===========================");
		Collections.sort(a);
		display(a);
		System.out.println("===========================");
//		double surSum=0,volSum=0;
//		for(Geometry x:a) {
//			surSum+=x.getSurfaceArea();
//			volSum+=x.getVolume();
//			System.out.println(x+" "+x.getSurfaceArea());
//		}
		Collections.sort(a,new SurfaceComparator());
		display(a);
		
//		System.out.println(surSum+","+volSum);
		
	}
	
	public static void display(ArrayList<Geometry> a) {
		for(Geometry x:a)
			System.out.println(x+" "+x.getSurfaceArea());
	}

}
