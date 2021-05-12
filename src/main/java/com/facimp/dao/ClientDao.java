package com.facimp.dao;

import com.facimp.entitys.Clients;
import java.util.List;

public interface ClientDao {
    public void insertClient(Clients client);
    
    public Clients getClient(int id);
    
    public void deleteClient(int id);
    
    public void updateClient(Clients client);
    
    public Clients authenticate(String email, String password);
    
    public List<Clients> allClients();
}
