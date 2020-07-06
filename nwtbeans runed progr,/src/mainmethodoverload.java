/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
public class mainmethodoverload {
    public static void main(String args[])
    {
        System.out.println("Stringargs[]");
    }
    public static void main(String args)
    {
        //the output value is =string args[]
        System.out.println("Stringargs");
    }
    public static void main()
    {
        System.out.println("without Stringargs[]");
    }
}
