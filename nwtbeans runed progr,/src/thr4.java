/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thr4 {

public static void main(String args[])
    {
        Tttttt t=new Tttttt();
        t.start();//here start is traeted as a noramal method not like thread
        System.out.println("this is main Thread");
    }
    
}
class Tttttt extends Thread
{
    public void start()            
    {
        super.start();
        System.out.println("child thread with start");
    }    
    public void run()
    {
        System.out.println("run methode");
    }
}
