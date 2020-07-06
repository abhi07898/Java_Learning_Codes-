import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
public class Myservlet extends HttpServlet
{
public void doGet(HttpServletRequest reg,HttpServletResponse res)throws ServletException,IOException
{
PrintWriter pw=res.getWriter();
pw.println("Hello Servlet");
}
} 