/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Statickey {
    public static void main(String args[])
    {
        System.out.println("this is main class and try bto use static keyword");
 System.out.println("the static variable call from anotherv class is ="+Stt.a);
    }
}
class Stt
{
    static int a=10;
}