/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class StatsMethod1 {
public static void main(String args[])
    {
        System.out.println("this is main class and try bto use static keyword");
 System.out.println("the static variable call from anotherv class is ="+Stttt.a);
 System.out.println("the value of addtion using static keyword is ="+Stttt.add());
   System.out.println("thsi is use  static keyword in method without parametrised lists");
    }
}
class Stttt
{
    static int a=10;
    static int b=20;
    static int add()
    {
        return(a+b);
    }
    
}  

