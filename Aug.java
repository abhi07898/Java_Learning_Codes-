class Test
{
static int rectarea(int x, int y)
{
return(x*y);
}
}
class Aug
{
public static void main(String args[])
{
int res=Test.rectarea(12,12);
System.out.println("the area of rectangle is="+res);
}
}