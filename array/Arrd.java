import java.util.Scanner;
class Arrd
{
public static void main(String args[])
{
System.out.println("try to use multidimensional array");
Scanner obj=new Scanner(System.in);
System.out.println("enter the no of rows");
int n=obj.nextInt();
System.out.println("enetr the no of columns ");
int m=obj.nextInt();
int num[][]=new int[n][m];
for(int i=0;i<n;i++)
{
for(int j=0;j<m;j++)
{
System.out.println("enet your values");
num[i][j]=obj.nextInt();
}
}
System.out.println("the number entered by you ");
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