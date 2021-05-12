package com.facimp.servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.facimp.dao.ClientDao;
import com.facimp.dao.implementers.ClientDaoImplementer;
import com.facimp.entitys.Clients;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

@WebServlet(name = "Login", urlPatterns = {"/Login"})
public class Login extends HttpServlet {
    
    private EntityManager manager;
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        this.manager = factory.createEntityManager();
        
        ClientDao clientDao = new ClientDaoImplementer(this.manager);
        Clients client;
        
        try {
            client = clientDao.authenticate(
                request.getParameter("email").trim(),
                request.getParameter("password").trim()
            );
            
            factory.close();
            this.manager.close();
            
            response.sendRedirect("/e-commerce");
        } catch(IOException err) {
            log("Authentication error: " + err.getMessage());
            response.setStatus(401);
        } catch(Exception err) {
            log("Unexpected error: " + err.getMessage());
            response.sendRedirect("login.jsp");
        }
    }
}
