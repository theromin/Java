package content3;

public class Spheroid {
	private double radius;
	private static final double PI=3.1415926;
	public double getSurfaceArea() {
		return 4*PI*this.radius*this.radius;
	}
	
	public double getVolume(){
		return 4/3.0*PI*this.radius*this.radius*this.radius;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}
	
	
}
