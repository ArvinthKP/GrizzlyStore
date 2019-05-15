package com.GrizzlyStore.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GrizzlyStore.Service.GrizzlyStoreServiceImpl;

/**
 * Servlet implementation class RemoveProductController
 */
@WebServlet("/RemoveProductController")
public class RemoveProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RemoveProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter pw = response.getWriter();
		String productName=request.getParameter("productName");
		int i=0;
		i=new GrizzlyStoreServiceImpl().deleteProduct(productName);
		
			System.out.println("get");
			String name=(String) request.getAttribute("userName");
			request.setAttribute("userName",name);
			RequestDispatcher rd=request.getRequestDispatcher("./ListProductController");
			rd.forward(request,response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		response.setContentType("text/html");
//		PrintWriter pw = response.getWriter();
//		String productName=request.getParameter("productName");
//		int i=0;
//		i=new GrizzlyStoreServiceImpl().deleteProduct(productName);
//			System.out.println("post");
//			RequestDispatcher rd=request.getRequestDispatcher("./ListProductController");
//			rd.forward(request,response);
		
	}

}
