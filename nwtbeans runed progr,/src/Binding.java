/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Binding {
    public static void main(String args[])
    {
        System.out.println("Binding thats have two type static and daynamic binding");
        Area obj=new Area();
        obj.area(12.5f);
        obj.area(12.0f, 12.0f);
    }
}
class Area
{
    void area(float x)
    {
        float pi=3.14f;
        float a=pi*x;
        System.out.println("the area of circle by first method is = "+a);
    }
    void area(float x, float y)
    {
        float ar=x*y;
        System.out.println("the area os rectangle by second same name mehtode="+ar);
    }
}
