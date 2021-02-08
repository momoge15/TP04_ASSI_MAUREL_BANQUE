/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banque;

import java.util.Collection;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import Banque.CompteBancaire;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import Banque.AbstractFacade;
import javax.persistence.Entity;


/**
 *
 * @author Wili
 */
@Stateless
public class CompteBancaireFacade {

    @PersistenceContext
    private EntityManager em;

    //@Override
    //protected EntityManager getEntityManager() {
    //    return em;
    //}
    public CompteBancaire creecompte(String accountNumber, Double balance, String firstName, String lastName) {
        CompteBancaire C = new CompteBancaire(accountNumber, firstName, lastName, balance);
        em.persist(C);
        return C;
    }
    
    public ResultSet  getAllComptes()
            {
                ResultSet rs = null;
        try
            
        {
            Connection con =DriverManager.getConnection("jdbc:derby://localhost:1527/utilisateur","root","root");
            Statement stmt  = con.createStatement();
            rs = stmt.executeQuery("select id, accountNumber,firstName, lastName, balance from CompteBancaire");
            
            
            //Query q = em.createQuery("select c from CompteBancaire c");
        //return q.getResultList();
        }
        catch(Exception e)
        {
            
        }
        return  rs;
            }
    

    public Collection<CompteBancaire> getAllCompte() {
        // Exécution d'une requête équivalente à un select *
        Query q = em.createQuery("select c from CompteBancaire c");
        return q.getResultList();
    }

    //public CompteBancaireFacade() {
     //   super(CompteBancaire.class);
    //}
    
}
