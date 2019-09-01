/*
本题目要求读入2个整数a和b，然后输出它们的和。

输入格式:
输入在一行中给出2个绝对值不超过1000的整数a和b。
输出格式:
对每一组输入，如果a>1000，输出a<=1000，否则输出a+b的值。

输入样例:
18 -299
1001 -9
输出样例:
-281
a<=1000
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int a,b;
		while(in.hasNextInt()){
			a=in.nextInt();
			b=in.nextInt();
			if(a>1000)
				System.out.println("a<=1000");
			else
				System.out.println(a+b);
		}
	}

}
