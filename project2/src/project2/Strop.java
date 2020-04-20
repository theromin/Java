package project2;

import java.util.Arrays;
import java.util.Scanner;

public class Strop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a[]=new String[100];
		Scanner in=new Scanner(System.in);
		int i=0;
		while(in.hasNext()) {
 			a[i]=getBirthDate(in.next());
			System.out.println(a[i++]);
		}
		in.close();
		Arrays.sort(a,0,i);
		System.out.println("sorted:");
		for(int j=0;j<i;j++) {
			System.out.println(a[j]);
		}
	}
	public static String getBirthDate(String id) {
		String a= new String();
		a=id.substring(6, 10)+"-"+id.substring(10,12)+"-"+id.substring(12,14);
		return a;
	}
}
