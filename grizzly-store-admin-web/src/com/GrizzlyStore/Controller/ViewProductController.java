package com.GrizzlyStore.Controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GrizzlyStore.Model.AddProduct;
import com.GrizzlyStore.Service.GrizzlyStoreServiceImpl;

/**
 * Servlet implementation class ViewProductController
 */
@WebServlet("/ViewProductController")
public class ViewProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ViewProductController() {
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
		AddProduct a=new GrizzlyStoreServiceImpl().viewProduct(productName);
		request.setAttribute("productName", a.getProductName());
		request.setAttribute("brand", a.getBrand());
		request.setAttribute("description",a.getDescription());
		request.setAttribute("price", a.getPrice());
		String name=(String) request.getAttribute("userName");
		request.setAttribute("userName",name);
		RequestDispatcher rd=request.getRequestDispatcher("./view.jsp");
		rd.forward(request,response);
	
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
