package com.project;

import java.io.Serializable;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.cache.spi.support.AbstractReadWriteAccess.Item;

public class Ciutat implements Serializable {
    private long ciutatId;
    private String nom;
    private String pais;
    private int codiPostal;
    private Set<Ciutada> ciutadans = new HashSet<>();

    public Ciutat(){}

    public Ciutat(String nom, String pais, int codiPostal){
        this.nom = nom;
        this.pais = pais;
        this.codiPostal = codiPostal;
    }

    // Getters y setters
    public long getCiutatId() {
        return ciutatId;
    }
    public void setCiutatId(long ciutatId) {
        this.ciutatId = ciutatId;
    }
    public String getNom() {
        return nom;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public String getPais() {
        return pais;
    }
    public void setPais(String pais) {
        this.pais = pais;
    }
    public int getCodiPostal() {
        return codiPostal;
    }
    public void setCodiPostal(int codiPostal) {
        this.codiPostal = codiPostal;
    }

    @Override
    public String toString() {
        StringBuilder str = new StringBuilder();
        for (Ciutada ciutada : ciutadans) {
            if (str.length() > 0) {
                str.append(" | ");
            }
            str.append(ciutadans.getNom());
        }
        return this.getCiutatId() + ": " + this.getNom() + ", Items: [" + str + "]";
    }
    
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        
        Cart cart = (Cart) o;
        return cartId == cart.cartId;
    }
    
    @Override
    public int hashCode() {
        return Long.hashCode(cartId);
    }    
}