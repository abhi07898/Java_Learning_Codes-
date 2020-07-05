class inher
{
    int a,b;
    
    void getdata(int x, int y)
    {
        a=x;
        b=y;
    }
    int disp()
    {
System.out.println("this is super class ");
        return(a+b);
    }
}
class inher1 extends inher 
{
    int mult()
    {
        System.out.println("sub class methode");
return(a*b);
    }
}
class Aa
{
    public static void main(String args[])
    {
        System.out.println("this is main class");
        inher1 obj=new inher1();
        int add,multi;
        obj.getdata(12,13);
        add=obj.disp();
        multi=obj.mult();
System.out.println("the added value ="+add);
System.out.println("the multiplied value ="+multi);
    }
}