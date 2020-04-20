package content2;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		long each = (long)Math.pow(10, 7);//10000000
		Thread s[] = new Thread[10];
		for(int i=0;i<10;i++) {
			SumWorker a = new SumWorker(each*i+1, each*(i+1));
			s[i] = new Thread(a);
			s[i].start();
			s[i].join();
		}
		
		System.out.println(SumWorker.sum);
	}

}
