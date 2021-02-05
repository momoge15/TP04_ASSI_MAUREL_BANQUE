/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Banque;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 *
 * @author Wili
 */
@Entity
public class CompteBancaire implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
    private String firstName;
    private String lastName;
    private String accountNumber;
    private Double balance;
    
    
       public CompteBancaire() {
    }

    public CompteBancaire(final String accountNumber, final String firstname, final String lastname, final double balance) {
        this.accountNumber = accountNumber;
        this.lastName = lastName;
        this.firstName = firstName;
        this.balance = balance;
    }

    public String getFirstname() {
        return firstName;
    }

    public void setFirstname(String firstname) {
        this.firstName = firstname;
    }
    
    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(Double accountNumble) {
        this.firstName = accountNumber;
    }
    

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) id;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CompteBancaire)) {
            return false;
        }
        CompteBancaire other = (CompteBancaire) object;
        if (this.id != other.id) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Banque.CompteBancaire[ id=" + id + " ]";
    }
    
}
