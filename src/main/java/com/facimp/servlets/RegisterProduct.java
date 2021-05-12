package com.facimp.servlets;

import com.facimp.dao.ProductDao;
import com.facimp.dao.implementers.ProductDaoImplementer;
import com.facimp.entitys.Products;
import java.io.IOException;
import java.math.BigDecimal;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(name = "RegisterProduct", urlPatterns = {"/RegisterProduct"})
public class RegisterProduct extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        Products product = new Products();
        
        product.setColor(request.getParameter("color"));
        product.setLength(Integer.parseInt(request.getParameter("length")));
        product.setName(request.getParameter("name"));
        product.setPrice(BigDecimal.valueOf(Double.parseDouble(request.getParameter("price"))));
        product.setStatus(request.getParameter("status"));
        product.setType(request.getParameter("type"));
        
        // Inicialização da Percistence Unit
        EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
        EntityManager manager = factory.createEntityManager();

        ProductDao productDao = new ProductDaoImplementer(manager);

        // Persistêcia dos dados do cliente na tabela
        manager.getTransaction().begin();
        productDao.insert(product);
        manager.getTransaction().commit();

        // Encerramento das conexões
        manager.close();
        factory.close();

        response.sendRedirect("/e-commerce");
        
    }

}
