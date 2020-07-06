/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class copycons {
    public static void main(String args[])
    {
        System.out.println("this is main mnethod and try to nse copy conatructor");
        Copcons obj= new Copcons(12,12);
        Copcons obj1=new Copcons(obj);
        
    }
}
class Copcons
{
int a,b;
Copcons(int x, int y)
{
    a=x;
    b=y;
    System.out.println("the value of a="+a+"the value of B="+b);
}
Copcons(Copcons s)
{
    a=s.a;
    b=s.b;
    System.out.println("the added  value of Copy Constructor in A + B="+(a+b));
}
}
