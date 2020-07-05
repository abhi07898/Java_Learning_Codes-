abstract class A
{
abstract int add(int x, int y);
void disp()
{
System.out.println("this si abstract calss method ");
}
}
abstract class B
{
abstract int multi(int a,int b);
}
class AA extends A
{
int add(int x, int y)
{
return(x+y);
}
void display()
{
System.out.println("hello this is clas that extends A abstract class and its methode");
}
}
class BB extends B
{
int multi(int a, int b)
{
return(a*b);
}
void disp()
{
System.out.println("this is another abstract class that is B define in BB");
}
}
class Abstrac
{
public static void main(String args[])
{
AA obj=new AA();
int r=obj.add(12,13);
obj.display();
BB obj1=new BB();
int rr=obj1.multi(12,12);
obj1.disp();
System.out.println("teh addded value of class A ="+r);
System.out.println("the myltiplied value of class b="+rr);
}
}