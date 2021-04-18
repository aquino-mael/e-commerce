
package com.facimp.servlets;

import com.facimp.entitys.Clients;
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


@WebServlet(name = "Carts", urlPatterns = {"/Carts"})
public class Carts extends HttpServlet {

   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        Clients client =  new Clients();
        
        // Definição dos parâmetros do cliente de acordo com o formulário de cadastro.
    
        
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        // Persistêcia dos dados do cliente na tabela
        manager.getTransaction().begin();
        manager.persist(client);
        manager.getTransaction().commit();
        
        // Encerramento das conexões
        manager.close();
        factory.close();
        
        res.sendRedirect("/");
    }

}
