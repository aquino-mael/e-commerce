
package com.facimp.servlets;

import com.facimp.entitys.Categories;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



@WebServlet(name = "RegisterCategories", urlPatterns = {"/RegisterCategories"})
public class RegisterCategories extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        Categories categories =  new Categories();
        
        // Definição dos parâmetros do cliente de acordo com o formulário de cadastro.
  
      
        
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        // Persistêcia dos dados do cliente na tabela
        manager.getTransaction().begin();
        manager.persist(categories);
        manager.getTransaction().commit();
        
        // Encerramento das conexões
        manager.close();
        factory.close();
        
        res.sendRedirect("/");
    }

}