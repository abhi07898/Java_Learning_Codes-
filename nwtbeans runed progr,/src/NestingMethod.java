/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class NestingMethod {
    public static void main(String args[])
    {
        System.out.println("try to use nesting methiod");
        Nesting obj=new Nesting();
        int a=obj.add(12,12);
        obj.disp();
        System.out.println("the added value is ="+a);
    }
            
    
}
class Nesting
{
    int a,b;
    int add(int x, int y)
    {
        a=x;
        b=y;
        return(a+b);
    }
    int largest()
    {
        if(a>b)
        {
            return a;
        }
        else 
        {
            return b;
        }
    }
    void disp()
    {
        int res=largest();
        System.out.println("thye largest value is ="+res);
    }
  
   }
