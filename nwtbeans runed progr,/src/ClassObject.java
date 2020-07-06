/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class ClassObject {
    public static void main(String args[])
    {
        System.out.println("this is  the main class of this program");
    Abhi obj=new Abhi();
    int r,rr,rrr;
    r=obj.add(12,12);
    rr=obj.subtract(12,12);
    rrr=obj.multi(12,12);
   // System.out.println(r+"the vlaued is"+rr+" Subtracted is"+rr"Multiplied ");
    System.out.println(r);
    System.out.println(rr);
    System.out.println(rrr);
            
    }
}
    /**
     *
     */
     class Abhi
    {
        int a,b;
        
        int add(int x, int y )
        {
            a=x;
            b=y;
            return(a+b);
        }
        int subtract (int x, int y)
        {
            return(x-y);
        }
        int multi(int x, int y )
        {
            return(x*y);
        }
        
    }
