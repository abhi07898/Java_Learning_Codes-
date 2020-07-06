class First
{
public void info()
{
System.out.println("Sumit shukla");
}
}
class Second extends First
{
public void disp()
{
System.out.println("this  is another methode of first class");
}
}
class Main
{
public static void main(String args[])
{
Second obj=new Second();
obj.info();
obj.disp();
}
}