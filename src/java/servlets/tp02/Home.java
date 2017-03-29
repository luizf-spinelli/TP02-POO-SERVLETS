/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets.tp02;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author O77O
 */
@WebServlet(name = "Home", urlPatterns = {"/home"})
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
            out.println("<title>Servlet HOME</title>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u'crossorigin='anonymous'>");
            out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'    integrity='sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa' crossorigin='anonymous'> </script>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css' integrity='sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp' crossorigin='anonymous'>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/styles/style.css' />");
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class='navbar navbar-inverse' style='border-radius: 0;'>");
            out.println("<div class='container-fluid'>");
            out.println("<div class='navbar-header'>");
            out.println("<a class='navbar-brand' href='home'>POO TP02</a></div>");
            out.println("<div>");
            out.println("<ul class='nav navbar-nav navbar-right'>");
            out.println("<li class='active'><a href='home'>HOME</a></li>");
            out.println("<li><a href='juros-simples'>%SIMPLES</a></li>");
            out.println("<li><a href='juros-compostos'>%COMPOSTOS</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            out.println("<div class='container-fluid text-center'>");
            out.println("<h1>GRUPO 1</h1>");
            out.println("<div class='row text-center' style='padding: 30px;'>");
            out.println("<div class='col-lg-4'>");
            out.println("<img src='luiz.jpg' width='100px' height='100px' class='img-circle'>");
            out.println("<h4>Luiz F. Spinelli</h4>");
            out.println("<p>Trabalhou na implementação da página de Juros Compostos</p>");
            out.println("</div>");
            out.println("<div class='col-lg-4'>");
            out.println("<img src='otavio.jpg'  width='100px' height='100px'class='img-circle'>");
            out.println("<h4>Otavio S. Guimarães</h4>");
            out.println("<p>Trabalhou na home e estilização das paginas</p>");
            out.println("</div>");
            out.println("<div class='col-lg-4'>");
            out.println("<img src='rafael.jpg' width='100px' height='100px'  class='img-circle'>");
            out.println("<h4>Rafael C. Araújo</h4>");
            out.println("<p>Trabalhou na implementação da página de Juros Simples</p>");
            out.println("</div> </div> </div>");
            out.println("<br>");
            out.println("<div class='container-fluid text-center'>");
                     out.println("<br>");
                     out.println("<div class='container text-center thumbnail'>");
                     out.println("<h3>SISTEMAS PARA CALCULO DE JUROS</h3>");
                     out.println("<div class='container text-center' style='padding: 20px;'>");       
                     out.println("<div class='col-lg-6'>");
                     out.println("<h4 class='text-center'>JUROS SIMPLES</h4>");
                     out.println("<ul class='text-justify'>");
                     out.println("<li>São pagos periodicamente (mensal ou anualmente) ao credor.</li>");
                     out.println("<li>São nominalmente iguais ao longo do tempo, mas reduzem em termos reais (efeito da inflação).</li>");
                     out.println("<li>Nominalmente somados ao capital formariam uma reta (ex.: 1000, 1100, 1200, etc).</li>");
                     out.println("<li>São como os frutos de uma árvore: são colhidos e consumidos.</li>");
                     out.println("<li>Tecnicamente, ocorre a fruição imediata dos juros pelo credor.</li>");
                     out.println("<li>Se não pagos e não incorporados ao montante, gera perda inflacionária e da porcentagem de rendimento.</li>");
                     out.println("</ul>");
                     out.println("<a class='btn btn-default' href='juros-simples'>%SIMPLES</a>");
                     out.println("</div>");
                     out.println("<div class='col-lg-6'>");
                     out.println("<h4 class='text-center'>JUROS COMPOSTOS</h4>");
                     out.println("<ul class='text-justify'>");
                     out.println("<li >São pagos ao credor somente no vencimento (no final).</li>");
                     out.println("<li>São crescentes no tempo em termos reais e nominais, se a taxa for maior que a inflação.</li>");
                     out.println("<li>Incorporados ao capital formam uma curva ascendente. (ex.: 1000, 1100, 1210, etc).</li>");
                     out.println("<li>São como bezerros que, ao crescerem, gerarão novas bezerros.</li>");
                     out.println("<li>Tecnicamente, ocorre a fruição diferida dos juros pelo credor.</li>");
                     out.println("<li>Se pagos, não incorporam ao montante, que não cresce durante o período em que forem pagos.</li></ul>");
                     out.println("<a class='btn btn-default text' href='juros-compostos'>%COMPOSTOS</a>");
                     out.println("</div>");
                     out.println("</div>");
                     out.println("</div>");
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
