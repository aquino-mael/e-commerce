package com.facimp.servlets;

import com.facimp.entitys.Client;

import java.io.IOException;
import java.util.Calendar;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "CreateClient", urlPatterns = {"/CreateClient"})
public class CreateClient extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
    
        Client client = new Client();
        
        client.setName("Ismael");
        client.setEmail("ismaellAquino@hotmail.com");
        client.setPhone("+5599991155921");
        client.setStreet("Rua tamôios, 39");
        client.setUf("MA");
        client.setZipCode(65911324);
        client.setDistrict("Parque das estrelas");
        client.setFinishDate(Calendar.getInstance());
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerceDB");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(client);
        manager.getTransaction().commit();
        
        log("ID da tarefa: "+ client.getId());
        log("Criado em: "+ client.getFinishDate());
        
        manager.close();
        factory.close();
        
        res.sendError(404);
    }
}
