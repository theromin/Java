package content2;

import java.util.Arrays;
import java.util.Date;

public class Test {
	private final static int N = 7;
	
	public static void main(String[] args) {

		Staff[]a = new Staff[N];
		a[0]=new Dean("Xiaoming", "Jimei", 20, "male", 5000, new Date(), 
				"Computer", "CS", 500,300);
		a[1]=new Teacher("Firekeeper", "TsingHua", 20, "female", 3200, new Date(), 
				"Computer", "Software", 500);
		a[2]=new Teacher("Monika", "Jimei", 17, "female", 3600, new Date(), 
				"Computer", "AI", 500);
		a[3]=new Teacher("Rem", "Jimei", 16, "female", 4300, new Date(), 
				"Art", "draw", 500);
		a[4]=new Teacher("Lara", "Jimei", 18, "female", 3000, new Date(), 
				"Faculty", "History", 500);
		a[5]=new SecurityGuard("Geralt", "Jimei", 35,"male",3200, 
				new Date(),"catching ghosts",800);
		a[6]=new SecurityGuard("Monika","Fujian",12,"female",4000,
				new Date(),"playing",300);
		printAll(a);
		System.out.println("sort by name:");
		Arrays.sort(a,new NameComparator());
		printAll(a);
		System.out.println("sort by salary:");
		Arrays.sort(a, new SalaryComparator());
		printAll(a);
		System.out.println("sort by age:");
		Arrays.sort(a,new AgeComparator());
		printAll(a);
		System.out.println("sort by complex:");
		Arrays.sort(a,new ComplexComparator());
		printAll(a);
	}
	
	private static void printAll(Staff[] persons) {
		for(Staff x:persons) {
//			if(x==null)break;
			System.out.println(x);
		}
	}
//	private static void printName(Staff[] persons) {
//		for(Staff x:persons) {
//			System.out.println(x.getName());
//		}
//	}
//	private static void printSalary(Staff[] staffs) {
//		for(Staff x:staffs) {
//			System.out.println(x.getSalary());
//		}
//	}
}
