import java.util.Scanner;
class Arrray
{
public static void main(String args[])
{
System.out.println("try to make a new program thats belongs from array topic");
System.out.println("ENeter th elength of array");
Scanner obj=new Scanner(System.in);
int n=obj.nextInt();
int arr[]=new int[n];
for(int i=0;i<arr.length;i++)
{
arr[i]=obj.nextInt();
}
System.out.println("the valued entered by you is=");
for(int i=0;i<arr.length;i++)
{
System.out.println(arr[i]+" ");
}
}
}