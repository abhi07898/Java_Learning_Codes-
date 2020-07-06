//return array from function 
class classArray
{
public static void mian(String args[])
{
classArray x=new classArray();
int[] myList={10,111,20,30};

int[] res; //blank array decl
res=x.reverse(myList);//passs myKist in reverse function
for(int element:res);
{
System.out.println(element);
}


//revrese fun return a int type array 
public int[] reverse(int[] myList)
{

int[] result=new int[myList.length]; // 4

      //            3             0    4

for(int i=0,j=result.length-1;i<myList.length;i++,j--)
{
result[j]=myList[i];
}
return result;//  return to res
}
}
}