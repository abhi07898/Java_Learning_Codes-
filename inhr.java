class A
{
int a,b;
void  getdata (int x, int y)
{
a=x;
b=y;
}
int disp()
{
return (a+b);
}
}
class b extends A
{
int mult()
{
System.out.println("sub class methode ");
int z;
z=a*b;
System.out.println("multiplication is="+z);
}
}
class inhr
{
public static void main(String args[])
{
System.out.println("the main class");
b objct=new b();
objct.getdata(12,14);
int add;
add=objct.disp();
objct.mult();
}
}