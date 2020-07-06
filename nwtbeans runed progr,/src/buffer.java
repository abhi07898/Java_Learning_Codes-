/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
import java.io.*;
import java.util.*;
public class buffer {
    public static void main(String abhi[])
    {
        Scanner obj=new Scanner(System.in);
        System.out.println("haii this is abhishek pandet");
       
        System.out.println("pls enetr any no.");
         int a=obj.nextInt();
         System.out.println("enetr another no. for suare");
         int b=obj.nextInt();
         int add=a+b;
         System.out.println("this is added value ="+add);
         Expr objj = new Expr();
         objj.multi(a,b);
    }
}
class Expr
{
    void multi(int a, int b)
    {
        System.out.println("the multiplied value ="+a*b);
    }
}
