<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css" rel="stylesheet" id="bootstrap-css">
<script src="//maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js"></script>
<script src="//cdnjs.cloudflare.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
</head>
<body bgcolor="#E6E6FA">
<br>
<center>
<h1>Welcome to Admin Login Page</h1><br>
<a href="./index.html">Home</a>
</center>
<br>
<div class="container">
        <div class="row justify-content-center align-items-center" style="height:10vh">
            <div class="col-4">
                <div class="card">
                    <div class="card-body">
                        <form action="./admin_login" method="post">
                            <div class="form-group">
                                <input type="text" class="form-control" name="username" placeholder="Enter Username">
                            </div>
                            <div class="form-group">
                                <input type="password" class="form-control" name="password" placeholder="Enter Password">
                            </div>
                            <input type="submit"  class="btn btn-primary" value="login">
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</body>
</html>