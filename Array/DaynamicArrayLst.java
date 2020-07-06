import java.util.*;
class DayanamicArrayLst
{
public static void main(String args[])
{
ArrayList al=new ArrayList();
Scanner sc=new Scanner(System.in);
int i=0;
System.out.println("How many elemnet enter in array");
int size=sc.nextInt();
while(i<size)
{
System.out.println("eneter data");
al.add(sc.nextInt());
i++;
}
for(int x=0;x<al.size();x++)
System.out.println(al.get(x));
}
}