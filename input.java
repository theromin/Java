/*
对输入的若干行（每行以空格或者多个空格）数字字符串求和并输出。

输入格式:
每行包含两个数字字符串，中间以一个或者多个空格分隔。
输出格式:
输出两个数的和

输入样例:
1     1
2   3
-100 100
-100   -100
 10   0

输出样例:
在这里给出相应的输出。例如：
2
5
0
-200
10
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
			System.out.println(a+b);
		}
	}

}
