package com.facimp.entitys;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

@Entity
@Table(name = "rel_products_list")
@NamedQueries({
    @NamedQuery(name = "RelProductsList.findAll", query = "SELECT r FROM RelProductsList r"),
    @NamedQuery(name = "RelProductsList.findById", query = "SELECT r FROM RelProductsList r WHERE r.id = :id")})
public class RelProductsList implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id")
    private Integer id;
    @JoinColumn(name = "id_product", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Products idProduct;
    @JoinColumn(name = "id_cart", referencedColumnName = "id")
    @ManyToOne(optional = false)
    private Carts idCart;

    public RelProductsList() {
    }

    public RelProductsList(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Products getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(Products idProduct) {
        this.idProduct = idProduct;
    }

    public Carts getIdCart() {
        return idCart;
    }

    public void setIdCart(Carts idCart) {
        this.idCart = idCart;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof RelProductsList)) {
            return false;
        }
        RelProductsList other = (RelProductsList) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.facimp.entitys.RelProductsList[ id=" + id + " ]";
    }
    
}
