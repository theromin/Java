package content3;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class Test {

	public static void main(String[] args) throws IOException {
		InputStream input = new FileInputStream("data3.txt");
		int n,address=0;
		do {
			byte[] b = new byte[16];
			n = input.read(b);
			if(n!=0) {
				System.out.printf("%08x",address);
			}
			for(int i = 0;i<n;i++) {
				System.out.printf(" %02x",b[i]);
				if(i==7)
					System.out.print(" ");
			}
			System.out.println();
			address+=n;
		}while(n==16);
		input.close();
	}
}
