interface  father
{
public static final int roll=10;
public static final int marks=20;
public void disp();
}
interface mother
{
public static final int marks=110;
}
class Son implements father,mother
{
public void disp()
{
System.out.println("print roll var from interface father="+father.roll);
System.out.println("print marks var from interface father="+father.marks);
System.out.println("print marks var from mother interface="+mother.marks);
int add=father.marks+mother.marks;
System.out.println("the added marks from intreface mothe and father ="+add);
} 
}
class Inte
{
public static void main(String args[])
{
System.out.println("main class ");
Son obj = new Son();
obj.disp();
}
}