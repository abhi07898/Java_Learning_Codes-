class Test
{
int a=10, b=0;
void divide()
{
try
{
int st=a/b;
System.out.println(st);
}
catch(Exception e)
{
System.out.println(e);
System.out.println("Divide by 0 are not allowed ");
}
}
void add()
{
int st=a+b;
System.out.println(st);
}
}
class Exec1
{
public static void main(String args[])
{
Test obj=new Test();
obj.divide();
obj.add();
}
}