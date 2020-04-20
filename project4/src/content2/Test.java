package content2;

import java.util.Date;

public class Test {
	private final static int N = 6;
	
	public static void main(String[] args) {

		Staff[]a = new Staff[N];
		a[0]=new Dean("Xiaoming", "Jimei", 20, "male", 5000, new Date(), 
				"Computer", "CS", 500,300);
//		System.out.println(a[0].getDateHired());
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
		
		
		printName(a);
		printSalary(a);
		System.out.println("=================");
		sortBySalary(a);
		printAll(a);
		
		System.out.println("=================");
		sortByAge(a);
		printAll(a);
		
		System.out.println("=================");
		sortByName(a);
		printAll(a);
	}
	
	private static void printAll(Staff[] persons) {
		for(Staff x:persons) {
//			if(x==null)break;
			System.out.println(x);
		}
	}
	
	private static void printName(Staff[] persons) {
		for(Staff x:persons) {
//			if(x==null)break;
			System.out.println(x.getName());
		}
	}
	
	private static void printSalary(Staff[] staffs) {
		for(Staff x:staffs) {
//			if(x==null)break;
			if(x instanceof Dean) {
				Dean k = (Dean)x;
				System.out.println(k.getSalary()+k.getAdminAward()+k.getPostAllowance());
			}
			else if(x instanceof Teacher) {
				Teacher k=(Teacher)x;
				System.out.println(k.getSalary()+k.getPostAllowance());
			}
			else if(x instanceof SecurityGuard) {
				SecurityGuard k=(SecurityGuard)x;
				System.out.println(k.getSalary()+k.getDangerousAllowance());
			}
		}
		
	}
	
	private static void sortBySalary(Staff[] staffs) {
		
		double a[]=new double[N];
		for(int i=0;i<staffs.length;i++) {
			if(staffs[i] instanceof Dean) {
				Dean k = (Dean)staffs[i];
				a[i]=k.getSalary()+k.getAdminAward()+k.getPostAllowance();
			}
			else if(staffs[i] instanceof Teacher) {
				Teacher k=(Teacher)staffs[i];
				a[i]=k.getSalary()+k.getPostAllowance();
			}
			else if(staffs[i] instanceof SecurityGuard) {
				SecurityGuard k=(SecurityGuard)staffs[i];
				a[i] = k.getSalary()+k.getDangerousAllowance();
			}
		}
		
		for(int i=0;i<a.length ;i++) {
			boolean exchange=false;
			for(int j = 1;j<a.length-i;j++) {
				if(a[j-1]>a[j]) {
					double temp=a[j-1];
					a[j-1]=a[j];
					a[j]=temp;
					Staff temps=staffs[j-1];
					staffs[j-1]=staffs[j];
					staffs[j]=temps;
					exchange=true;
				}
			}
			
			if(exchange==false)break;
		}
		
	}
	
	private static void sortByAge(Staff[] staffs) {
		for(int i=0;i<staffs.length ;i++) {
			boolean exchange=false;
			for(int j = 1;j<staffs.length-i;j++) {
				if(staffs[j-1].getAge()>staffs[j].getAge()) {
					Staff temps=staffs[j-1];
					staffs[j-1]=staffs[j];
					staffs[j]=temps;
					exchange=true;
				}
			}
			if(exchange==false)break;
		}
	}
	
	private static void sortByName(Staff[] staffs) {
		for(int i=0;i<staffs.length ;i++) {
			boolean exchange=false;
			for(int j = 1;j<staffs.length-i;j++) {
				if(staffs[j-1].getName().compareTo(staffs[j].getName())>0) {
					Staff temps=staffs[j-1];
					staffs[j-1]=staffs[j];
					staffs[j]=temps;
					exchange=true;
				}
			}
			if(exchange==false)break;
		}
	}
	
	
}
