<%-- 
    Document   : index
    Created on : 8 févr. 2021, 12:51:10
    Author     : Wili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
          <link rel="stylesheet" href="boostrap.css" >
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
        <%
            RequestDispatcher dispatcher = request.getRequestDispatcher("newAccount.jsp");        
            dispatcher.forward(request, response);
        %>
    </body>
</html>
