interface A
{

void dispa();
}
interface B
{
void dispb();
}
class C implements A,B
{
public void dispa()
{
System.out.println("this is the mian interface A and call in a class C");
}
public void dispb()
{
System.out.println("this is the mian interface b and call in a class C");
}
}
class interf
{
public static void main(String args[])
{
System.out.println("this is main class");
C obj=new C();
obj.dispa();
obj.dispb();
}
}