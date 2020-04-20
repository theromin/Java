package content1;

import java.util.Arrays;
import java.util.Scanner;

public class ExceptionHandle {
	
	public static void main(String[] args) {
		int[] x = new int[3];
		Scanner inputScan = new Scanner(System.in);
		for(int i = 0; i < x.length;i++){
			System.out.println("Please input the "+(i+1)+" integer:");
			boolean yes = false;
			while(!yes) {
				try {
					String inputInt = inputScan.nextLine();
					x[i] = Integer.parseInt(inputInt);
					yes = true;
				}catch (Exception e) {
					System.out.println("输入有误，请重新输入：");
				}
			}
		}
		inputScan.close();
		System.out.println(Arrays.toString(x));
	}
}
