/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thr {
    public static void main(String args[])
    {
    Tt t=new Tt();
    t.start();
    for(int i=0;i<=12;i++)
    {
        System.out.println("this is main threads");
    }
    }
}
class Tt extends Thread
{
public void run()
{
    System.out.println("this is child class thread");
}
}
