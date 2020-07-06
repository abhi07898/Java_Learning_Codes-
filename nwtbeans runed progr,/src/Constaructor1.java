/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Constaructor1 {
    public static void main(String arggs[])
    {
            System.out.println("main Class");  
             Abhish obj=new Abhish();
    obj.show();
        
    }
   
   
}
class Abhish
{
    int a,b,c,d;
    Abhish()
    {
        System.out.println("hello this is deafult construcetro");
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
        d=a-b;
        System.out.println(d);
    }
    public void show()
    {
        System.out.println("hello this is another class that is csll inn mainm class");
        System.out.println("the constructer with ");
    }
    
}
