package content1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		MyJFrame frame = new MyJFrame();
		Scanner in = new Scanner(System.in);
		in.next();
		System.out.println("width:"+frame.getSize().width+" height:"+frame.getSize().height);
		in.close();
	}

}
