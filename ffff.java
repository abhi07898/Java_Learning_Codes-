class ffff
{
	public static void main(String args[])
{
System.out.println("this is the main class");
C obj=new C();
obj.getdata(50,25);
obj.disp();
int r,rr,rrr;
r=obj.add();
System.out.println(r);
rr=obj.multiplication();
System.out.println(rr);
rrr=obj.div();
System.out.println(rrr);
}
}
abstract class A
{
int a,b;
 abstract void disp();
 void getdata(int x, int y)
{
	a=x;
	b=y;
}
int add()
{
return(a+b);
}
}
abstract class B extends A
{
int multiplication()
{
return(a*b);
}
abstract void display();
}
class C extends B
{
int div()
{
return(a/b);
}
void disp()
{
System.out.println("this is abstract method for class A");
}
void display()
{
System.out.println("this is the abstract method fro class B");
}
}