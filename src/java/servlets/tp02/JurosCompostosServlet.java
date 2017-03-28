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
import java.text.DecimalFormat;

/**
 *
 * @author Luiz Spinelli
 */
@WebServlet(name = "JurosCompostosServlet", urlPatterns = {"/juros-compostos"})
public class JurosCompostosServlet extends HttpServlet {
   DecimalFormat df = new DecimalFormat("#0.00");

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
            out.println("<title>Juros Compostos</title>");  
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css'integrity='sha384-BVYiiSIFeK1dGmJRAkycuHAHRg32OmUcww7on3RYdg4Va+PmSTsz/K68vbdEjh4u'crossorigin='anonymous'>");
            out.println("<script src='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js'    integrity='sha384-Tc5IQib027qvyjSMfHjOMaLkfuWVxZxUPnCJA7l2mCWNIpG9mGCD8wGNIcPD7Txa' crossorigin='anonymous'> </script>");
            out.println("<link rel='stylesheet' href='https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap-theme.min.css' integrity='sha384-rHyoN1iRsVXV4nD0JutlnGaslCJuC7uwjduW9SVrLvRYooPp2bWYgmgJQIXwl/Sp' crossorigin='anonymous'>");
            out.println("<link rel='stylesheet' type='text/css' href='" + request.getContextPath() + "/styles/style.css' />");            
            out.println("</head>");
            out.println("<body>");
            out.println("<nav class='navbar navbar-inverse' style='border-radius: 0;'>");
            out.println("<div class='container-fluid'>");
            out.println("<div class='navbar-header'>");
            out.println("<a class='navbar-brand' href='home' >POO TP02</a></div>");
            out.println("<div>");
            out.println("<ul class='nav navbar-nav navbar-right'>");
            out.println(" <li><a href='home'>HOME</a></li>");
            out.println("<li><a href='juros-simples'>%SIMPLES</a></li>");
            out.println("<li class='active'><a href='juros-compostos'>%COMPOSTOS</a></li>");
            out.println("</ul>");
            out.println("</div>");
            out.println("</nav>");
            
            out.println("<div class='container' style='padding-bottom: 20px;'>");
            out.println("<h4><a class='btn btn-default' href='home'>Voltar</a></h4>");
            double c = 1.00;
            try{c = Double.parseDouble(request.getParameter("c"));
            }catch(Exception ex){}
            int t = 1;
            try{t = Integer.parseInt(request.getParameter("t"));
            }catch(Exception ex){}
            double j = 1.00;
            try{j = Double.parseDouble(request.getParameter("j"));
            }catch(Exception ex){}
            out.println("<form>");
            out.println("Capital inicial(R$):<br/>");
            out.println("<input type='text' name='c' value='"+c+"'/><br/><br/>");
            out.println("Taxa de juros(% a.m.):<br/>");
            out.println("<input type='text' name='j' value='"+j+"'/><br/><br/>");
            out.println("Tempo de investimento(meses):<br/>");
            out.println("<input type='text' name='t' value='"+t+"'/><br/><br/>");
            out.println("<input type='submit' value='Calcular'/>");            
            out.println("</form></br>");
            out.println("<h2>Juros Compostos</h2>");
            out.println("<table border='1'>");
            out.println("<tr>");
            out.println("<th>Mês</th>");
            out.println("<th>Valor</th>");            
            out.println("</tr>");
            int i=0;                  
            do
            {   double res = c *(j/100);
                c = c + res;
                i++;
                out.println("<tr>");
                out.println("<td>"+i+"</td>");
                out.println("<td> R$ "+df.format(c)+"</td>");
                out.println("</tr>");        
            }while (i < t);
            out.println("</table>");
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
