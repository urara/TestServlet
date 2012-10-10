package com.example;

import java.io.IOException;
import javax.servlet.*;
import javax.servlet.http.*;

public class MyServlet extends HttpServlet implements Servlet {

	private static final long serialVersionUID = 1L;

	public MyServlet() {
		super();
	}

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
	}

	protected void doPost(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("Shift_JIS");
		response.setContentType("text/html;charset=Shift_JIS");
		String str = request.getParameter("text1");
		str = this.getSanitizedString(str);
		str = "[JSP-to-SERVLET:\"" + str + "\"]";
		request.setAttribute("msg", str);
		// リダイレクト
		ServletContext context = this.getServletContext();
		RequestDispatcher dispatcher = context
				.getRequestDispatcher("/jsp/page.jsp");
		dispatcher.forward(request, response);
	}

	// サニタイズ処理
	public String getSanitizedString(String s) {
		String str = s;
		str = str.replace("<", "&lt;");
		str = str.replace(">", "&gt;");
		str = str.replace("\"", "&quot;");
		str = str.replace(" ", "&ensp;");
		return str;
	}
}