package com.facimp.servlets.dao;

import com.facimp.entitys.Clients;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.*;

public class ClientDao {
    
    private final EntityManager entityManager;
    
    public ClientDao(EntityManager dataSource) {
        this.entityManager = dataSource;
    }
    
    public ArrayList<Clients> selectAll(){
        String SQL = "SELECT * FROM clients";
        
        try {
            Query preparedStatement = entityManager.createQuery(SQL, Clients.class);
            
            List listOfClients = preparedStatement.getResultList();
            
            ArrayList result = new ArrayList<Clients>();
            result.add(listOfClients);
            
            return result;
        } catch(Exception ex){
            System.err.println("Erro geral..."+ex.getMessage());
        }
        
        return null;
    }
    
    
    public Clients selectUser(String email, String password) {
        String SQL = "SELECT * FROM clients WHERE email='" + email + "' AND password='"+ password +"'";
        
        try {
            Query preparedStatement = entityManager.createQuery(SQL, Clients.class);
            Object clients = preparedStatement.getSingleResult();
            Clients client = new Clients();
            
            return client;
            
        } catch(Exception e) {
            System.out.println(e);
        }
        
        return null;
    }
}
