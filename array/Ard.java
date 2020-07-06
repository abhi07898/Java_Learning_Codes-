import java.util.Scanner;
class Ard
{
public static void main(String args[])
{
System.out.println("2 d array by user input methode");

Scanner obj=new Scanner(System.in);
System.out.println("Eneter the no. of rows");
int n=obj.nextInt();
System.out.println("Eneter the no of columns ");
int m=obj.nextInt();
int num[][]=new int[n][m];
System.out.println("eneter the numbers fro your 2d array content ");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
num[i][j]=obj.nextInt();
}
}
System.out.println("the value entered by you in array is =");
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.print(num[i][j]+" ");
}
System.out.println();
}
}
}