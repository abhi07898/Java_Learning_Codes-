class large
{
int a,b;
void getdata(int x, int y)
{
a=x;
b=y;
}
int disp()
{
if (a>b)
{
return (a);
}
else 
{
return(b);
}
}
}
class calci extends large 
{
	int cal()
{
return(a+b);
}
int sub()
{
return(b-a);
}
}
class Aaa
{
public static void main(String args[])
{
System.out.println("this is main class");
calci obj=new calci();
obj.getdata(12,2);
int great,add,sub;
great=obj.disp();
add=obj.cal();
sub=obj.sub();
System.out.println("the largest value is"+great);
System.out.println("the add  is"+add);
System.out.println("the subtracted value is"+sub);
}
}