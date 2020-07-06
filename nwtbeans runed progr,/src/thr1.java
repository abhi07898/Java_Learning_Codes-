/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thr1 {
    public static void main(String args[])
    {
        Ttt t=new Ttt();
        t.run();
        for( int i=1;i<=5;i++)
        {
            System.out.println(i);
        }
    }
    
}
class Ttt extends Thread
{
     public void run()
    {
        for(int i=1;i<=4;i++)
        {
            System.out.println("child thread");
        }
    }
}