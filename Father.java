interface Father
{
int mark=100;
int rollNo=100;
void disp();
}
class Son implements Father
{
int mark1=102;
int sum=Father.mark+mark1;
public void disp()
{
System.out.println("the roll no ="+Father.rollNo);
System.out.println("the sum ="+sum);
}
}
class Main
{
public static void main(String args[])
{
System.out.println("this si the main method");
Son abj=new Son();
abj.disp();
}
}