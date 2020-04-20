package content1;

public class SendMailRunnable implements Runnable {

	@Override
	public void run() {
		// TODO Auto-generated method stub
		int n = (int)(10*Math.random()+10);
		for(int i=0;i<n;i++) {
			System.out.println("I am sending emails");
			int time = (int)(1000*Math.random()+1000);
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		System.out.println("当前线程"+Thread.currentThread().getName()+"正要退出");
	}

}
