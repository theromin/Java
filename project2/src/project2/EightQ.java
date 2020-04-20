package project2;

public class EightQ {
	private static int count=0;
	private final static int Q=8;
	static int []board=new int[Q];

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		eightqueen(0);
	}
	
	private static void eightqueen(int n) {
		if(n==Q) {
			count++;
			System.out.println(count+":");
			out_board(board);
			return;
		}
		for(int i=0; i<Q; ++i){
	        board[n] = i;
	        boolean yes = true;
	        for(int j=0; j<n; ++j) {
	            if(board[n]==board[j] || n-j==board[n]-board[j] || n-j==board[j]-board[n]){
	                yes = false;
	                break;
	            }
	        }
	        if(yes) 
	        	eightqueen(n+1);
	    }
	}
	
	private static void out_board(int []a) {
		for(int i=0;i<a.length;i++) {
			for(int j=0;j<a.length;j++) {
				if(j==a[i])System.out.print("1 ");
				else System.out.print("0 ");
			}
			System.out.println();
		}
	}

}
