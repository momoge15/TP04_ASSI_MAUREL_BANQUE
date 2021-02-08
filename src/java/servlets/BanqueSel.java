/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.RequestDispatcher;
import javax.servlet.annotation.WebServlet;
import Banque.CompteBancaireFacade;
import java.util.Collection;
import javax.ejb.EJB;
import Banque.CompteBancaire;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author Wili
 */
public class BanqueSel extends HttpServlet {

    @EJB
    private CompteBancaireFacade compteBancaireFacade;
    String lists=""  ;
    
    

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet BanqueSel</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet BanqueSel at " + request.getContextPath() + "</h1>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
        response.setContentType("text/html");
         ResultSet liste = null;
        lists = "";
         int compteur = 0;
        PrintWriter out = response.getWriter();
        try
        {
            
           
             liste = compteBancaireFacade.getAllComptes();
             
              
              while (liste.next()) {
                {
                    compteur +=1;
                   lists += "<tr>" ;
                   lists +="<td>"+ (liste.getInt(1)+"</td>") ;
                    lists +="<td>"+ liste.getString(2)+"</td>";
                    lists +="<td>"+ liste.getString(3)+"</td>";
                     
                     lists +="<td>"+ liste.getString(4)+"</td>";
                     lists +="<td>"+ liste.getString(5)+"</td>";
                    lists += "</tr>" ;
                     out.print(lists);            
                }
                
            
            //Object nextElement = rss.nextElement();  
        }   
       
        } catch (Exception ex) {
            //Logger.getLogger(BanqueSel.class.getName()).log(Level.SEVERE, null, ex);
        }
        request.setAttribute("listaccount", lists);
            RequestDispatcher dispatcher = request.getRequestDispatcher("listAccount.jsp?compter="+compteur+"");        
            dispatcher.forward(request, response);
           
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        //processRequest(request, response);
         String accountNumber = request.getParameter("id_acc");
        String firstName = request.getParameter("fn");
        String lastName = request.getParameter("ln");
        String balanc = request.getParameter("balance");
        Double balance=Double.parseDouble(balanc);
        
       try
       {
            compteBancaireFacade.creecompte(accountNumber,balance,firstName, lastName );
             RequestDispatcher dispatcher = request.getRequestDispatcher("newAccount.jsp");        
        dispatcher.forward(request, response);
       }
       catch(Exception e)
        {
                   
        }
      
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
