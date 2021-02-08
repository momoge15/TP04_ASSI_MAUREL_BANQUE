<%-- 
    Document   : listAccount
    Created on : 7 févr. 2021, 23:12:09
    Author     : Wili
--%>


<%@page import="com.sun.xml.rpc.processor.modeler.j2ee.xml.string"%>
<%@page import="java.util.List"%>
<%@page import="java.sql.ResultSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="boostrap.css" >
        <title>JSP Page</title>
    </head>
    <body>
       
    
        <a href="newAccount.jsp" class="btn btn-info" >Retour au Formulaire </a>
    <table class="table table-bordered table-striped col-8">
        <div class="form-control btn-dark">
            Listes des comptes
        </div>
                            <thead>
                                <tr>
                                     <th scope="col">ID</th>
                                    <th scope="col">Account Number</th>
                                    <th scope="col">FirstName Client</th>
                                    <th scope="col">LastName Client</th>
                                    <th scope="col">Balance</th>
                                </tr>
                            </thead>
                            
                            
                            <tbody>
                                 <%
  String lists = (String) request.getAttribute("listaccount");
 out.println(lists);
  %>
                                    <tr>
                                       
                                                                              
                                        
                                    </tr>
                                </c:while>
                                <tr><td><b>TOTAL</b></td><td colspan="3"><b>${param.compter}</b></td></tr>
                            </tbody>
                        </table>
    </body>
</html>
