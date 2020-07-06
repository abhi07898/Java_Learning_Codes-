import java.sql.*;
class Jdbc1
{
public static void main(String rags[])
{
int empd=0,salary=0;
String ename=null;
Connection c;
Statement s;
int i;
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
c=DriverManager.getConnection("jdbc:oracle:thin:Qlocalhost:1521:xe","system","root");
s=c.createStqtement();
i=s.executeUpdate("insert into jdbc1 values('1A','Ravi',5000)");
if(i>0)
{
System.out.println("insertion successful");
}
else
{
System.out.println("insertion unsuccessful");
}
}
catch (Exception e)
{
System.out.println(e);
}
}
}