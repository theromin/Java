package content3;

import java.util.Date;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List nameList = Util.generateNameList(10000000);
		List studentList = Util.getRandomStudents(10000000);
		Map<String,Student> stuMap = Util.makeStudentMap(studentList);
		int a;
		Student b;
		String toSearch;
		Scanner in = new Scanner(System.in);
		toSearch = in.next();
		in.close();
		Date date1 = new Date();
		a = Util.searchName(nameList, toSearch);
		Date date2 = new Date();
		b = Util.searchStudent(stuMap, toSearch);
		Date date3 = new Date();
		
		if(a!=-1)
			System.out.print("found ");
		else 
			System.out.print("not found ");
		System.out.println("namelist cost:"+(date2.getTime()-date1.getTime()));
		if(b != null)
			System.out.print("found ");
		else
			System.out.print("not found ");
		System.out.println("stuMap cost:"+(date3.getTime()-date2.getTime()));
	}

}
