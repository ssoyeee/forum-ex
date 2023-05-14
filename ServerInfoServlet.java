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
	out.println("<HEAD><TITLE>�� ������ ����</TITLE></HEAD>");
	out.println("<BODY>");
	out.printf("�� ������ ����:%s <BR>",serverInfo);
	out.printf("�����ϴ� ���� ����:%d.%d <BR>",majorVersion,minorVersion);
	out.println("</BODY>");
	out.println("</HTML>");
}
}