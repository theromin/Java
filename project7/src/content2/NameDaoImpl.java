package content2;

import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class NameDaoImpl implements NameDao {

	@Override
	public List getNameFromArray(String[] names) {
		List list = new ArrayList();
		ListIterator it = list.listIterator();
		for(int i=0;i<names.length;i++) {
			it.add(names[i]);
		}
		return list;
	}

	@Override
	public int searchName(List nameList, String name) {
		int searched = -1;
		for(int i = 0; i<nameList.size();i++) {
			if(nameList.get(i).equals(name)) {
				searched = i;
				break;
			}
		}
		return searched;
	}

	@Override
	public boolean removeFromList(List nameList, int id) {
		if(id<0||id>=nameList.size())
			throw new IllegalArgumentException();
		nameList.remove(id);
		return true;
	}

	
}
