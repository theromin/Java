package content1;

public class Cone extends Geometry {
	private double radius;
	private double height;
	
	public Cone() {
		this.setRadius(0);
		this.setHeight(0);
	}
	
	public Cone(double radius, double height) {
		super();
		this.radius = radius;
		this.height = height;
	}

	@Override
	public double getSurfaceArea() {
		return PI*this.radius*(Math.sqrt(radius*radius+height*height)+this.radius);
	}

	@Override
	public double getVolume() {
		return PI*this.radius*this.radius*this.radius;
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

	@Override
	public String toString() {
		return "Cone [radius=" + radius + ", height=" + height + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(height);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Cone other = (Cone) obj;
		if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
			return false;
		if (Double.doubleToLongBits(radius) != Double.doubleToLongBits(other.radius))
			return false;
		return true;
	}

	
	
}
