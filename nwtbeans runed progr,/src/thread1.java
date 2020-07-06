/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thread1 {
    
     public static void main(String args[])
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("this is main class");
        }
         Mythreaddd objj=new Mythreaddd();
        objj.disp();
        Mythreadd obj=new Mythreadd();
        obj.start();
       
    }
}
class Mythreadd extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("the my thread class");
        }
    }
}
class Mythreaddd extends Thread
{
    public void disp()
    {
        System.out.println("this is another class that extends Thread class");
    } 
}