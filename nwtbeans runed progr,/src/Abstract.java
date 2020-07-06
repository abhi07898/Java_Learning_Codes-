/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class Abstract {
    public static void main(String args[])
    {
        System.out.println("this is ABstract class practises");
        y obj=new y();
        obj.disp();
    }
}

abstract class x
{
    abstract void disp();
}
class y extends x
{
    void disp()
    {
        System.out.println("this is method related to abstract class x");
    }
}