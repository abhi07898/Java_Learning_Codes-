/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Constructor {
    public static void main(String arggs[])
    {
            System.out.println("main Class");  
             Abhis obj=new Abhis();
    obj.show();
        
    }
   
   
}
class Abhis
{
    Abhis()
    {
        System.out.println("hello this is deafult construcetro");
    }
    public void show()
    {
        System.out.println("hello this is another class that is csll inn mainm class");
    }
            
            }
