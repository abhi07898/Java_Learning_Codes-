// one try block ha multiple catch block 

class Test 
{
int[] ar=new int[5];
Test()
{
ar[0]=10;
ar[1]=11;
ar[2]=12;
ar[3]=13;
ar[4]=14;
ar[5]=22;
}
void show()
{
try 
{
for(int i=0;i<5;i++)
{
System.out.println(ar[i]);
}
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Going out of Array Size");
}
catch(ArrayStoreException e)
{
System.out.println("Array not storing Data ");
}
catch(Exception e)
{
System.out.println("InputOutputError");
}
}
}
class Exec4
{
public static void main(String args[])
{
Test obj=new Test();
obj.show();
}
}
 