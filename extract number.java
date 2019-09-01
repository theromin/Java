/*
本题目要求读入若干个代表整数的字符串，然后将其转化为整数。

如果该数＞＝10000且＜＝20000，则依次输出其对应的二进制字符串、八进制字符串、十六进制字符串。
否则将字符串中的每个数字抽取出来，然后将所有数字加总求和。
提示：参考jdk文档的Integer,

输入样例:
123
10000
-123
314159265
输出样例:
1 2 3 6
10011100010000,23420,2710
1 2 3 6
3 1 4 1 5 9 2 6 5 36
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		while(in.hasNext())
		{
			String str=in.nextLine();
			int n=Integer.parseInt(str);
			int sum=0;
			if(n>=10000&&n<=20000)
				System.out.println(Integer.toBinaryString(n)+","+
			Integer.toOctalString(n)+','+Integer.toHexString(n));
			else
			{
				char []c=str.toCharArray();
				int a=Math.abs(n);
				while(a!=0)
				{
					sum+=a%10;
					a/=10;
				}
				for(int i=0;i<str.length();i++)
				{
					if(c[i]=='-')
						continue;
					System.out.print(c[i]-'0'+" ");
				}
				System.out.println(sum);
			}
		}
		in.close();
	}
	
}
