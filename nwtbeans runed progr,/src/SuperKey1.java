/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class SuperKey1 {
    public static void main(String args[])
    {
        System.out.println("using super key with a method of super class and accessing in child class");       
        Bbb obj=new Bbb();
        obj.shower();
    }
}
class Aaa
{
    void disp()
    {
        System.out.println("this is method of super class");
    }
}
class Bbb extends Aaa
{
    void show()
    {
        System.out.println("this is method of child class");
        System.out.println("this is method of child class");
    }
    void sh()
    {
        System.out.println("this is method of child class in another method");
    }
    void shower()
    {
        sh();
        super.disp();
    }
}