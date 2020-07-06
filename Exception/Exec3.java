// HAndling specific Exception 
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
catch(ArithmeticException e)
{
System.out.println("Divide by 0 are not allowed ");
}
}
void add()
{
int st=a+b;
System.out.println(st);
}
}
class Exec3
{
public static void main(String args[])
{
Test obj=new Test();
obj.divide();
obj.add();
}
}