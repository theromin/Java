package content7;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;


public class Main {
	final static int NUM=10000;
	final static String FILENAME="student.txt";
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		randData(NUM);
		String []temp=readStudentsFromFile(FILENAME);
		Student []stu=makeStudentFromString(temp);
		sortAverage(stu);
		outputStudentData(stu);
		
	}
	
	public static void randData(int n) throws FileNotFoundException {
		PrintWriter out=new PrintWriter(FILENAME);
		for(int i=0;i<n;i++) {
			out.printf("张三%d %d %d %d 0 0\n",(int)(Math.random()*1000),
			(int)(Math.random()*101),(int)(Math.random()*101),(int)(Math.random()*101));
		}
		out.close();
		System.out.println("Successful random generation");
	}//随机生成分数

	public static String[] readStudentsFromFile(String fileName) throws FileNotFoundException {
		String []a=new String[NUM];
		Scanner in=new Scanner(new File(fileName));
		int i=0;
		while(in.hasNext()) {
			a[i++]=in.nextLine();
		}
		in.close();
		System.out.println("Successful read student from file");
		return a;
	}
	
	public static Student[] makeStudentFromString(String[] students) {
		Student []a=new Student[NUM];
		for(int i=0;i<students.length;i++) {
			Scanner in = new Scanner(students[i]);
			in.useDelimiter(" ");//使用空格作为分隔符
			String name = in.next();
			String math = in.next();
			String java = in.next();
			String ds = in.next();
			String avg = in.next();
			String total = in.next();
			a[i]=new Student(name,Integer.valueOf(math),
					Integer.valueOf(java),Integer.valueOf(ds));
			a[i].setAverage();
			a[i].setTotal();
			in.close();
		}
		System.out.println("Successful make student from string");
		return a;
	}
	
	public static void outputStudentData(Student []student) {
		for(int i=0;i<student.length;i++) {
			System.out.println(student[i].toString());
			if(i>10)break;
		}
	}
	
	public static void sortAverage(Student []student) {
		boolean exchange=false;
		for(int i=0;i<NUM;i++) {
			exchange=false;
			for(int j=1;j<NUM-i;j++) {
				if(student[j-1].getAverage()<student[j].getAverage()) {
					Student temp=student[j];
					student[j]=student[j-1];
					student[j-1]=temp;
					exchange=true;
				}
			}
			if(!exchange)
				break;
		}//冒泡排序
		System.out.println("Successful sorted");
	}
	
	
}
