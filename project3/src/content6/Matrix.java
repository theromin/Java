package content6;

public class Matrix {
	private int row;
	private int cols;
	private double[][]data;
	
	public Matrix(int row , int cols){
		this.row=row;
		this.cols=cols;
		this.data = new double [row][cols];
	}
	
	public void setElement(int row, int col, double value) {
		this.data[row][col]=value;
	}
	
	public Matrix add(Matrix m) {
		if(this.row != m.row||this.cols != m.cols)
			return null;
		Matrix a = new Matrix(this.row , this.cols);
		
		for(int i=0;i<a.data.length;i++) {
			for(int j=0;j<a.data[i].length;j++) {
				a.data[i][j]=this.data[i][j]+m.data[i][j];
			}
		}
		
		return a;
	}
	
	public Matrix minus(Matrix m) {
		if(this.row != m.row||this.cols != m.cols)
			return null;
		Matrix a = new Matrix(this.row , this.cols);
		
		for(int i=0;i<a.data.length;i++) {
			for(int j=0;j<a.data[i].length;j++) {
				a.data[i][j]=this.data[i][j]-m.data[i][j];
			}
		}
		
		return a;
	}
	
	public Matrix multiple(Matrix m) {
		if(this.cols != m.row)
			return null;
		Matrix a = new Matrix(this.row , m.cols);
		
		for(int i=0;i<a.data.length;i++) {
			for(int j=0;j<a.data[i].length;j++) {
				a.data[i][j]=0;
				for(int k=0;k<a.data.length;k++) {
					a.data[i][j]+=this.data[i][k]*m.data[k][j];
				}
			}
		}
		
		return a;
	}
	
	public Matrix transposition() {
		Matrix a = new Matrix(this.cols , this.row);
		for(int i=0;i<a.data.length;i++) {
			for(int j=0;j<a.data[i].length;j++) {
				a.data[i][j]=this.data[j][i];
			}
		}
		
		return a;
	}
	
	public void display() {
		for(int i=0;i<this.data.length;i++) {
			for(int j=0;j<this.data[i].length;j++) {
				System.out.printf("%.2f ",this.data[i][j]);
			}
			System.out.println();
		}
	}

	public int getRow() {
		return row;
	}

//	public void setRow(int row) {
//		this.row = row;
//	}

	public int getCols() {
		return cols;
	}

//	public void setCols(int cols) {
//		this.cols = cols;
//	}

	public double[][] getData() {
		return data;
	}

//	public void setData(double[][] data) {
//		this.data = data;
//	}
//	
	
}
