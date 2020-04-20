package content4;

import java.util.Comparator;

public class ScoreComparator implements Comparator<Student> {

	@Override
	public int compare(Student o1, Student o2) {
		if(o1.getGrade()<o2.getGrade())
			return -1;
		else if(o1.getGrade()>o2.getGrade())
			return 1;
		return 0;
	}

}
