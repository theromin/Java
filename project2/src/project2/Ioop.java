package project2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class Ioop {
//	String head="Name Math Java DS Average Total";
	String name=new String();
	int sc1=0;
	int sc2=0;
	int sc3=0;
	int all=0;
	int ave=0;
	
	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		final int NUM=10000; 
		PrintWriter out=new PrintWriter("score.txt");
		out.println("Name Math Java DS Average Total");
		for(int i=0;i<NUM;i++) {
			out.printf("张三%d %d %d %d 0 0\n",(int)(Math.random()*1000),
			(int)(Math.random()*101),(int)(Math.random()*101),(int)(Math.random()*101));
		}//随机生成分数
		out.close();
		System.out.println("Successful random generation");
		
		Scanner in=new Scanner(new File("score.txt"));
		in.nextLine();
		Ioop []a=new Ioop[NUM];
		int i=0;
		while(in.hasNext()){
			a[i]=new Ioop();
			a[i].name=in.next();
			a[i].sc1=in.nextInt();
			a[i].sc2=in.nextInt();
			a[i].sc3=in.nextInt();
			a[i].all=in.nextInt();
			a[i].ave=in.nextInt();
			a[i].all=a[i].sc1+a[i].sc2+a[i].sc3;
			a[i].ave=a[i].all/3;
			i++;
		}//计算分数
		in.close();
		
		PrintWriter out1=new PrintWriter("score.txt");
		out1.println("Name Math Java DS Average Total");
		for(i=0;i<NUM;i++) {
			out1.println(a[i].name+" "+a[i].sc1+" "
					+a[i].sc2+" "+a[i].sc3+" "
					+a[i].ave+" "+a[i].all);
		}//输出计算后的分数
		out1.close();
		System.out.println("Successful calculation");
		
		boolean exchange=false;
		for(i=0;i<NUM;i++) {
			exchange=false;
			for(int j=1;j<NUM-i;j++) {
				if(a[j-1].all<a[j].all) {
					Ioop temp=a[j];
					a[j]=a[j-1];
					a[j-1]=temp;
					exchange=true;
				}
			}
			if(!exchange)
				break;
		}//冒泡排序
		PrintWriter out2=new PrintWriter("first_10.txt");
		out2.println("Name Math Java DS Average Total");
		for(i=0;i<10;i++) {
			out2.println(a[i].name+" "+a[i].sc1+" "
					+a[i].sc2+" "+a[i].sc3+" "
					+a[i].ave+" "+a[i].all);
		}
		out2.close();
		System.out.println("Successful sorting");
		
		Scanner ins=new Scanner(System.in);
		System.out.print("seek input:");
		String target=new String();
		target = ins.next();
		ins.close();
		String []result;
		result = findStudent(target);
		if(result.length==0)
			System.out.println("Not found");
		for(i=0;i<result.length;i++)
			System.out.println(result[i]);
//		for(i=0;i<10;i++) {
//			System.out.println(a[i].name+" "+a[i].sc1+" "
//					+a[i].sc2+" "+a[i].sc3+" "
//					+a[i].ave+" "+a[i].all);
//		}
	}
	
	public static String[] findStudent(String name) throws FileNotFoundException {
		Scanner in=new Scanner(new File("score.txt"));
		in.nextLine();
		Ioop []a=new Ioop[10000];
		int i=0,time=0;
		while(in.hasNext()){
			a[i]=new Ioop();
			a[i].name=in.next();
			a[i].sc1=in.nextInt();
			a[i].sc2=in.nextInt();
			a[i].sc3=in.nextInt();
			a[i].all=in.nextInt();
			a[i].ave=in.nextInt();
			if(a[i].name.equals(name))
				time++;
			i++;
		}
		in.close();
		String []result=new String[time];
		int j=0;
		for(i=0;i<10000;i++) {
			if(a[i].name.equals(name)) {
				result[j++]=a[i].name+" "+a[i].sc1+" "+a[i].sc2+" "
			    +a[i].sc3+" "+a[i].ave+" "+a[i].all;
			}
		}
		return result;
	}

}
