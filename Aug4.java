class inher
{
int a,b;
void getdata(int x, int y)
{
a=x;
b=y;
}
void putdata()
{
System.out.println("thr first value is ="+a);
System.out.println("thr second value is ="+b);
}
int add()
{
return(a+b) ;
}
}
class A extends inher
{
int multi()
{
System.out.println("this is subclass of inher");
return(a*b);
}
}
class B extends A
{
int div()
{
System.out.println("this is subclass of A ");
return(a/b);
}
}
class math extends inher
{
int square()
{
System.out.println("this is the another subclass of main super class");
System.out.println("this is square of a");
return(a*a);
}
int cube()
{
System.out.println("this is cube of a");
return(a*a*a);
}
int area()
{
System.out.println("this is area a*b  value");
return(a*b);
}
}
class Aug4
{
public static void main(String args[])
{
System.out.println("this isyou main class for inheritance ");
B obj=new B();
math obj1=new math();
obj.getdata(12,12);
obj.putdata();
int r=obj.add();
int rr=obj.multi();
int rrr=obj.div();
System.out.println("the added value is ="+r);
System.out.println("the multiplied value="+rr);
System.out.println("the divided value ="+rrr);
obj1.getadata(11,11);
int p=obj1.square();
int pp=obj1.cube();
int ppp=obj1.area();
System.out.println("the square of a="+p);
System.out.println("the cube of a="+pp);
System.out.println("the  area of a,b ="+ppp);

}
}