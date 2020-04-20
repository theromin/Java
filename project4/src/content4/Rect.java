package content4;

public class Rect {
	protected double width;
	protected double height;
	
	public Rect(double width,double height) {
		this.width=width;
		this.height=height;
	}
	
	public Rect() {
		this.height=10;
		this.width=10;
		
	}
	
	public double getArea() {
		return this.width*this.height;
	}
	
	public double getPerimeter() {
		return 2*(this.width+this.height);
	}

	@Override
	public String toString() {
		return "Rect [width=" + width + ", height=" + height + "]";
	}
	
	
}
