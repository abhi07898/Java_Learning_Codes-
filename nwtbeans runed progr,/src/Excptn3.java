/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */import java.util.*;
public class Excptn3 {
    public static void main(String args[])
    {
        System.out.println("gave the claer the topic of exception handling  tghrough Try Catch and finnaly");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enetr your First No");
        int a=sc.nextInt();
        System.out.println("Eneetr you second no.");
        int b=sc.nextInt();
        System.out.println("Eneter your 3 rd no");
        int c=sc.nextInt();
        int ans=a+b;
        System.out.println("the value added is ="+ans);
        try
        {
        int result=ans/c;
        System.out.println("the result is ="+result);
        }
       catch (ArithmeticException e)
       {
           System.out.println("divide by zero is not supported");
       }
        finally
        {
            System.out.println("If you want to print the rest of code% ");
            System.out.println("enetr again a no. for square root ");
            int d=sc.nextInt();
            System.out.println("the square root is = "+(d*d));
        }
        
    }
}
