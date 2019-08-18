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
 * @author beatr
 */
@WebServlet(name = "JurosSimples", urlPatterns = {"/juros-simples.html"})
public class JurosSimples extends HttpServlet {

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
            //texto que vai aparecer na aba do navegador
            out.println("<title>Juros Simples</title>");            
            out.println("</head>");
            out.println("<body>");
            //código pra deixar bonitinho no padrão do site feito pelo grupo
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
            //link pra retornar pra home
            out.println("<a href='/ProjetosJurosJava/home.html'>< Voltar para a home</a>" + "<h1>Cálculo de Juros Simples</h1>");
            out.println("<form action='juros-simples.html'>");
            //estilo do campo valor
            out.println(""
                    + "<div class='main'>"
                    + "<div class='content'>"
                    + "<div class='field'>"
                    + "<label>Valor</label>");
            //campo pra inserir valor
            out.println("<input required type=number' name='valor'/>"
                    + "</div>");
            //estilo do campo juros
            out.println(""
                    + "<div class='field'>"
                    + "<label>Juros (%)</label>");
            //campo pra inserir o valor do juros
            out.println("<input required type=number' name='juros'/>"
                    + "</div>");
            //estilo do campo tempo
            out.println("<div class='field'>"
                    + "<label>Tempo em meses</label>");
            //campo pra inserir o valor do tempo
            out.println("<input required type=number' name='temp'/>"
                    + "</div>"
                    + "</div>"
                    + "<button type='submit' value='Calcular'>Calcular</button>"
                    + "</div>");
            out.println("");
            //se juros for diferente de vazio
            if (request.getParameter("juros")!= null){
                //tente
                 try {
                    //cria variavel montate e juros
                    double montante, juros;
                    //cria variavel valor, converte pra double
                    double valor = Double.parseDouble(request.getParameter("valor"));
                    //cria a variavel taxa e converte pra double
                    double taxa = Double.parseDouble(request.getParameter("juros"));
                    //cria a variavel tempo, converte pra inteiro
                    int tempo = Integer.parseInt(request.getParameter("temp"));                    
                    //calcular a porcentagem do juros
                    taxa = taxa / 100;
                    //variavel juros recebe o valor * porcentagem * tempo 
                    juros = valor * taxa * tempo;
                    //o montate será a soma do valor + o calculo do juros
                    montante = valor + juros;

                    out.println("<h4>Montante: " + String.valueOf(montante) + "</h4>");
                } catch (Exception e) {
                    out.println("<h4 style='color: red'>Erro ao converter</h4>");
                }
            }
            
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
