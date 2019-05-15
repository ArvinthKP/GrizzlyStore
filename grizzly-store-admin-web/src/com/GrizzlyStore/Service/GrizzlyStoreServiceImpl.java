package com.GrizzlyStore.Service;

import java.util.List;

import com.GrizzlyStore.DAO.GrizzlyStoreDAOImpl;
import com.GrizzlyStore.Model.AddProduct;

public class GrizzlyStoreServiceImpl implements GrizzlyStoreService {

	public int login(String name,String password)
	{
		int i=new GrizzlyStoreDAOImpl().login(name,password);
		return i;
	}
	
	public int AddProducts(AddProduct a)
	{
		int i=new GrizzlyStoreDAOImpl().AddProducts(a);
		return i;
	}
	public List<AddProduct> listProduct(){
		List<AddProduct> l=new GrizzlyStoreDAOImpl().listProduct();
		return l;
	}

	public int deleteProduct(String productName) {
		int i=new GrizzlyStoreDAOImpl().deleteProduct(productName);
		return i;
	}

	public AddProduct viewProduct(String productName) {
		AddProduct a = new GrizzlyStoreDAOImpl().viewProduct(productName);
		return a;
	}
	
}
