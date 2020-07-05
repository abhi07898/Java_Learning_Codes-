
/** this program from hyrarichcical inheritance****/
class ff
{
public static void main(String args[])
{
System.out.println("this is main class");
 B obj1=new B();
obj1.disp();
obj1.multi();
C obj2=new C();
obj2.div();

}
}
class A
{
int a=10,b=20;
void disp()
{
System.out.println("hello thi is super class");
System.out.println("thye added value is="+(a+b));
}
}
class B extends A
{
void multi()
{
System.out.println("this is subclass of A");
	System.out.println("the multiplied value is "+(a*b));	
}
}
class C extends A
{
void div()
{
System.out.println("the divided value is ="+(a/b));
System.out.println("this is the also subclass of A");
}
}