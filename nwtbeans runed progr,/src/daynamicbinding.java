/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class daynamicbinding {
    public static void main(String args[])
    {
        System.out.println("this is daynamic binding and too smart and run time polymorphism or overriding");
        Shape s;
        s=new Shape();
        s.draw();
        s=new Circle();
        s.draw();
        s=new React();
        s.draw();
        s=new Triangle();
        s.draw();
        
    }
}
class Shape{
void draw()
{
    System.out.println("no drawing");
}
}
class Circle extends Shape
{
    void draw()
    {
        System.out.println("Drawing circle");
    }
}
class React extends Shape
{
    void draw()
    {
        System.out.println("drawing Rectangle");
    }
}

class Triangle extends Shape
{
void draw()
{
    System.out.println("Drawing triangle");
}
}