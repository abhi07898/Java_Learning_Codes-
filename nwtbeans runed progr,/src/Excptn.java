/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Excptn {
    public static void main(String args[])
    {
        System.out.println("this is amin method");
        try
        {
        int a=100/0;
        
        System.out.println(a);
        }
    
        catch(ArithmeticException e)
                {
                    System.out.println("the divide by o is not supported");
                }
}
}
