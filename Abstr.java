abstract class x
{
abstract void disp();
void display()
{
System.out.println("methods from class x");
}
}
class y extends x
{
void disp()
{
System.out.println("defien class x  abstract methode in class y ");
}
}
class Abstr
{
public static void main(String args[])
{
y obj=new y();
obj.display();
obj.disp();
}
} 