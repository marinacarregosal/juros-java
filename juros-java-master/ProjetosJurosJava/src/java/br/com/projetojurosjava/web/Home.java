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
 * @author ACER
 */
@WebServlet(name = "Home", urlPatterns = {"/home.html"})
public class Home extends HttpServlet {

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
            out.println("<title>Projeto Juros</title>");
            out.println("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">");
            out.println("<link href='https://stackpath.bootstrapcdn.com/font-awesome/4.7.0/css/font-awesome.min.css' rel='stylesheet' crossorigin='anonymous' >");
            out.println("<style>");
            out.println("@import url('https://fonts.googleapis.com/css?family=Nunito&display=swap');");
            out.println("html {  font-family: 'Nunito', sans-serif; -webkit-font-smoothing: antialiased; min-height: 100%; }");
            out.println("body { margin: 0; padding: 0 300px; height: 100%;  background: #c850c0; background: -webkit-linear-gradient(45deg,#4158d0,#c850c0); color: #fff; background-repeat: no-repeat;}");
            out.println(".card { background-color: white; border-radius: 4px;  box-shadow: 12px 12px 15px rgba(46, 61, 73, 0.4); color: #36304a; }");
            
            out.println(".categories .card{ width: 43%; padding: 20px;  }");
            out.println(".categories p { color: gray;   }");
            out.println(".ini { text-align: center; font-size: 20px; cursor: pointer;  transition: all .2s ease-in-out;    }");
            out.println(".team .card { width: 30%; text-align: center; margin: 20px 0;  }");
            out.println(".team .card h4 { margin: 0; font-size: 20px;  padding: 3px 0; text-align: center;  }");
            out.println(".team, .categories { display: flex; justify-content: space-between;  flex-wrap: wrap;  }");
            out.println(".team .card img { width: 100%; }");
            out.println(".fa {font-size: 20px; padding: 0px 2px; }");
            out.println(".categories { margin-bottom: 60px; }");
            out.println(".categories h2 { margin: 0;  text-align: center; }");
            out.println("#juros-simples, #juros-composto { cursor: pointer;  transition: all .2s ease-in-out;  }");
            out.println("#juros-simples:hover, #juros-composto:hover {  transform: scale(1.1);  }");
            out.println(".hidden-div {  visibility: hidden;  width: 30%; }");
             out.println("h1 {  text-align: center; }");
            out.println("</style></head>");
            out.println("<body><div class='ini' id='inicio'> <h6>CLIQUE PARA VOLTAR AO INÍCIO</h6></div>");
            out.println("<div> <hr><h1>Cálculo de Juros Simples e Composto</h1> <hr><div class='categories'> ");
                out.println("<div class='card' id='juros-simples'>  <h2>Juros Simples</h2> <p>O regime de juros será simples quando o percentual de juros incidir apenas sobre o valor principal. Sobre os juros gerados a cada período não incidirão novos juros. </p> </div>");
                out.println("<div class='card' id='juros-composto'> <h2>Juros Composto</h2><p>Os juros compostos são a prática de juros sobre juros. Eles são na maioria das vezes usados no sistema financeiro, pois oferecem maior rentabilidade se comparados ao juro simples.</p> </div>");
               // out.println("<h1>Servlet Home at " + request.getContextPath() + "</h1>");
                out.println("</div><hr> <h1>Membros da Equipe</h1><hr>");
                out.println("<div class='team'>");
                     out.println("<div class='card'>" +
                    "<div class='wrapper'>"   +
                        "<img class='profile' alt='Bia' src='res/images/bia.jpeg'/>"  +
                    "</div>"  +
                   " <div>"   +
                   " <h4>Beatriz Diegues</h4> "   +
                    "<span class='fa fa-github'></span>"  +
                    "<span class='fa fa-envelope'></span>"    +
                    "</div>"  +
                "</div>");
                     
                      out.println("<div class='card'>"+
                    "<div class='wrapper'>"+
                        "<img class='profile' alt='EliVelton' src='res/images/elivelton.jpeg'/>"+
                    "</div>"+
                    "<div>"+
                    "<h4>Elivelton de Jesus</h4>"+
                    "<span class='fa fa-github'></span>"+
                    "<span class='fa fa-envelope'></span>"+
                    "</div>"+
                "</div>");
                      
                      out.println("<div class='card'>"+
                    "<div class='wrapper'>"+
                       " <img class='profile' alt='Marina' src='res/images/marina.jpeg'/>"+
                   " </div>"+
                   " <div>"+
                    "<h4>Marina Lopes</h4>"+
                    "<span class='fa fa-github'></span>"+
                    "<span class='fa fa-envelope'></span>"+
                    "</div>"+
                "</div>");
                      
                        out.println("<div class='card'>"+
                   " <div class='wrapper'>"+
                        "<img class='profile' alt='Daniel' src='res/images/danielb.jpg'/>"+
                    "</div>"+
                    "<div>"+
                    "<h4>Daniel Barbosa</h4>"+
                    "<span class='fa fa-github'></span>"+
                    "<span class='fa fa-envelope'></span>"+
                    "</div>"+
                "</div>");
                        
                        out.println("<div class='card'>"+
                   " <div class='wrapper'>"+
                        "<img class='profile' alt='Orlando' src='res/images/user.jpeg'/>"+
                    "</div>"+
                    "<div>"+
                    "<h4>Orlando Silva</h4>"+
                    "<span class='fa fa-github'></span>"+
                    "<span class='fa fa-envelope'></span>"+
                    "</div>"+
                "</div>");
                        
                         out.println("<div class='hidden-div'>"+
                   " <div class='wrapper'>"+
                       " <img class='profile' alt='Orlando' src='res/images/user.jpeg'/>"+
                    "</div>"+
                    "<div>"+
                   " <h4></h4>"+
                   " <span class='fa fa-github'></span>"+
                    "<span class='fa fa-envelope'></span>"+
                    "</div>"+
                "</div>"+
           " </div>"+
       " </div>");
                         
                         out.println("<script>"+
           " document.getElementById('juros-simples').addEventListener('click', function (event) {"+
               " document.location.href = '/ProjetosJurosJava/juros-simples.html';"+
           " });"+
            
            "document.getElementById('juros-composto').addEventListener('click', function (event) {"+
               " document.location.href = '/ProjetosJurosJava/juros-composto.html';"+
           " });"+
                                 
             "document.getElementById('inicio').addEventListener('click', function (event) {"+
               " document.location.href = '/ProjetosJurosJava/index.html';"+
           " });"+
       " </script>");
                         
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
