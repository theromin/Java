package content2;

import java.util.List;

public interface NameDao{
	//�������е��ַ��������б��÷�����Ҫʹ��ListIterator�ӿ�ʵ�����
	public List getNameFromArray(String[] names);
	
	//���б�����������name��ͬ����Ŀ���ͷ��ظ�name���ڵ���ţ��Ҳ�������-1��
	public int searchName(List nameList, String name);
	
	//����ָ��id�����б����Ƴ�ָ������Ŀ�����idָ������(�������߳����б����ֵ)
	//�׳�IllegalArgumentException�쳣���Ƴ��ɹ�����true
	public boolean removeFromList(List nameList, int id);
}
