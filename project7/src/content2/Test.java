package content2;

import java.util.List;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String[] name = new String[3];
		name[0] = "Tom";
		name[1] = "Jerry";
		name[2] = "Kitty";
		NameDaoImpl a = new NameDaoImpl();
		List list = a.getNameFromArray(name);
		print(list);
		System.out.println(a.searchName(list,"hello"));
		a.removeFromList(list, 1);
		print(list);
		a.removeFromList(list, 2);
		print(list);
	}
	
	private static void print(List list) {
		for(int i=0;i<list.size();i++) {
			System.out.println("list["+i+"]="+list.get(i));
		}
	}
}
