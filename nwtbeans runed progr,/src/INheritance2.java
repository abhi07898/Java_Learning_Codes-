/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class INheritance2 {
    
public static void main(String args[])
    {
     
        System.out.println("try to use inheritence concept in java");
    Addd obj=new Addd();
    obj.getdata(12,12);
    int r=obj.add();
    obj.show();
    System.out.println("the added value from super into sub classs or child class  "+r);
    
    Sub obbj =new Sub();
    obbj.getdata(12, 14);
    int rr=obbj.sub();
    obbj.show();
System.out.println("the subtraction of 2nd class="+rr);
    
    
    Mul objj=new Mul();
    objj.getdata(12,12);
    int rrr=objj.mul();
    System.out.println("the multiplication vcalue from parent class="+rrr);
    objj.show();
    
    
    }
    
}
class Gett
{
    int a,b;
    void getdata(int x, int y)
    {
        a=x;
        b=y;
       System.out.println("the value of a and b="+ a +":"  +  b);
    }
}
class Adddd extends Gett
{
int add()
{ 
    return(a+b);   
}
void show()
{
     System.out.println("this is subclass of put ");
}
}       
class Subb extends Gett
{
    int sub()
    {
        return(a-b);
    }
    void show()
    {
        System.out.println("this is another class and its class is Gets trhe main class");
} 
}
class Mul extends Gett
{
    int mul()
    {
        return(a*b);
    }
    void show()
    {
        System.out.println("this is another inhertince process from gett class and extends the behaviour of that class into a mul class");
    }
}
