/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class thr5 {
    public static void main(String args[])
    {
        Ttttttt t=new Ttttttt();
        t.start();//here start is traeted as a noramal method not like thread
        System.out.println("this is main Thread");
        t.start();//when u r using start methode once again then the output will be Exception handling 
    }
    
}
class Ttttttt extends Thread
{
    public void run()
    {
        System.out.println("child thread with start");
    }
}

