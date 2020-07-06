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
public class Buffered {
    public static void main(String args[])throws Exception
    {
        System.out.println("this i s another program, in which i am trying to make a another commond line uprogram using buffred class");
        InputStreamReader isr=new InputStreamReader(System.in);
        BufferedReader br=new BufferedReader(isr);
        System.out.println("pls enetr any string");
       String str=br.readLine(); 
       System.out.println(str);
       System.out.println("the length of string enetred by you="+str.length());
    }
    
}
