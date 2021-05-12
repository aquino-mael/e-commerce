/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facimp.dao.implementers;

import com.facimp.dao.AdministratorDao;
import com.facimp.entitys.Administrators;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author interisk
 */
public class AdministratorDaoImplementer implements AdministratorDao{

    private EntityManager manager;
    
    public AdministratorDaoImplementer(EntityManager manager) {
        this.manager = manager;
    }

   @Override
    public void insertAdministrator(Administrators administrator) {
        manager.persist(administrator);
    }

    @Override
    public Administrators getAdministrator(int id) {
        return allAdministrator().get(id);
    }

    @Override
    public void deleteAdministrator(int id) {
        manager.remove(getAdministrator(id));
    }

    @Override
    public void updateAdministrator(Administrators administrator) {
        manager.merge(administrator);
    }

    @Override
    public List<Administrators> allAdministrator() {
        return manager.createQuery("SELECT a FROM Administrators a", Administrators.class).getResultList();
    }

    @Override
    public Administrators authenticate(String email, String password) {
        return manager.createQuery("SELECT a FROM Administrators a WHERE a.email='"+email+"' AND a.password='"+password+"'", Administrators.class).getSingleResult();
    }
}
