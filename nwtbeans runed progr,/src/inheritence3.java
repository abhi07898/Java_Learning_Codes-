/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class inheritence3 {
    public static void main(String args[])
    {
        System.out.println("Heirarichal INheritence");
        Two obj = new Two();
        obj.show();
        obj.add();
        Three objj=new Three();
        objj.show();
        objj.multi();
        
    }
}
class One
{
 int x=10,y=20;
 void show()
 {
     System.out.println("this is class one and its aparent class");
     System.out.println("the value of x="+x);
     System.out.println("the value of Y="+y);
 }
}
class Two extends One
{
    void add()
    {
        System.out.println("the added value is="+(x+y));
        System.out.println("this is class two thyat inher the value of One");
        
    }
}
class Three extends One
{
    void multi()
    {
        System.out.println("the multiplied value is ="+(x*y));
        System.out.println("this is the Three class that heigher the proporties of One class");
    }
}