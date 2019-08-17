package br.com.projetojurosjava.web;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.DecimalFormat;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author marinacarregosalopes
 */
@WebServlet(name = "Tabela", urlPatterns = {"/tabela.html"})
public class Tabela extends HttpServlet {

    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Tabela Juros Composto</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css?family=Nunito&display=swap');");
            out.println("html {"
                    + "padding: 0 300px;"
                    + "height: 100%;"
                    + "background: #c850c0; "
                    + "background: -webkit-linear-gradient(45deg,#4158d0,#c850c0); "
                    + "color: #fff; "
                    + "font-family: 'Nunito', sans-serif; "
                    + "-webkit-font-smoothing: antialiased; "
                    + "}"
                    + ""
                    + "table {"
                    + " border-collapse: collapse;\n" +
                    "   background: #fff;\n" +
                    "   border-radius: 4px;\n" +
                    "   overflow: hidden;\n" +
                    "   width: 100%;\n" +
                    "   margin: 0 auto;\n" +
                    "   position: relative;"
                    + "}"
                    + ""
                    + "tr:first-child {"
                     + "height: 60px;" +
                        "background: #36304a;"
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
                    + " font-size: 1.17em;\n" +
                      " text-decoration: underline;\n" +
                      " margin-block-start: 1em;\n" +
                      " margin-block-end: 1em;\n" +
                      " margin-inline-start: 0px;\n" +
                      " margin-inline-end: 0px;"
                    + " font-weight: bold;"      
                    + "}");
            out.println("</style>");

            // TODO: Alterar nome da tabela dinamicamente. A página deve aceitar os dois tipos de juros.
            out.println("<h1>Tabela de Juros Composto</h1>");
            try {
                float v = Float.parseFloat(request.getParameter("valor"));
                float j = Float.parseFloat(request.getParameter("juros"));
                float t = Integer.parseInt(request.getParameter("temp"));
                float total = 0;
                j = j/100;
               out.println("<table>");
               out.println("<tr>");
               out.println("<th>Total</thead>");
               out.println("<th>Mês</thead>");
               out.println("</tr>");
               for (int i = 1; i<=t; ++i){
               total = v+=(j*v);

                out.println("<tr>");

                out.println("<td>R$ "+total+"</td>");
                out.println("<td>"+i+"</td>");  
        }
               out.println("<tbody>");
               out.println("</table>");   
            } catch (Exception e) {
                  out.println("<div class='error'><h3> Parâmetros "+" inválidos!</h3> <a href='/ProjetosJurosJava'> Clique aqui para voltar para a home.</a>");
            }

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
