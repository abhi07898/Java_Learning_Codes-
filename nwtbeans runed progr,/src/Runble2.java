/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Runble2 {
    public static void main(String args[])
    {
        System.out.println("this is main class");
        UsrThread myt=new UsrThread();
        Thread t=new Thread(myt);
        t.start();
        for(int i=5;i>0;i--)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print(i);
            }
            System.out.println();
        }
    }
    
}
class UsrThread implements Runnable
{
    public void run()
    {
        for(int i=0;i<5;i++)
        {
            for(int j=0;j<=i;j++)
            {
            System.out.print(i);
            }
            System.out.println();
        }
            
    }
}
