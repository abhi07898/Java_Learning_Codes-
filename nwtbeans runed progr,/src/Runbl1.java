/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Runbl1 {
    public static void main(String args[])
{
    UserThreadd myt=new UserThreadd();
    Thread t=new Thread(myt);
    t.start();
    int mul=1;
    for(int i=1;i<4;i++)
    {
        System.out.println("main thread value"+i);
        mul=mul*i;
    }
    System.out.println("multiplied values from main thred="+mul);
    
}
}
class UserThreadd implements Runnable 
{
    public void run()
    {
        int sum=0;
     for(int i=0;i<5;i++)
     {
         System.out.println("The value="+i);
         sum=sum+i;
     }
     System.out.println("this is the added value from child class"+sum);
    }
}
