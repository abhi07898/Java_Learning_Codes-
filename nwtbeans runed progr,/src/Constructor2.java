/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Constructor2 {
    public static void main(String arggs[])
    {
            System.out.println("main Class");  
             Abhishe obj=new Abhishe();
    obj.show();
    Ab ob=new Ab(12,12);
        
    }
   
   
}
class Abhishe
{
    int a,b,c,d;
    Abhishe()
    {
        System.out.println("hello this is deafult construcetro");
        a=10;
        b=20;
        c=a+b;
        System.out.println(c);
        d=a-b;
        System.out.println(d);
    }
    void show()
    {
        System.out.println("hello this is another class that is csll inn mainm class");
        System.out.println("the constructer with ");
    }
    
}
class Ab
{
    Ab(int x, int y)
    {
        System.out.println("this is another class constrocter");
        System.out.println("the addition in constrocture"+(x+y));
    }
}
