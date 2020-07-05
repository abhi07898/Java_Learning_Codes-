class inher
{
////////////this program of multilevel inheritence/////////////
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
class Aug3
{
public static void main(String args[])
{
System.out.println("this isyou main class for inheritance ");
B obj=new B();
obj.getdata(12,12);
obj.putdata();
int r=obj.add();
int rr=obj.multi();
int rrr=obj.div();
System.out.println("the added value is ="+r);
System.out.println("the multiplied value="+rr);
System.out.println("the divided value ="+rrr);
}
}