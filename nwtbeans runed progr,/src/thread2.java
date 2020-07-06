/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thread2 {
public static void main(String args[])
{
    System.out.println("this is main class and in this program try to print.. thred realted programs");
Thr obj=new Thr();
obj.start();
//obj.disp();

}
}
class Thr extends Thread
{
    public void disp()
    {
     System.out.println("this is another class that extends the proporties of thread class");    
    }
    void dispp()
    {
        System.out.println("this is another method in Thr class that extends the proporties of thread class ");
    }
    
   
}

