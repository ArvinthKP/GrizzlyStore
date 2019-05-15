package com.GrizzlyStore.Controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.GrizzlyStore.Model.AddProduct;
import com.GrizzlyStore.Service.GrizzlyStoreServiceImpl;


/**
 * Servlet implementation class ListProductController
 */
@WebServlet("/ListProductController")
public class ListProductController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ListProductController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		String name=(String) request.getAttribute("userName");
		List<AddProduct> l=null;
		try {
			l= new GrizzlyStoreServiceImpl().listProduct();
		} catch (Exception e) {
			System.out.println(e);
		}
		if(l!=null)
		{
			request.setAttribute("custList", l);
			request.setAttribute("userName",name);
			RequestDispatcher rd=request.getRequestDispatcher("./listProduct.jsp");
			rd.forward(request, response);
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
