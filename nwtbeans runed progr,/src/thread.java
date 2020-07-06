/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thread {
    public static void main(String args[])
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("this is main class");
        }
        Mythread obj=new Mythread();
        obj.start();
    }
}
class Mythread extends Thread
{
    public void run()
    {
        for(int i=0;i<=5;i++)
        {
            System.out.println("the my thread class");
        }
    }
}