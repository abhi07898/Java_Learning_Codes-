import java.util.Scanner;
class Arrrrray
{
public static void main(String args[])
{
int sum=0;
System.out.println("try to use java concept");
Scanner obj=new Scanner(System.in);
System.out.println("PLs enetr the size of array");
int n=obj.nextInt();
int array[]=new int[n];
System.out.println("the length of array entered by you is ="+n);
for(int i=0;i<array.length;i++)
{
System.out.println("pls eneter value for array");
array[i]=obj.nextInt();
}
System.out.println("the no eneterde by in a array is =");
for(int i=0;i<array.length;i++)
{
System.out.println(" "+array[i]);
sum=sum+array[i];
}
System.out.println("the total additoin of array element ="+sum);
}
}