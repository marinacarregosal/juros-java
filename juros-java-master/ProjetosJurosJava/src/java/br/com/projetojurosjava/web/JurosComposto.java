/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetojurosjava.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marinacarregosalopes
 */
@WebServlet(name = "JurosComposto", urlPatterns = {"/juros-composto.html"})
public class JurosComposto extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Juros Composto</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css?family=Nunito&display=swap');");
            out.println("html {"
                    + "height: 100%;"
                    + "font-family: 'Nunito', sans-serif; "
                    + "-webkit-font-smoothing: antialiased; "
                    + "}"
                    + ""
                    + "body {"
                        + "margin: 0;"
                        + "padding: 0 300px;"
                        + "height: 100%;"
                        + "background: #c850c0; "
                        + "background: -webkit-linear-gradient(45deg,#4158d0,#c850c0); "
                        + "color: #fff; "
                    + "}"
                    + "a {"
                    + "color: white;"
                    + "}"
                    + "input {"
                    + "-webkit-box-shadow: none;\n"
                    + "-moz-box-shadow: none;\n"
                    + "box-shadow: none;"
                    + "border-radius: 4px;"
                    + "padding: 5px 10px;"
                    + "border: 1px solid #36304a;"
                    + "}"
                    + ""
                    + ".field {"
                    + "padding: 5px 0;"
                    + "}"
                    + ""
                    + ".field label {"
                    + "color: #36304a;"
                    + "display: block;"
                    + "padding-bottom: 3px;"
                    + "}"
                    + ""
                    + ".main {"
                    + "border-radius: 4px;"
                    + "background-color: #fff;"
                    + "padding: 20px;"
                    + "box-shadow: 12px 12px 15px rgba(46, 61, 73, 0.4)"
                    + "}"
                    + ""
                    + ".content {"
                    + "display: flex;"
                    + "justify-content: space-between;"
                    + "}"
                    + ""
                    + "button {"
                    + "background-color: #36304a;"
                    + "color: white;"
                    + "padding: 8px 18px;"
                    + "border-radius: 4px;"
                    + "width: 100%;"
                    + "font-size: 16px;"
                    + "margin-top: 15px;"
                    + "cursor: pointer;"
                    + "}"
                    + ""
                    + "button:hover {"
                    + "background-color: #473f63"
                    + "}"
                   
                    + "</style>");

            out.println("<form action='tabela.html'>");
            out.println("<a href='home.html'><-- Voltar para a home</a>"
                    + "<h1>Cálculo de Juros Composto</h1>");
            out.println(""
                    + "<div class='main'>"
                    + "<div class='content'>"
                    + "<div class='field'>"
                    + "<label>Valor</label>");
            out.println("<input required type=number' name='valor'/>"
                    + "</div>");
            out.println(""
                    + "<div class='field'>"
                    + "<label>Juros (%)</label>");
            out.println("<input required type=number' name='juros'/>"
                    + "</div>");
            out.println("<div class='field'>"
                    + "<label>Tempo em meses</label>");
            out.println("<input required type=number' name='temp'/>"
                    + "</div>"
                    + "</div>"
                    + "<button type='submit' value='Calcular'>Calcular</button>"
                    + "</div>");
            out.println("");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
