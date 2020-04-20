package content3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Random;
import java.util.Set;
import java.util.TreeSet;

public class Util {
	
	public static Map makeStudentMap(List<Student> list) {
		Map<String, Student> students = new HashMap<String, Student>();
		for(int i = 0;i<list.size();i++) {
			students.put(list.get(i).getName(),list.get(i));
		}
		return students;
	}
	
	public static Student searchStudent(Map<String,Student> stuMap, String name) {
		return stuMap.get(name);
	}
	
	public static List generateNameList(int n) {
		List list = new ArrayList();
		ListIterator it = list.listIterator();
		for(int i = 0;i<n;i++) {
			it.add(getRandomName(2,8));
		}
		return list;
	}
	
	Map generateStudentMap(int n) {
		Map<String, Student> a = new HashMap<String, Student>();
		for(int i = 0;i<n;i++) {
			Student temp = new Student(getRandomName(2,8), getRandomNumber(0,100));
			a.put(temp.getName(), temp);
		}
		return a;
	}
	
	public static List getRandomStudents(int n) {
		List list = new ArrayList<Student>();
		for(int i=0;i<n;i++) {
			Student temp = new Student(content3.Util.getRandomName(2,8),
					content3.Util.getRandomNumber(0, 100));
			list.add(temp);
		}
		
		return list;
	}
	
	public static int searchName(List student,String target) {
		int a = -1;
		for(int i = 0;i<student.size();i++) {
			if(student.get(i).equals(target)) {
				a = i;
				break;
			}
		}
		return a;
	}
	
	/**
	 * 
	 * @param 
	 * @return 返回分布在[0,upLimit]的随机整数
	 */
	public static int getRandomNumber(int upLimit) {
		return new Random().nextInt(upLimit+1);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回分布在[min,max]的随机整数
	 */
	public static int getRandomNumber(int min,int max){
		if(min > max){
			throw new IllegalArgumentException("min ="+min+">"+ "max="+max);
		}
		return min + new Random().nextInt(max+1-min);
	}
	
	/**
	 * 
	 * @param min
	 * @param max
	 * @return 返回长度在min到max之间随机名字
	 */
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
