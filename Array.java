import java.util.Scanner;
class Array
{
public static void main(String args[])
{
System.out.println("Array topic recape");
System.out.println("enter the size of an array");
Scanner sc=new Scanner(System.in);
int n=sc.nextInt();
System.out.println("the size of aray enetered by you is ="+n);
int hm[]=new int[n];
int arr_size=hm.length;
System.out.println("the length of array is ="+arr_size);
for(int i=0;i<arr_size;i++)
{
hm[i]=sc.nextInt();
}
System.out.println("the element in your array");
for(int i=0;i<arr_size;i++)
{
System.out.println(hm[i]);
}
}
}