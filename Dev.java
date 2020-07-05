class Dev
{
public static void main(String args[])
{
System.out.println("try to use trinary operatore");
int i,j,k,sp;
int a=Integer.parseInt(args[0]);
sp=a-1;
for(i=1;i<=a;i++)
{
for(j=1;j<=sp;j++)
{
System.out.print(" ");
}
sp--;
for(k=1;k<=i;k++)
{
System.out.print(k);
}
System.out.println();
}
}
}