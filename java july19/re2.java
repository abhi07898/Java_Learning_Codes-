class re2
{

public static void main(String abhi[])
{

int num=1221;
int temp=num;
int rev=0,rem;
while(temp!=0)
{
rem=temp%10;
rev=rev*10+rem;
temp=temp/10;
}
if(num==rev)
{
System.out.println(num+"value is palindrom number");
}
else
{
System.out.println(num+"value is not palindrom number");
}
}
}