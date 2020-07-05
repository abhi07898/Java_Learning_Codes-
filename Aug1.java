class nest
{
int a,b;
nest(int x, int y)
{
a=x;
b=y;
}
int largest()
{
if(a>b)
{
return(a);
}
else
{
return(b);
}
}
void disp()
{
int res=largest();
System.out.println("the biggest value is ="+res);
}
}
class Aug1
{
public static void main(String args[])
{
System.out.println("this is main class");
nest obj=new nest(90,99);
obj.disp();
}
}