package com.GrizzlyStore.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.GrizzlyStore.JdbcConnection;
import com.GrizzlyStore.Model.AddProduct;
import com.GrizzlyStore.Model.Login;


public class GrizzlyStoreDAOImpl implements GrizzlyStoreDAO {

	private static final ArrayList<Object> AddProduct = null;

	public int login(String name,String password)
	{
		int i=0;
		Connection con=null;
		Login l = new Login();
		try {
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("select * from login where uname=?");
			ps.setString(1, name);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				
				l.setUserName(rs.getString(1));
				l.setPassword(rs.getString(2));
				l.setAttempt(rs.getInt(3));
				l.setCurrentStatus(rs.getInt(4));
			}
			if(password.equals(l.getPassword())&&(l.getCurrentStatus()==0))
			{
				i=1;
			}
			else  {
				ps=con.prepareStatement("update login set attemp=?,status=? where uname=?");
				ps.setInt(1, l.getAttempt()+1);
				if(l.getAttempt()==3)
				ps.setInt(2,l.getCurrentStatus()+1);
				else
					ps.setInt(2, l.getCurrentStatus());
				ps.setString(3, name);
				ps.executeUpdate();
			}
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			
			try {
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return i;
	}
	
	public int AddProducts(AddProduct a)
	{
		int i=0;
		Connection con=null;
		
		try {
			con=JdbcConnection.getConnection();
			PreparedStatement ps=con.prepareStatement("insert into addProduct values(?,?,?,?,?,?,?)");
			ps.setInt(1, a.getProductID());
			ps.setString(2, a.getProductName());
			ps.setString(3, a.getBrand());
			ps.setString(4, a.getCategory());
			ps.setString(5, a.getDescription());
			ps.setFloat(6, a.getPrice());
			ps.setFloat(7, a.getRating());
			i=ps.executeUpdate();
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(con!=null)
					con.close();
				
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		return i;
	}
	
	public List<AddProduct> listProduct(){
		Connection con=null;
		List<AddProduct> l=new ArrayList<>();
		try {
			con=JdbcConnection.getConnection();
			Statement st=con.createStatement();
			ResultSet rs=st.executeQuery("Select productName,brand,category,rating from addproduct");
			while(rs.next())
			{
				AddProduct a=new AddProduct();
				
				a.setProductName(rs.getString(1));
				a.setBrand(rs.getString(2));
				a.setCategory(rs.getString(3));
				
				a.setRating(rs.getFloat(4));
				l.add(a);
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				if(con!=null)
					con.close();
			} catch (Exception e2) {
				System.out.println(e2);
			}
		}
		
		
		return l;
		
	}

	public int deleteProduct(String productName) {
		Connection con=JdbcConnection.getConnection();
		PreparedStatement ps;
		int i=0;
		try {
			ps = con.prepareStatement("delete from addproduct where productName=?");
			ps.setString(1, productName);
			 i=ps.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return i;
	}
	
	public AddProduct viewProduct(String productName) {
		Connection con=null;
		AddProduct a=null;
		try {
			con=JdbcConnection.getConnection();
			
			PreparedStatement ps=con.prepareStatement("select productName,brand,description,price from addproduct where productName=?");
			ps.setString(1, productName);
			ResultSet rs=ps.executeQuery();
			while(rs.next())
			{
				a=new AddProduct();
				a.setProductName(rs.getString(1));
				a.setBrand(rs.getString(2));
				a.setDescription(rs.getString(3));
				a.setPrice(rs.getFloat(4));
			}
			
			
			
		} catch (Exception e) {
			System.out.println(e);
		}
		finally {
			try {
				con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}	
		
		
		return a;
		
		
	}

	

	
}
