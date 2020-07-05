class a
{
int a,b;
int getdata(int x, int y)
{
a=x;
b=y;
}
void disp()
{
System.out.println("the value a="+a);
System.out.println("the value b="+b);
}
}
class b extends a
{
int add()
{
return(a+b);
}
}
class c extends b
{
int sub()
{
return(a-b);
}
}
class Aaaaa
{
public static void main(String args[])
{
System.out.println("the mai class");
c obj= new c();
obj.getdata(123,12);
obj.disp();
int ad,subtract;
ad=obj.add();
subtract=obj.sub();
System.out.println("the added value is ="+ad);
System.out.println("the subtracted value is ="+subtract);
}
}