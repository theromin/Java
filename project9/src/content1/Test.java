package content1;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		ReceiveMailRunnable receive = new ReceiveMailRunnable();
		SendMailRunnable send = new SendMailRunnable();
		Thread th11 = new Thread(receive);
		Thread th21 = new Thread(send);
		Thread th12 = new Thread(receive);
		Thread th22 = new Thread(send);
		Thread th13 = new Thread(receive);
		Thread th23 = new Thread(send);
		
		th11.start();
		th21.start();
		th12.start();
		th22.start();
		th13.start();
		th23.start();
		
		th11.join();
		th21.join();
		th12.join();
		th22.join();
		th13.join();
		th23.join();
		
		System.out.println("foxmailÈÎÎñ½áÊø");
	}

}
