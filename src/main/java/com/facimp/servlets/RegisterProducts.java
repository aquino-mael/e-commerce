
package com.facimp.servlets;

import com.facimp.entitys.Clients;
import com.facimp.entitys.Products;
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


@WebServlet(name = "RegisterProducts", urlPatterns = {"/RegisterProducts"})
public class RegisterProducts extends HttpServlet {

  

  
      @Override
    protected void doPost(HttpServletRequest requisicao, HttpServletResponse resposta)
            throws ServletException, IOException {
        
        Products product =  new Products();
        
        // Definição dos parâmetros do cliente de acordo com o formulário de cadastro.
        product.setName(name);
        product.setPrice();
        product.setStatus(status);
        
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        // Persistêcia dos dados do cliente na tabela
        manager.getTransaction().begin();
        manager.persist(product);
        manager.getTransaction().commit();
        
        // Encerramento das conexões
        manager.close();
        factory.close();
        
        res.sendRedirect("/");
    }
}
  
   
