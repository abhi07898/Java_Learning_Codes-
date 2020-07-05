class fadu
{
public static void main(String args[])
{
System.out.println("make a fadu pyarmid with fadu techniques");
int r,sp,p,no,n;
int value=1;
no=5;
n=no;
for(r=1;r<=no;r++)
{
for(sp=1;sp<=n;sp++)
{
System.out.print(" ");
}
n--;
for(p=1;p<=r;p++)
{
System.out.print(" "+value);
value++;
}
System.out.println();
}
int i,j,k;
int m=0;
for(i=no;i<=0;i++)
{
for(j=0;j<=m;j++)
{
System.out.print("");
}
m++;
for(k=0;k<=i;k++)
{
System.out.print(" " +value);
value++;
}
System.out.println();
}
}
}