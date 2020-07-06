/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Refrbook {
    public static void main(String ars[])
    {
        System.out.println("this is the main methode");
        Box superobj=new Box();
        superobj.i=12;
        superobj.j=12;
        superobj.show();
      Box1 subobj=new Box1();
      subobj.k=13;
      subobj.add();
      subobj.show();
    }
}
class Box
{
    int i;
    int j;
    void show()
    {
        System.out.println("the value in super class is =" + i +"and "+j);
                
    }
}
class Box1 extends Box
{
    int k;
    void show()
    {
        System.out.println("this is another method that show the value of k="+k);
        
    }
    void add()
    {
        System.out.println("and the value after inserting in another class that exrends from super class ="+(i+j+k));
    }
}

