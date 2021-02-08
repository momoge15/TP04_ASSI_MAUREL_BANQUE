<%-- 
    Document   : newAccount
    Created on : 7 févr. 2021, 23:10:13
    Author     : Wili
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="boostrap.css">
        <title>JSP Page</title>
        <style>
            label{
                color: white;
            }
        </style>
    </head>
    <body style="background-image: url('1104816.jpg')" >
        
         <a href="BanqueSel" class="btn btn-info" >Afficher la Liste </a>
      
        <div class="col-xl-4 col-lg-4 col-sm-11 container-fluid modal-open" style="margin-top: 50px;">
            <h1 class=" form-control btn btn-light">Ajouter un nouveau compte</h1>
            <form style="flex-wrap: wrap; padding: 20px" class="form-group bg-dark" method="post" action="BanqueSel"  >
           
                <label>accountNumber Client</label> <input type="text" class="form-control" name="id_acc" required   />
            <label>FirtName Client</label> <input type="text" class="form-control"  required    name="fn" />
             <label>LastName Client</label> <input type="text" class="form-control" required name="ln" />
              <label>Balance</label> <input type="text" class="form-control" required name="balance" />
              <input class="form-control btn btn-success" type="hidden" name="action" value="ajouterCompte"/>
              <input type="submit" name="submit" class="form-control btn btn-success" value="Enregistrer" />
            
            
        </form>
        </div>
        
 
        
        
        
    </body>
</html>
