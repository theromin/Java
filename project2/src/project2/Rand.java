package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Rand {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		int n=0;
		Scanner in=new Scanner(System.in);
		n=in.nextInt();
		in.close();
//		write();
//		test_hasnext();
		random_math(n);
		random_char(n);
		count_char();
	}
	
	public static void test_hasnext() {
		Scanner in=new Scanner(System.in);
		while(in.hasNext()) {
			System.out.println(in.next());
		}
		in.close();
	}
	
	public static void write() throws FileNotFoundException {
		PrintWriter out = new PrintWriter("myfile.txt");
		out.println("Name Math Java DS Average Total");
		out.println("张三 20 30 40 0 0");
		out.println("李四 50 60 70 0 0");
		out.close();//输出完毕，需要close
	}
	
	public static void count_char() throws FileNotFoundException {
		Scanner in=new Scanner(new File("String.txt"));
		int []c= new int[26];
		String temp;
		int n=0;
		while(in.hasNext()){
			temp=in.next();
			for(int i=0;i<temp.length();i++) {
				if(temp.charAt(i)>='a'&&temp.charAt(i)<='z') {
					c[temp.charAt(i)-97]++;
					n++;
				}
				else if(temp.charAt(i)>='A'&&temp.charAt(i)<='Z') {	
					c[temp.charAt(i)-65]++;
					n++;
				}
			}
		}
		out_char_percent(c,n);
		in.close();
	}
	public static void out_char_percent(int []a,int n) {
		for(int i=0;i<a.length;i++){
			System.out.printf("%c:%.2f%% ",i+97,(double)a[i]/n*100);
//			System.out.print((char)(i+97)+":"+(double)c[i]/n*100+"% ");
			if((i+1)%6==0)
				System.out.println("");
		}
		System.out.println("");
	}
	
	public static void random_char(int n) {
		char[] a = new char[n];
		int[] c = new int[26];
		for(int i=0;i<n;i++) {
			a[i] = (char)(('a'+Math.random()*('z'-'a'+1)));
			c[a[i]-97]++;
		}
		out_char_percent(c,n);
	}

	public static void random_math(int n) {
		double temp;
		int[] a = new int[n];
		int sum = 0;
		for (int i = 0; i < n; i++) {
			temp = Math.random();
			a[i] = 1000 + (int) (temp * 1000);
			if (a[i] > 1500)
				sum++;
		}
		System.out.println((double)sum/n*100+"% "+(100-(double)sum/n*100)+"%");
		
	}
	
}
