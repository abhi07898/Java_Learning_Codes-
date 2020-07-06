// user define Exception in java 

class MyException extends Exception
{ 
MyException(String s)
{
super(s);
}
}
class User_Exception
{
public static void main(String args[])
{
int x=10;
try
{
for(int i=1;i>0;i--)
{
if(i==0)
{
throw new MyException("number can't divided by zero");
}
int st=x/i;
System.out.println(st);
}
}
catch(MyException e)
{
System.out.println(e.getMessage());
}
}
}
