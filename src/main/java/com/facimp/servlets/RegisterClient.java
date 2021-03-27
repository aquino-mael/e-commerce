package com.facimp.servlets;

import com.facimp.entitys.Clients;
import java.io.IOException;
import java.io.Writer;
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
        
        log(client.getName());
        
        res.sendError(404);
       
    
    }

}
