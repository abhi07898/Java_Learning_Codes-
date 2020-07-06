import java.util.*;
//array list belong from  java.util.* package 
public class ArrayLst
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
System.out.println("Initial size of al="+al.size());
//add element in the array list 
al.add("A");
al.add("b");
al.add("c");
al.add("d");
al.add("f");
al.add(2,"A2");
System.out.println("Size of al after addition element "+al.size());
//display the array list 
System.out.println("Contents of al:"+al);
al.remove("A2");
al.remove(3);
System.out.println("Size of al after deletion element "+al.size());
System.out.println("Contents of al:"+al);
}
}
