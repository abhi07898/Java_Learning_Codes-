/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Abstract1 {
 
        public static void main(String args[])
    {
        System.out.println("this is ABstract class practises");
        zz obj=new zz();
        obj.disp();
        obj.show();
        obj.display();
    }
}

abstract class xx
{
    abstract void disp();
     void show()
     {
         System.out.println("this is"+ " main methodmof class");
     }
}
 abstract class yy extends xx
{
 
    void disp()
    {
        System.out.println("this is method related to abstract class x");
    }
    abstract void display();
}
class zz extends yy 
{
    void display()
    {
        System.out.println("method of subclass use in zz class ");
    }
}