package content4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Util {
	public static ArrayList<Student> getRandomStudents(int n) {
		ArrayList<Student> list = new ArrayList<Student>();
		for(int i=0;i<n;i++) {
			Student temp = new Student(content4.Util.getRandomName(5, 10),
					content4.Util.getRandomNumber(0, 100),
					content4.Util.getRandomNumber(0, 100));
			list.add(temp);
		}
		
		return list;
	}
	
	public static int getRandomNumber(int upLimit) {
		return new Random().nextInt(upLimit+1);
	}

	public static int getRandomNumber(int min,int max){
		if(min > max){
			throw new IllegalArgumentException("min ="+min+">"+ "max="+max);
		}
		return min + new Random().nextInt(max+1-min);
	}
	
	public static String getRandomName(int min, int max){
		StringBuilder sb = new StringBuilder();
		
		int n = getRandomNumber(min, max);
		
		while (n>0) {
			sb.append((char)getRandomNumber('a','z'));
			n--;
		}
		return sb.toString();
	}
}
