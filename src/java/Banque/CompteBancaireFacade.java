/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banque;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author Wili
 */
@Stateless
public class CompteBancaireFacade extends AbstractFacade<CompteBancaire> {

    @PersistenceContext(unitName = "TP04_ASSI_MAUREL_GEMERIIPU")
    private EntityManager em;

    @Override
    protected EntityManager getEntityManager() {
        return em;
    }

    public CompteBancaireFacade() {
        super(CompteBancaire.class);
    }
    
}
