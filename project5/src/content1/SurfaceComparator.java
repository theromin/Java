package content1;

import java.util.Comparator;

public class SurfaceComparator implements Comparator<Geometry> {

	@Override
	public int compare(Geometry o1, Geometry o2) {
		if(o1.getSurfaceArea()<o2.getSurfaceArea())return 1;
		else if(o1.getSurfaceArea()>o2.getSurfaceArea())return -1;
		return 0;
	}
}