package content3;

public class Cone {
	private static final double PI=3.1415926;
	private double radius;
	private double height;
	
	
	
	public double getSurfaceArea() {
		return PI*this.radius*(Math.sqrt(radius*radius+height*height)+this.radius);
	}
	
	public double getVolume(){
		return 1/3.0*PI*this.radius*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}
	
	
}
