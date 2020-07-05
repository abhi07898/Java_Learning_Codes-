class pattern
{
public static void main(String args[])
{
int i,j;
int a=Integer.parseInt(args[0]);
System.out.println("try to print a pattern");
for(i=1;i<=a;i++)
{
for (j=1;j<=i;j++)
{
System.out.print(name[j]);
}
System.out.println();
}
System.out.println("this is main method");

int i,j,sp,k;
sp=a-1;
for(i=1;i<=a;i++)
{
for(j=1;j<=sp;j++)
System.out.print(" ");
}
sp--;
for(k=1;k<=i;k++)
{
System.out.println(k);
}
System.out.println();
}
}
}

