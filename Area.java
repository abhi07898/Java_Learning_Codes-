class Overloading
{
int l,b,side,height,base;
int disp(int x, int y)
{
l=x;
b=y;
return(l*b);
}
int disp(int x)
{
side=x;
return(x*x);
}

float disp (int x, float y)
{
height=x;
base=y;
return(1/2*(height*base));
}
}
class Area
{
public static void main(String args[])
{
System.out.println("this is the main function");
Overloading obj=new Overloading();
int rect,square,trang;
rect=obj.disp(10,20);
System.out.println("the area of reactangle is ="+rect);
square=obj.disp(12);
System.out.println("the area of square is="+square);
trang=obj.disp(12,13.11);
System.out.println("the area of trangle="+trang);
}
}