/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class refrnc2 {
    public static void main(String args[])
    {
        System.out.println("this is main class that in this constructore throug suoer keyword");
        //Animal obj=new Animal();
        Dog obj=new Dog();
    }
    
}
class Animal
{
    Animal()
    {
        System.out.println("all the animal had mind but it can't explain anything the heppened in the world ");        
    }
}
class Dog extends Animal
{
    Dog()
    {
     super();
     System.out.println("this is dog class that implement the quality of Animal class that is super class");
    }
    
}