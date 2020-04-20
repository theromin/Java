package content1;

public class Spheroid extends Geometry {
	private double radius;
		
	public Spheroid() {
		this.setRadius(0);
	}
	
	public Spheroid(double radius) {
		super();
		this.radius = radius;
	}

	@Override
	public double getSurfaceArea() {
		return 4*PI*this.radius*this.radius;
	}
	
	@Override
	public double getVolume(){
		return 4/3.0*PI*this.radius*this.radius*this.radius;
	}
	
	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public String toString() {
		return "Spheroid [radius=" + radius + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(radius);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Spheroid other = (Spheroid) obj;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}
	
}
