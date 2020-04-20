package content1;

public abstract class Geometry implements Comparable<Geometry>{
	final static double PI = 3.1415926535;
		
	public abstract double getSurfaceArea();
	
	public abstract double getVolume() ;
	
	public int compareTo(Geometry a) {
		if(this.getSurfaceArea()<a.getSurfaceArea())return -1;
		else if(this.getSurfaceArea()>a.getSurfaceArea())return 1;
		return 0;
	}
	
	
}