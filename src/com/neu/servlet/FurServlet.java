package com.neu.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.neu.entity.Fur;
import com.neu.service.FurService;

public class FurServlet extends HttpServlet {
	
	private FurService furService = new FurService();

	public void destroy() {
		super.destroy(); 
	}

	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setHeader("Access-Control-Allow-Origin", "*");
		
		response.setContentType("text/json;charset=utf-8"); 
		PrintWriter out =response.getWriter();
		List<Fur> furdatas = furService.findAllFurData();
		String json = furService.toJson(furdatas);
		out.print(json);
	}

	public void init() throws ServletException {
		// Put your code here
	}

}
