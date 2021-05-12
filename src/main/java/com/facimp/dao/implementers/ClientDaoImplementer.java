package com.facimp.dao.implementers;

import com.facimp.dao.ClientDao;
import com.facimp.entitys.Clients;
import java.util.List;
import javax.persistence.EntityManager;

public class ClientDaoImplementer implements ClientDao {
    
    EntityManager manager;
    
    public ClientDaoImplementer(EntityManager manager) {
        this.manager= manager;
    }

    @Override
    public void insert(Clients client) {
        manager.persist(client);
    }

    @Override
    public Clients select(int id) {
        return all().get(id);
    }

    @Override
    public void delete(int id) {
        manager.remove(select(id));
    }

    @Override
    public void update(Clients client) {
        manager.merge(client);
    }

    @Override
    public List<Clients> all() {
        return manager.createQuery("SELECT c FROM Clients c", Clients.class).getResultList();
    }

    @Override
    public Clients authenticate(String email, String password) {
        return manager.createQuery("SELECT c FROM Clients c WHERE c.email='"+email+"' AND c.password='"+password+"'", Clients.class).getSingleResult();
    }
}
