import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class ServerInfoServlet extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
	ServletContext context=getServletContext();
	String serverInfo = context.getServerInfo();
	int majorVersion = context.getMajorVersion();
	int minorVersion = context.getMinorVersion();
	response.setContentType("text/html; charset=euc-kr");
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>웹 서버의 정보</TITLE></HEAD>");
	out.println("<BODY>");
	out.printf("웹 서버의 종류:%s <BR>",serverInfo);
	out.printf("지원하는 서블릿 버전:%d.%d <BR>",majorVersion,minorVersion);
	out.println("</BODY>");
	out.println("</HTML>");
}
}