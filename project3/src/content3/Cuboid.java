package content3;

public class Cuboid {
	private double length;
	private double width;
	private double height;
	
	public double getSurfaceArea() {
		return (this.length*this.width+this.length*this.height+this.width+this.height)*2;
	}
	
	public double getVolume(){
		return this.length*this.width*this.height;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
