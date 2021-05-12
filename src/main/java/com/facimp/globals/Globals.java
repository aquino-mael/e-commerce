package com.facimp.globals;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Globals {
    public Globals() {}
    
    public RequestDispatcher getIncludeURL(String url, HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        RequestDispatcher urlSession = request.getRequestDispatcher(url);
        urlSession.include(request, response);
        return urlSession;
    }
}
