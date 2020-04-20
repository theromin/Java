#include<iostream>
using namespace std;
class MyTest
{
private:
	int n;
	double v;

public:
	MyTest()
	{
		n = 0;
		v = 0.0;
	}//构造函数1
	MyTest(int x)
	{
		n = x;
		v = 0.0;
	}//构造函数2
	MyTest(int x, double y)
	{
		n = x;
		v = y;
	}//构造函数3
	void print()
	{
		cout << n << endl;
		cout << v << endl;
	}
};
int main()
{
	MyTest aaa;
	aaa.print();
	MyTest bbb(10);
	bbb.print();
	MyTest ccc(11, 33);
	ccc.print();
	system("pause");
	return 0;
}