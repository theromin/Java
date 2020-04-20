package content2;

import java.util.Comparator;

public class SalaryComparator implements Comparator<Staff> {

	@Override
	public int compare(Staff o1, Staff o2) {
		if(o1.getSalary()<o2.getSalary())return -1;
		else if (o1.getSalary()>o2.getSalary())return 1;
		return 0;
	}

}
