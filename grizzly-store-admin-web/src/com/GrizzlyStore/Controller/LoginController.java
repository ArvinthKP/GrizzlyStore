package com.GrizzlyStore.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.GrizzlyStore.Service.GrizzlyStoreServiceImpl;

/**
 * Servlet implementation class LoginController
 */

public class LoginController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public LoginController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw=response.getWriter();
		String name=request.getParameter("userName");
		String password=request.getParameter("password");
		int i=new GrizzlyStoreServiceImpl().login(name,password);		
		if(i!=0)
		{
			pw.println("<h2>Success</h2>");
			HttpSession httpSession=request.getSession();
			httpSession.setAttribute("uname", name);
			
			request.setAttribute("userName",name);			
			RequestDispatcher rd=request.getRequestDispatcher("./addProduct.jsp");
			rd.forward(request,response);
		}
		else {
			RequestDispatcher rd=request.getRequestDispatcher("./index.jsp");
			rd.forward(request,response);
		}
	}

}
