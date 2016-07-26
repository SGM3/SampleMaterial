package com.org;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


// Extend HttpServlet class
public class MyServlet extends HttpServlet {

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response) throws IOException {
      String message = "Hello";
      // Set response content type
      response.setContentType("text/html");

      // Actual logic goes here.
      PrintWriter out = response.getWriter();
      out.println("<h1>" + message + "</h1>");
  }

}
