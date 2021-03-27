package com.facimp.servlets;

import com.facimp.entitys.Clients;
import java.io.IOException;
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
        
        Clients client =  new Clients();
        
        client.setName(req.getParameter("name"));
        client.setEmail(req.getParameter("email"));
        client.setPhone(req.getParameter("phone"));
        client.setStreet(req.getParameter("street") + ", número " + req.getParameter("numero"));
        client.setDistrict(req.getParameter("district"));
        client.setZipCode(Integer.parseInt(req.getParameter("zipCode")));
        client.setUf(req.getParameter("uf"));
        client.setpassword(req.getParameter("password"));
        
        log(client.getName());
        log(client.getEmail());
        log(client.getPhone());
        log(client.getStreet());
        log(client.getDistrict());
        log("" + client.getZipCode());
        log(client.getUf());     
        log(client.getpassword());

        res.sendError(500);    
    }

}
