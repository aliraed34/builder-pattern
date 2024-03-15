<%@ page import="your.package.name.Product"%>
<%@ page import="your.package.name.ProductBuilder"%>
<%@ page contentType="text/html; charset=UTF-8" language="java" %>
<%
    // Create a product using the builder pattern
    Product product = new ProductBuilder()
                        .withName("Product Name")
                        .withCategory("Product Category")
                        .withPrice(19.99)
                        .build();
%>

<!DOCTYPE html>
<html>
<head>
    <title>Product Details</title>
</head>
<body>
    <h1>Product Details</h1>
    <p>Name: <%= product.getName() %></p>
    <p>Category: <%= product.getCategory() %></p>
    <p>Price: <%= product.getPrice() %></p>
</body>
</html>
