<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%> 
<!DOCTYPE html >
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>List Product</title>
<link rel="stylesheet" href="./css/listProduct.css">
<link rel="stylesheet" href="./css/bootstrap.css">
<script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
<script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
<script type="text/javascript">
	function deleteproduct(productName){
		if(confirm('Do you want to remove this Product ?')){
			var url='./RemoveProductController?productName='+productName;
			window.location.href=url;
		}
	}
	function viewproduct(productName){
		
			var url='./ViewProductController?productName='+productName;
			window.location.href=url;
		
	}
</script>
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
   
      <a href="./ListProductController" class="btn btn-outline-success my-2 my-sm-0" role="button" aria-pressed="true">List Products</a>
    
      
      </li>
      
      <li class="nav-item">
        <a href="./addProduct.jsp" class="btn btn-outline-success my-2 my-sm-0" role="button" aria-pressed="true">Add Products</a>
      
      </li>
    </ul>
    
    <%HttpSession httpSession=request.getSession(); %>
    <ul class="navbar-nav ml-auto">
            <li class="nav-item ">
            <h3>Welcome <%out.print(httpSession.getAttribute("uname")+" ");%> </h3>
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
<table class="table">
  <thead class="thead-dark">
  <tr>
    <th></th>
    <th>Product List</th>
    <th>Product Brand</th> 
    <th>Category</th>
    <th>Ratings</th>
    <th></th>
    <th></th>
    <th></th>     
  </tr>
  </thead>
  <tbody>
<c:forEach items="${custList }" var="product">
<tr>
  <td></td>
<td>${product.productName }</td>
<td>${product.brand }</td>
<td>${product.category }</td>
<td>${product.rating }</td>
<td><button type="button" class="btn btn-outline-info" onclick="javascript:viewproduct('${product.productName}')">View</button></td>
<td><button type="button" class="btn btn-outline-info">Block</button></td>
	<td><button type="button" class="btn btn-outline-info" onclick="javascript:deleteproduct('${product.productName}')">Remove</button></td>
	</tr>
	</c:forEach>
  </tbody>
</table>
</div>
</div>
</div>

<!--<script type="text/javascript">$('.dropdown-toggle').dropdown();</script>-->
   
<!--</div>-->
</body>
</html>