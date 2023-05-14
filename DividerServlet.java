import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DividerServlet extends HttpServlet{
  public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
	String str1= request.getParameter("NUM1");
	String str2= request.getParameter("NUM2");
	int num1 = Integer.parseInt(str1);
	int num2 = Integer.parseInt(str2);
	int result = num1/num2;
	response.setContentType("text/html; charset=euc-kr");
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>³ª´°¼À ÇÁ·Î±×·¥</TITLE></HEAD>");
	out.println("<BODY>");
	out.printf("%d/%d=%d",num1,num2,result);
	out.println("</BODY>");
	out.println("</HTML>");
	}
}