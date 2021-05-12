package com.facimp.servlets;

import com.facimp.dao.ClientDao;
import com.facimp.dao.implementers.ClientDaoImplementer;
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

@WebServlet(name = "RegisterClient", urlPatterns = {"/RegisterClient"})
public class RegisterClient extends HttpServlet {


   
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {
        
        try {
            Clients client =  new Clients();

            // Definição dos parâmetros do cliente de acordo com o formulário de cadastro.
            client.setName(req.getParameter("name"));
            client.setEmail(req.getParameter("email").trim());
            client.setPhone(req.getParameter("phone"));
            client.setStreet(req.getParameter("street") + ", número " + req.getParameter("number"));
            client.setDistrict(req.getParameter("district"));
            client.setZipCode(Integer.parseInt(req.getParameter("zipCode")));
            client.setUf(req.getParameter("uf"));
            client.setPassword(req.getParameter("password").trim());
            client.setFinishDate(Calendar.getInstance().getTime());

            // Inicialização da Percistence Unit
            EntityManagerFactory factory = Persistence.createEntityManagerFactory("ecommerce");
            EntityManager manager = factory.createEntityManager();
            
            ClientDao clientDao = new ClientDaoImplementer(manager);

            // Persistêcia dos dados do cliente na tabela
            manager.getTransaction().begin();
            clientDao.insert(client);
            manager.getTransaction().commit();

            // Encerramento das conexões
            manager.close();
            factory.close();

            res.sendRedirect("/e-commerce");
        } catch(IOException e) {
            log(e.getMessage());
            res.sendRedirect("/register.jsp");
        }
    }

}
