import javax.servlet.http.*;
import javax.servlet.*;
import java.io.*;
public class DataErrorServlet extends HttpServlet{
public void doGet(HttpServletRequest request, HttpServletResponse response)
		throws IOException, ServletException{
	response.setContentType("text/html; charset=euc-kr");
	PrintWriter out = response.getWriter();
	out.println("<HTML>");
	out.println("<HEAD><TITLE>���� ���α׷� - ���� ȭ��</TITLE></HEAD>");
	out.println("<BODY>");
	out.println("�߸��� �����Ͱ� �ԷµǾ����ϴ�.");
	out.println("</BODY>");
	out.println("</HTML>");
	return;
	}
}