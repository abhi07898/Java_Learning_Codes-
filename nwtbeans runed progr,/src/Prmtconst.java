/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Prmtconst {
    public static void main(String args[])
    {
        System.out.println("THIS IS MAIN METHOAD");
        Abhishek obj=new Abhishek(12,21);
        int r=obj.largest();
        System.out.println("the largets value or smallest value is ="+r);
        
    }
}
class Abhishek
{
    int a,b;
    Abhishek(int x,int y)
    {
        a=x;
        b=y;
        System.out.println("The fierst value enetrede by you is ="+a+"then second value enetred by you is "+b);
    }
    int largest()
    {
     if(a>b)
     {
         return(a);
     }
     return b;
    }
}