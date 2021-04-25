package com.facimp.servlets;

import com.facimp.entitys.Categories;
import com.facimp.entitys.Products;
import java.io.IOException;
import java.util.ArrayList;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterCategory", urlPatterns = {"/RegisterCategory"})
public class RegisterCategory extends HttpServlet {
    
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Categories category = new Categories();
        
        ArrayList<Products> productList = new ArrayList();
        
        category.setName(request.getParameter("name"));
        category.setProductsCollection(productList);
        
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        manager.getTransaction().begin();
        manager.persist(category);
        manager.getTransaction().commit();
        
        manager.close();
        factory.close();
        
    }
}
