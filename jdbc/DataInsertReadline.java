import java.sql.*;
import java.io.*;
class DataInsertReadline
{
public static void main(String args[])
{
int eno=0,salary;
String ename=null;
salary=0;
Connection c;
Statement s;
int i;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
c=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","Pandey");
s=c.createStatement();
System.out.println("PLs enter the data as eno , ename , sal for insert into data base");
DataInputStream in=new DataInputStream(System.in);
	eno=Integer.parseInt(in.readLine());
	ename=in.readLine();
	salary=Integer.parseInt(in.readLine());
i=s.executeUpdate("insert into winjava values("+eno+",'"+ename+"',"+salary+")");
if(i>0)
System.out.println("insertion successfully "+i);
else
System.out.println("insertion unsuccecsfully");

}
catch (Exception e)
{
System.out.println(e);
}
}
} 