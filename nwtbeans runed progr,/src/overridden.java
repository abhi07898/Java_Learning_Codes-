/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author APSOFT
 */
class Bank
{
int Interest()
{
return 0;
}
}
class UBI extends Bank
{
        int Interest()
{
return 8;
}
}
class ICICI extends Bank
{
    int Interest()            
    {
        return 9;
    }
}

class Axis extends Bank
{
    int Interest()
    {
        return 11;
    }
}
public class overridden {
    public static void main(String args[])
    {
        System.out.println("thi sis overriden process in java");
        UBI u=new UBI();
        ICICI i=new ICICI();
        Axis a=new Axis();
        System.out.println("the rate of UBI="+u.Interest());
        System.out.println("the rate of ICICI="+i.Interest());
        System.out.println("the rate of Axis="+a.Interest());
    }
}
