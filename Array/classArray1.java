// array list

/*array list support dayanimic arraythat can grow as needed.

Standrad java Array are of a fixed lenght 
After array area created they cant grow or shrink ,which means that you must know in advance how many element are 
array in hold.

array  list  area created with an intial size.
when the size is excedded , the collection is autometically enlarged .
When object are removed yhe array size autometically decrisease .*/
//no data dtpe required 

import java.io.util.*;
public class classArray1
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
System.out.println("Initial size of al="+al.size());
//add elkement in the array lisy 
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
al.remove(2);
System.out.println("Size of al after deletion element "+al.size());
System.out.println("Contents of al:"+al);
}
}

 