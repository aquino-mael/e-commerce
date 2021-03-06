
package com.facimp.servlets;

import com.facimp.entitys.Administrators;
import com.facimp.entitys.Products;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet(name = "RegisterAdministrador", urlPatterns = {"/RegisterAdministrador"})
public class RegisterAdministradors extends HttpServlet {

   
   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        try {
            Administrators administrador =  new Administrators();
            List<Products> products = new ArrayList();

            // Definição dos parâmetros do cliente de acordo com o formulário de cadastro.
            administrador.setName(req.getParameter("name"));
            administrador.setEmail(req.getParameter("email"));
            administrador.setPassword(req.getParameter("password"));
            administrador.setProductsList(products);

            // Persistêcia dos dados do cliente na tabela
            manager.getTransaction().begin();
            manager.persist(administrador);
            manager.getTransaction().commit();

            res.sendRedirect(req.getContextPath());
        } catch(IOException e) {
            log(e.getMessage());
            res.sendRedirect("/register.jsp");
        }
    }

}

