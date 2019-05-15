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
 * Servlet implementation class AddProductController
 */
@WebServlet("/AddProductController")
public class AddProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddProductController() {
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
		Integer productID=Integer.parseInt(request.getParameter("productID"));
		String productName=request.getParameter("productName");
		String brand=request.getParameter("brand");
		String category=request.getParameter("category");
		String description=request.getParameter("description");
		Float price=Float.parseFloat(request.getParameter("price"));
		Float rating=Float.parseFloat(request.getParameter("rating"));
		AddProduct a=new AddProduct(productID,productName,brand,category,description,price,rating);
		int i=0;
		i=new GrizzlyStoreServiceImpl().AddProducts(a);
		String name=(String) request.getAttribute("userName");
		request.setAttribute("userName",name);
		
		
			if(i!=0)
			{
			RequestDispatcher rd=request.getRequestDispatcher("./addProduct.jsp");
			rd.forward(request,response);
			}
			
	
		
		
		
	}

}
