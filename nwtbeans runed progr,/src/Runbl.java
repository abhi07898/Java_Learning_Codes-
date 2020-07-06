/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Runbl {
public static void main(String args[])
{
    UserThread myt=new UserThread();
    Thread t=new Thread(myt);
    t.start();
    for(int i=0;i<4;i++)
    {
        System.out.println("main thread");
    }
    
}
}
class UserThread implements Runnable 
{
    public void run()
    {
     for(int i=0;i<5;i++)
     {
         System.out.println("child user thread");
     }
    }
}
