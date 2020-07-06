/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class StatMethod {
public static void main(String args[])
    {
        System.out.println("this is main class and try bto use static keyword");
 System.out.println("the static variable call from anotherv class is ="+Sttt.a);
 System.out.println("the value of addtion using static keyword is ="+Sttt.add(12,12 ));
    }
}
class Sttt
{
    static int a=10;
    static int b=20;
    static int add(int x, int y)
    {
        return(a+b);
    }
    
}    

