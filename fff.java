abstract class A
{
	int a=10,b=12;
	abstract void disp();
	void add()
{
System.out.println("the addedd value sfrom abstract class="+(a+b));
}
}
	class B extends A
	{
	void disp()
	{
	System.out.println("uses the main anstract methode from abstract class");
	}
 	void mult()
	{
	System.out.println("the multiplied value from abstract class =" +(a*b));
	}
	}
class fff
{
public static void main(String args[])
	{
		System.out.println("this is the main class");
			B obj=new B();
			obj.disp();
			obj.add();
			obj.mult();

}
}