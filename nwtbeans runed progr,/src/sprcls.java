/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class sprcls {
    public static void main(String args[])
    {
        System.out.println("try to use super keyword");
        Super obj=new Super();
        obj.add();
        Subclass objj=new Subclass();
        objj.multi();
        objj.show();
        
        
        
    }
}
class Super 
{
     int a=10;
    int b=20;
    Super()
    {
        System.out.println("Super class and its have some method that will call in sub class by super keywrod");
    }
   
    void add()
    {
        
        System.out.println("the added value "+ (a+b)+"from super class");
    }
}
class Subclass extends Super 
{
   // super a,b;
    int  multi()
    {
        return(super.a*super.b);
    }   
    void show()
    {
    System.out.println("the value of a in classs Super = "+super.a);
    
}
}
