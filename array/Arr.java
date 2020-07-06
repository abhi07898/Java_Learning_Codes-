//program of 2 d array by taken user input concept
import java.util.Scanner;
class Arr
{
public static void main(String args[])
{
System.out.println("try to make a 2 d array ");
int num[][]=new int[3][3];
Scanner obj=new Scanner(System.in);
System.out.println("pls enter the values for array ");
for(int i=0;i<num.length;i++)
{
for(int j=0;j<num.length;j++)
{
num[i][j]=obj.nextInt();
}
}
System.out.println("the value entered by you in array =");
for(int i=0;i<num.length;i++)
{
for(int j=0;j<num.length;j++)
{
System.out.print(num[i][j]+" ");
}
System.out.println();
}
}
}