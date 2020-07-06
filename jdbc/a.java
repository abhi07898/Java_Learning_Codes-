import java.sql.*;
public class a
{
public static void main(String args[])
{
int eno=0,salary=0;
String ename=null;
Connection c;
Statement st;
int i;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
c=DriverManager.getConnection("Jdbc:oracle:thin:@localhost:1521:xe","system","Pandey");
st=c.createStatement();
i=st.executeUpdate("insert into winjava values (2,'ravi',5000)");
if(i>0)
{
System.out.println("insertion successfully "+i);
}
else
{
System.out.println("insertion unsuccessfully");
}
}
catch(Exception e)
{
System.out.println(e);
}
}
}
