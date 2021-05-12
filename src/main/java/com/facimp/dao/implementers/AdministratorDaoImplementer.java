package com.facimp.dao.implementers;

import com.facimp.dao.AdministratorDao;
import com.facimp.entitys.Administrators;
import java.util.List;
import javax.persistence.EntityManager;

public class AdministratorDaoImplementer implements AdministratorDao {

    private EntityManager manager;
    
    public AdministratorDaoImplementer(EntityManager manager) {
        this.manager = manager;
    }

   @Override
    public void insert(Administrators administrator) {
        manager.persist(administrator);
    }

    @Override
    public Administrators select(int id) {
        return all().get(id);
    }

    @Override
    public void delete(int id) {
        manager.remove(select(id));
    }

    @Override
    public void update(Administrators administrator) {
        manager.merge(administrator);
    }

    @Override
    public List<Administrators> all() {
        return manager.createQuery("SELECT a FROM Administrators a", Administrators.class).getResultList();
    }

    @Override
    public Administrators authenticate(String email, String password) {
        return manager.createQuery("SELECT a FROM Administrators a WHERE a.email='"+email+"' AND a.password='"+password+"'", Administrators.class).getSingleResult();
    }
}
