package content4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Student> students = Util.getRandomStudents(100);
		printAll(students);
		System.out.println("============================");
		List<Student> studentList = (List)students;
		Collections.sort(studentList,new ScoreComparator());
		
		System.out.println(Collections.min(studentList, 
				new ScoreComparator()).getGrade());
		System.out.println(Collections.max(studentList, 
				new ScoreComparator()).getGrade());
		int temp = Collections.binarySearch(studentList, 
				new Student("",0,60), new ScoreComparator());
		if(temp<0||temp>=studentList.size())
			System.out.println("Not found");
		else
			System.out.println(studentList.get(temp).getGrade());
		List otherList = lessSixty(studentList);
		studentList.removeAll(otherList);
//		printAll(studentList);
		Collections.shuffle(studentList);
		students = (ArrayList<Student>)studentList;
		System.out.println("============================");
		printAll(students);
	}
	
	public static List lessSixty(List<Student> student) {
		List list = new ArrayList<Student>();
		for(int i = 0;i<student.size();i++) {
			if(student.get(i).getGrade()>=60)
				break;
			list.add(student.get(i));
		}
		return list;
	}
	
	public static void printAll(List<Student> list) {
		if(list.size()<=0) {
			System.out.println("Nothing");
			return;
		}
		for(Student x:list) {
			System.out.println(x.getName()+" "+x.getGrade());
		}
	}
	
	public static void printAll(ArrayList<Student> list) {
		if(list.size()<=0) {
			System.out.println("Nothing");
			return;
		}
		for(Student x:list) {
			System.out.println(x.getName()+" "+x.getGrade());
		}
	}
	
}
