package content2;

public class SumWorker implements Runnable {

	private long m,n;
	public static long sum=0;
	Object synObj = new Object();
	public SumWorker(long m,long n) {
		this.m=m;
		this.n=n;
	}
	
	@Override
	public void run() {
		for(long i=m;i<=n;i++) {
			synchronized (synObj) {
				sum+=i;
			}
		}
		
	}

}
