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
public class buffrrd {
    public static void main(String args[]) throws Exception
    {
        System.out.println("try to use buffrede classs with mathematical function");
    InputStreamReader isr=new InputStreamReader(System.in);
    BufferedReader br=new BufferedReader(isr);
    int a=25;
    int b=2;
    float c=12.2;
    System.out.println("the square root of"+Math.sqrt(a));
    System.out.println("the power concept of "+ Math.pow(a,b));
    System.out.println("maximum  value in this concept"+Math.max(a, b));
     System.out.println("minimum  value in this concept"+Math.min(a, b));
    }
}
