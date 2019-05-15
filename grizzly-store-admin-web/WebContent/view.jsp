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
      <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo"
        crossorigin="anonymous"></script>
      <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1"
        crossorigin="anonymous"></script>
      <script src="https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js" integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
        crossorigin="anonymous"></script>

      <script type="text/javascript">
        function deleteproduct(productName) {
          if (confirm('Do you want to remove this Product ?')) {
            var url = './RemoveProductController?productName=' + productName;
            window.location.href = url;
          }
        }
      </script>
    </head>

    <body>

      <nav class="navbar navbar-expand-lg navbar-light bg-light">
        <a class="navbar-brand" href="#">
      <img src="./img/grizzlystore.PNG" alt="">
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


          <ul class="navbar-nav ml-auto">
            <li class="nav-item ">
              <h3>Welcome
                <%=request.getAttribute("userName")+"  "%>
              </h3>
            </li>
            <li class="nav-item floatNav">
              <a href="./index.jsp" class="btn btn-secondary btn-lg " role="button">Logout</a>
            </li>

          </ul>

        </div>
      </nav>

      <!--<div class="container">-->

      <div class="row">
        <div class="col-2 marginProfile">
          <div class="card" style="color: #F2F2F2;">
            <nav class="navbar navbar-light" style="background-color: #F2F2F2;">
              <span class="navbar-text">
                PROFILE
                </span>
              <a href="./EditController">Edit</a>
            </nav>
          </div>

          <img src="./img/addIcon.png" class="profileImg">
          <center>
            <h3>
              <%=request.getAttribute("userName") %>
            </h3>
          </center>

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
            <div class="col-2">
              <h3 style="margin-left: 30%;">
                <%=request.getAttribute("productName") %> By
                  <%=request.getAttribute("brand") %> <span class="glyphicon glyphicon-pencil"></span></h3>

            </div>
          </div>
          <div class="row" style="margin-left:5px;">
            <div class="col-6">
              <div id="carouselExampleIndicators" class="carousel slide" data-ride="carousel">
                <ol class="carousel-indicators">
                  <li data-target="#carouselExampleIndicators" data-slide-to="0" class="active"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="1"></li>
                  <li data-target="#carouselExampleIndicators" data-slide-to="2"></li>
                </ol>
                <div class="carousel-inner">
                  <div class="carousel-item active">
                    <img class="d-block w-100" src="./img/2.jpg" alt="First slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="./img/1.jpg" alt="Second slide">
                  </div>
                  <div class="carousel-item">
                    <img class="d-block w-100" src="./img/3.jpg" alt="Third slide">
                  </div>
                </div>
                <a class="carousel-control-prev" href="#carouselExampleIndicators" role="button" data-slide="prev">
      <span class="carousel-control-prev-icon" aria-hidden="true"></span>
      <span class="sr-only">Previous</span>
    </a>
                <a class="carousel-control-next" href="#carouselExampleIndicators" role="button" data-slide="next">
      <span class="carousel-control-next-icon" aria-hidden="true"></span>
      <span class="sr-only">Next</span>
    </a>
              </div>
            </div>
            <div class="col">
              <h3>Description <span class="glyphicon glyphicon-pencil"></span></h3>
              <p>
                <%=request.getAttribute("description") %>
              </p>
              <br><br><br><br>
              <h3>Rs
                <%=request.getAttribute("price") %>
              </h3>
            </div>
          </div>
        </div>
      </div>


      <!--<script type="text/javascript">$('.dropdown-toggle').dropdown();</script>-->

      <!--</div>-->
    </body>

    </html>