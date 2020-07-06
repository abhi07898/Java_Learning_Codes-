import java.io.*;
class Test
{
BufferedReader br=new BufferedReader(new InputStreamReader(System.in));
int[] arr=new int[5];

void input()
{
System.out.println("Pls eneter any five number");
try
{
for(int i=0;i<5;i++)
{
arr[i]=br.readLine();
}
}
catch(Exception e){}
}
}
class ForEach
{
public static void main(String args[])
{
int i=0;
//print all the array element
Test obj=new Test(); 
for(int elem:arr[i])
{
System.out.println(elem);
}
obj.input();
}
}