package content3;

public class TestGeometry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Cuboid a1=new Cuboid();
		a1.setHeight(10);
		a1.setLength(10);
		a1.setWidth(10);
//		System.out.println(a1.getSurfaceArea());
//		System.out.println(a1.getVolume());
		
		Cuboid a2=new Cuboid();
		a2.setHeight(12.3);
		a2.setLength(10.5);
		a2.setWidth(7.8);
//		System.out.println(a2.getSurfaceArea());
//		System.out.println(a2.getVolume());
		
		Spheroid b1=new Spheroid();
		b1.setRadius(10);
//		System.out.println(b1.getSurfaceArea());
//		System.out.println(b1.getVolume());
		
		Spheroid b2=new Spheroid();
		b2.setRadius(7.8);
//		System.out.println(b2.getSurfaceArea());
//		System.out.println(b2.getVolume());
		
		Cone c1 = new Cone();
		c1.setHeight(10);
		c1.setRadius(6);
//		System.out.println(c1.getSurfaceArea());
//		System.out.println(c1.getVolume());
		
		Cone c2 = new Cone();
		c2.setHeight(10);
		c2.setRadius(6);
//		System.out.println(c2.getSurfaceArea());
//		System.out.println(c2.getVolume());
		
		System.out.println(a1.getSurfaceArea()+a2.getSurfaceArea()
			+b1.getSurfaceArea()+b2.getSurfaceArea()
			+c1.getSurfaceArea()+c2.getSurfaceArea());
		System.out.println(a1.getVolume()+a2.getVolume()
			+b1.getVolume()+b2.getVolume()
			+c1.getVolume()+c2.getVolume());
	}

}
