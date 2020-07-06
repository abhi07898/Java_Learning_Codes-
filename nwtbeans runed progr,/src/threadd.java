/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class threadd {
    public static void main(String arsg[])
    {
        ThredSuper t=new ThredSuper();
        t.start();
        for(int i=0;i<5;i++)
        {
            System.out.println("this is main class");
                
                }
        
    }
}
class ThredSuper extends Thread
{
public void run()
{
    for(int i=0;i<5;i++)
    {
    System.out.println("thread class");
    }
}
}
