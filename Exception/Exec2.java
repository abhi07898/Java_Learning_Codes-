
//using catch as a logic holder 


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
a=10;
b=20;
int st=a+b;
System.out.println(st+" catch as a logic holder after eXception " );
}
}
void add()
{
int st=a+b;
System.out.println(st);
}
}
class Exec2
{
public static void main(String args[])
{
Test obj=new Test();
obj.divide();
obj.add();
}
}