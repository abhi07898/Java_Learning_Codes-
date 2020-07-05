class dai
{
public static void main(String args[])
{
System.out.println("this si daimond");
int i,sp,p,n=5,no;
no=n-1;
int value=1;
for(i=1;i<=n;i++)
{
for(sp=1;sp<=no;sp++)
{
System.out.print(" ");
}
no--;
for(p=1;p<=i;p++)
{
System.out.print(" "+value);
value++;
}

System.out.println();
}
}
}