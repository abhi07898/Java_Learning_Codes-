class Abhi
{
public static void main(String args[])
{
System.out.println("Abihsek pandey ");
Demo obj= new Demo();
obj.rectarea(10,15);
}
}
class Demo
{
int length,breadth,res;
Demo(int x, int y)
{
length=x;
breadth=y;
}
void rectarea()
{
res=length*breadth;
System.out.println("the area is ="+res);
}
} 
