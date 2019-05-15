package com.GrizzlyStore.DAO;

import java.util.List;

import com.GrizzlyStore.Model.AddProduct;

public interface GrizzlyStoreDAO {
public int login(String name,String password);
public int AddProducts(AddProduct a);
public List<AddProduct> listProduct();
public int deleteProduct(String productName);
public AddProduct viewProduct(String productName);
}
