class nesting
{
int a,b;
nesting(int x, int y)
{
a=x;
b=y;
}
int largest( )
{
if(a > b)
return (a);
else
return (b);

void  display( )
{
int result=largest();
System.out.println("The gratest value is =" + result);
}
}
}
class Abh
{
public static void main(String args[])
{
System.out.println("hello this is mai function");
nesting object = new nesting(10,26);
object.disp();
}

}