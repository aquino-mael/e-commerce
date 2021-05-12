package com.facimp.servlets;

import com.facimp.dao.ProductDao;
import com.facimp.dao.implementers.ProductDaoImplementer;
import com.facimp.globals.Globals;
import java.io.IOException;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "GetProducts", urlPatterns = {"/GetProducts"})
public class GetProducts extends HttpServlet {
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();
        
        try {
            ProductDao productDao = new ProductDaoImplementer(manager);
            request.setAttribute("products", productDao.all());
            
            response.sendRedirect(request.getContextPath());
        } catch (IOException e) {
            log(e.getMessage());
        }
    }
}
