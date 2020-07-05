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
return(a*b);
}
}
class Aug2
{
public static void main(String args[])
{
System.out.println("this isyou main class for inheritance ");
A obj=new A();
obj.getdata(12,12);
obj.putdata();
int r=obj.add();
int rr=obj.multi();
System.out.println("the added value is ="+r);
System.out.println("the multiplied value="+rr);
}
}