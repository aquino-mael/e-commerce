/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facimp.dao.implementers;

import com.facimp.dao.ClientDao;
import com.facimp.entitys.Clients;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author interisk
 */
public class ClientDaoImplementer implements ClientDao {
    
    EntityManager manager;
    
    public ClientDaoImplementer(EntityManager manager) {
        this.manager= manager;
    }

    @Override
    public void insertClient(Clients client) {
        manager.persist(client);
    }

    @Override
    public Clients getClient(int id) {
        return allClients().get(id);
    }

    @Override
    public void deleteClient(int id) {
        manager.remove(getClient(id));
    }

    @Override
    public void updateClient(Clients client) {
        manager.merge(client);
    }

    @Override
    public List<Clients> allClients() {
        return manager.createQuery("SELECT c FROM Clients c", Clients.class).getResultList();
    }

    @Override
    public Clients authenticate(String email, String password) {
        return manager.createQuery("SELECT c FROM Clients c WHERE c.email='"+email+"' AND c.password='"+password+"'", Clients.class).getSingleResult();
    }
}
