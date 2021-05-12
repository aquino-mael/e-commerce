/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.facimp.servlets;

import com.facimp.dao.AdministratorDao;
import com.facimp.dao.implementers.AdministratorDaoImplementer;
import com.facimp.entitys.Administrators;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author interisk
 */
@WebServlet(name = "LoginAdmin", urlPatterns = {"/LoginAdmin"})
public class LoginAdmin extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        AdministratorDao administratorDao = new AdministratorDaoImplementer(manager);
        Administrators administrator;
        
        try {
            administrator = administratorDao.authenticate(
                request.getParameter("email").trim(),
                request.getParameter("password").trim()
            );
            
            factory.close();
            manager.close();
            
            response.sendRedirect("/e-commerce");
        } catch(IOException err) {
            log("Authentication error: " + err.getMessage());
        } catch(Exception err) {
            log("Unexpected error: " + err.getMessage());
            response.sendError(400, "Nenhum usuário encontrado!");
            log("Status: " + response.getStatus());
        }
    }
}
