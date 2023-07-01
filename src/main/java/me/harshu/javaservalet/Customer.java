package me.harshu.javaservalet;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

public class Customer extends HttpServlet{

    @Override
    public void init() throws ServletException {
        String name = getServletConfig().getInitParameter("name");
        String city = getServletConfig().getInitParameter("city");
        System.out.println(name + ": " + city);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        super.doGet(req, resp);
        System.out.println("Customer Created");
    }
}
