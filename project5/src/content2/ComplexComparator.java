package content2;

import java.util.Comparator;

public class ComplexComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff o1, Staff o2) {
		if(o1.getName().compareTo(o2.getName())<0)return -1;
		else if(o1.getName().compareTo(o2.getName())>0)return 1;
		else if(o1.getAge()<o2.getAge())return -1;
		else if(o1.getAge()>o2.getAge())return 1;
		return 0;
	}

}
