package com.example;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class HelloWorld extends HttpServlet {
    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request,
                      HttpServletResponse response)
        throws ServletException, IOException
    {
        // �R���e���c�^�C�v��ݒ�
        response.setContentType("text/html");
        // �o�͗pPrintWriter���擾
        PrintWriter out = response.getWriter();
        out.println("<HTML>");
        out.println("<BODY>");
        out.println("Hello World !!");
        out.println("</BODY>");
        out.println("</HTML>");
    }
}