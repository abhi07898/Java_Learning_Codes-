/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
import java.util.Scanner;
public class Excptn2 {
    public static void main(String args[])
    {
        System.out.println("this is maoin method");
        Scanner obj=new Scanner(System.in);
        System.out.println("pls enter your first No.");
        int a=obj.nextInt();
        System.out.println("Enetr your Second number");
        int b=obj.nextInt();
        try
        {
        int ans=a/b;
        }
        catch(ArithmeticException e)
        {
            System.out.println("this method is not support give you a Arithmetic Exception");
        }
    }
}