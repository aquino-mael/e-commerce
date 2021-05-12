package com.facimp.dao.implementers;

import com.facimp.dao.ProductDao;
import com.facimp.entitys.Products;
import java.util.List;
import javax.persistence.EntityManager;

public class ProductDaoImplementer implements ProductDao {
    
    private EntityManager manager;

    public ProductDaoImplementer(EntityManager manager) {
        this.manager = manager;
    }

    @Override
    public void insert(Products product) {
        manager.persist(product);
    }

    @Override
    public Products select(int id) {
        return all().get(id);
    }

    @Override
    public void delete(int id) {
        manager.remove(id);
    }

    @Override
    public void update(Products product) {
        manager.merge(product);
    }

    @Override
    public List<Products> all() {
        return manager.createQuery("SELECT p FROM Products p", Products.class).getResultList();
    }
    
}
