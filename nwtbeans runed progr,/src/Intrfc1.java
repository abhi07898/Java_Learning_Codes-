/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Intrfc1 {
  public static void main(String args[])
  {
      System.out.println("this is abhisek pandey and try to do code with inetrfaces topic");
      Impl obj=new Impl();
      obj.add();
      obj.Multi();
      obj.both();
  }
}
interface father
{
    int a=10;
    int b=20;
    void add();
}
interface mother 
{
    float c=12.5f;
    float d=1245.34f;
    void Multi();
}
interface son extends father,mother
{
    void both();
}
class Impl implements father,mother,son
{
   public  void add()
    {
        System.out.println("the added value from intetface Father"+(a+b));
    }
   public void Multi()
   {
       System.out.println("the multiplied value from intetface Father"+(c*d));
   }
   public void both()
   {
       System.out.println("sb moh maay hai ");
       System.out.println("the added value from intetface Father"+(a+b));
       System.out.println("the multiplied value from intetface Father"+(c*d));
   }
}