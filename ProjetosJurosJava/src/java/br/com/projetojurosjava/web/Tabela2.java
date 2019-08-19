/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.projetojurosjava.web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import java.text.DecimalFormat;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author EuToTilTaDoCaRa
 */
@WebServlet(name = "TabelaJurosSimples", urlPatterns = {"/tabela-juros-simples.html"})
public class Tabela2 extends HttpServlet {

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
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tabela Juros Simples</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css?family=Nunito&display=swap');");
            out.println("html {"
                    + "font-family: 'Nunito', sans-serif; "
                    + "-webkit-font-smoothing: antialiased; "
                    + "}"
                    + ""
                    + "body {"
                    + "padding: 0 300px;"
                    + "height: 100%;"
                    + "background: #c850c0; "
                    + "background: -webkit-linear-gradient(45deg,#4158d0,#c850c0); "
                    + "color: #fff; "
                    + "}"
                    + ""
                    + "a {"
                    + " color: white;"
                    + "}"
                    + "table {"
                    + " border-collapse: collapse;\n"
                    + "   background: #fff;\n"
                    + "   border-radius: 4px;\n"
                    + "   box-shadow: 12px 12px 15px rgba(46, 61, 73, 0.4);"
                    + "   overflow: hidden;\n"
                    + "   width: 100%;\n"
                    + "   margin: 0 auto;\n"
                    + "   position: relative;"
                    + "   margin-bottom: 100px;"
                    + "}"
                    + ""
                    + "tr:nth-child(odd) {"
                    + "background-color: #f5f5f5"
                    + "}"
                    + "tr:first-child {"
                    + "height: 60px;"
                    + "background: #36304a;"
                    + "}"
                    + ""
                    + "tr:not(:first-child) {"
                    + "  color: gray;"
                    + "}"
                    + ""
                    + "td {"
                    + " text-align: center;"
                    + " padding: 20px;"
                    + "}"
                    + ""
                    + ".error {"
                    + " border: 1px solid #d11f1f;"
                    + " border-radius: 3px;"
                    + " background-color: red;"
                    + " text-align: center;"
                    + " padding: 10px 5px;"
                    + "}"
                    + ""
                    + ".error h3 {"
                    + " margin: 0;"
                    + " display: inline;"
                    + " padding-right: 5px;"
                    + "}"
                    + ""
                    + ".error a {"
                    + " color: white;"
                    + " font-size: 1.17em;\n"
                    + " text-decoration: underline;\n"
                    + " margin-block-start: 1em;\n"
                    + " margin-block-end: 1em;\n"
                    + " margin-inline-start: 0px;\n"
                    + " margin-inline-end: 0px;"
                    + " font-weight: bold;"
                    + "}"
                    + ""
                    + ".go-top {"
                    + "    position: fixed;"
                    + "    background-color: #5449aa;"
                    + "    right: 0;"
                    + "    bottom: 0;"
                    + "    border-radius: 50%;"
                    + "    padding: 20px 15px;"
                    + "    font-weight: 700;"
                    + "    margin: 20px;"
                    + "    cursor: pointer;"
                    + "    box-shadow: 5px 5px 10px rgba(46, 61, 73, 0.4);"
                    + "}");
            out.println("</style>");

            //Caso eu não consiga alterar a tabela.
            out.println("<a href='/ProjetosJurosJava'>< Voltar para a home</a>"
                    + "<h1 id=''>Tabela de Juros Simples</h1>");
            out.println("<div onclick=\"window.scrollTo(0, 0);\" class='go-top'><span>TOPO</span></div>");
            if (request.getParameter("juros")!= null){
                try {
                float v = Float.parseFloat(request.getParameter("valor"));
                float j = Float.parseFloat(request.getParameter("juros"));
                float t = Integer.parseInt(request.getParameter("temp"));
                float total = 0;
                j = j / 100;
                out.println("<table>");
                out.println("<tr>");
                out.println("<th>Total</thead>");
                out.println("<th>Mês</thead>");
                out.println("</tr>");
                for (int i = 1; i <= t; ++i) {
                    total = v+(v * j * i);

                    out.println("<tr>");

                    out.println("<td>R$ " + total + "</td>");
                    out.println("<td>" + i + "</td>");
                }
                out.println("<tbody>");
                out.println("</table>");
            } catch (Exception e) {
                out.println("<div class='error'><h3> Parâmetros " + " inválidos!</h3> <a href='juros-simples.html'> Clique aqui para voltar.</a>");
            }

            out.println("</html>");
        }
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
