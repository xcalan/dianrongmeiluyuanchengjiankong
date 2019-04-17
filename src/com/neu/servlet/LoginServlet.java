package com.neu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class LoginServlet extends HttpServlet {


	public void destroy() {
		super.destroy(); // Just puts "destroy" string in log
		// Put your code here
	}


	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
				
		String _userName = req.getParameter("username");
		String _passWord = req.getParameter("password");
		resp.setContentType("text/html;charset=UTF-8");
		PrintWriter out = resp.getWriter();
		
		if ("admin".equals(_userName) && "123456".equals(_passWord)) {
//			resp.sendRedirect("/show_system_xc_3.25/index.html");
			out.write("<script language='javascript'>alert('登陆成功！');"
					+ "window.location.href='"+req.getContextPath()+"/index.html';</script>");
		} else {
//			_printWriter.println("<html><body>");
//			_printWriter.println("用户名或密码有误，请返回");
//			_printWriter.println("</body></html>");
			
	        
	        out.write("<script language='javascript'>alert('用户名或密码错误！');"
			+ "window.location.href='"+req.getContextPath()+"/login.html';</script>");
//			resp.sendRedirect("/show_system_xc_3.25/login.html");
		}
		
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
