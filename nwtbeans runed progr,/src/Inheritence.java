/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Inheritence {
    public static void main(String args[])
    {
     
        System.out.println("try to use inheritence concept in java");
    Add obj=new Add();
    obj.getdata(12,12);
    int r=obj.add();
    obj.show();
    System.out.println("the added value from super into sub classs or child class  "+r);
    }
    
}
class Put
{
    int a,b;
    void getdata(int x, int y)
    {
        a=x;
        b=y;
       System.out.println("the value of a and b="+ a +":"  +  b);
    }
}
class Add extends Put
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
        
