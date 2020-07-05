class inh
{
	public static void main(String args[])
	{
	System.out.println("haii this is main method or function");
		B obj=new B();
		obj.getdata(10,15);
		obj.display();
		int res1,res2;
			res1=obj.add();
			res2=obj.multiplication();
			
System.out.println(res1);
System.out.println(res2);

}	
}

class A
{
int a,b;
void getdata(int x, int y)
{
	a=x;
	b=y;
}
void display()
{
System.out.println("the value of X is="+a);
System.out.println("the value of Y is="+b);
System.out.println("this is class A");
}
}
class B extends A
{
	int add()
	{
	return(a+b);
	}
	int multiplication()
	{
	return (a*b);
	}
	void disp()
	{
	System.out.println("this is class B");
	}
}
