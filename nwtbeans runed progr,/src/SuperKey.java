/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class SuperKey {
    public static void main(String args[])
    {
       Bb obj=new Bb();
       obj.show();
       Cc ob=new Cc();
       ob.show();
    }
    
}
class Aa
{
int a=10;
String colr="Red and White";
}
class Bb extends Aa
{
    void show()
    {
        System.out.println("this is a child class and work with super keywod");
        System.out.println("the value of a from super class = "+super.a);
    }
}
class Cc extends Aa
{
    void show()
    {
        System.out.println("Herirachical inhertance with super keyword");
        System.out.println("value inherit with super class using super keword="+super.colr);
    }
}