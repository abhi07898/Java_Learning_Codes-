/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class overloading {
    public static void main(String args[])
    {
        System.out.println("try to use methid overloading concept");
   A obj=new A();
   int r=obj.add(12,12);
   System.out.println("the added value in method over loading"+r);
    
}
 }
class A
{
    int add(int x, int y)
    {
        return(x+y);
    }
    int add(int x, int y, int z)
    {
        return(x+y+z);
    }
    void  add(int x, float y)
    {
        System.out.println(x+y);
    }
}