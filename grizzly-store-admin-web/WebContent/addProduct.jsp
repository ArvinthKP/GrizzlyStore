<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Add Product</title>
<link rel="stylesheet" href="./css/addProduct.css">
<link rel="stylesheet" href="./css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
</head>
<body>

<nav class="navbar navbar-expand-lg navbar-light bg-light">
  <a class="navbar-brand" href="#">
    <img src="./img/grizzlystore.PNG"  alt="">
  </a>

  <div class="collapse navbar-collapse" id="navbarSupportedContent">
    
    
        <ul class="navbar-nav mr-auto">
      <li class="nav-item">
            <form class="form-inline my-2 my-lg-0">
      		<input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
      		<button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
    		</form>
      </li>    
      
      <li class="nav-item">
      
        <form class="form-inline" action="./ListProductController">
    <button class="btn btn-outline-success" type="submit">List Products</button>
    
  	</form>   
      
      </li>
      
      <li class="nav-item">
        <a href="./addProduct.jsp" class="btn btn-outline-success my-2 my-sm-0" role="button" aria-pressed="true">Add Products</a>
      
      </li>
    </ul>
    
    <%HttpSession httpSession=request.getSession(); %>
    <ul class="navbar-nav ml-auto">
            <li class="nav-item ">
            <h3>Welcome <%out.print(httpSession.getAttribute("uname")+"  ");%> </h3>
            </li>
      <li class="nav-item floatNav" >
  		<a href="./index.jsp" class="btn btn-secondary btn-lg " role="button" >Logout</a>
      </li>
      
    </ul>

  </div>
</nav>

<!--<div class="container">-->

<div class="row">    
  <div class="col-2 marginProfile">
      <div class="card"   style="color: #F2F2F2;" >
          <nav class="navbar navbar-light" style="background-color: #F2F2F2;">
                <span class="navbar-text">
                PROFILE
                </span>
              <a href="./EditController">Edit</a>
          </nav>          
      </div>

      <img src="./img/addIcon.png" class="profileImg" >
      <center><h3><%out.print(httpSession.getAttribute("uname")+" ");%>   </h3></center>

  </div>
<div class="col-6 marginProduct">
<nav class="navbar navbar-expand-sm bg-light navbar-light">
  <ul class="navbar-nav">
    <li class="nav-item active">
      <a class="" href=""><button type="button" class="product product-primary product-lg">Product</button></a>
    </li>
    <li class="nav-item">
      <a class="" href=""><button type="button" class="vendor vendor-primary vendor-lg">Vendor</button></a>
    </li>
  </ul>
</nav>
<div class="row">
<div class="col">
<img src="./img/product-add.jpg" width=100% height=100% id="staticimage">
</div>  

<div class="col products">
    <form method="post" action="/grizzly-store-admin-web/AddProductController"> 
<input type="text" name="productID" placeholder="Enter ProductID" class="inp"><br>
<input type="text" name="productName" placeholder="Enter Product Name" class="inp"><br>
<input type="text" name="brand" placeholder="Brand" class="inp"><br>
  <input list="category" name="category">
  <div class="inp">
  <datalist id="category">
    <option value="Console">
    <option value="Games">
    <option value="Mobiles">
    <option value="Pantry">
    <option value="Health Care">
  </datalist>
  </div>
  <input type="text" name="description" placeholder="Description" class="inp"><br>
  <input type="text" name="price" placeholder="Price" class="inp"><br>
  <input type="text" name="rating" placeholder="Rating" class="inp"><br>
  <button class="btn btn-primary" type="submit">Add</button>
    </form>
</div>  
</div>
</div>
</div>

<!--<script type="text/javascript">$('.dropdown-toggle').dropdown();</script>-->
   
<!--</div>-->
</body>
</html>