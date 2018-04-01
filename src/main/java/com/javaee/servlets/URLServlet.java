package com.javaee.servlets;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

@WebServlet(name = "URLServlet", urlPatterns = "/test")
public class URLServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        String one = request.getParameter("one");
//        System.out.println(one);
//        String[] ones = request.getParameterValues("one");
//        for (String s : ones) {
//            System.out.print(s + " ");
//        }
//
//        Enumeration<String> parametersNames = request.getParameterNames();
//        while (parametersNames.hasMoreElements()) {
//            String elementName = parametersNames.nextElement();
//            System.out.println(elementName + " = " + request.getParameter(elementName));
//        }


    }
}
