package Servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

// @author gerardotobar
@WebServlet(name = "PacientesServlet", urlPatterns = {"/PacientesServlet"})
public class PacientesServlet extends HttpServlet {

    
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            
            String strName = request.getParameter("Name");
            String strLastName = request.getParameter("LastName");
            String strGender = request.getParameter("Gender");
            String strSymptoms = request.getParameter("Symptoms");
            
            //Acá habrán variables que tienen que ser convertidas a numéricas por su naturaleza
            String strBirthYear = request.getParameter("BirthYear");
            String strBirthMonth = request.getParameter("BirthMonth");
            String strBirthDay = request.getParameter("BirthDay");
            
            //Conversión de Variables
            int iBirthYear = Integer.parseInt(strBirthYear);
            int iBirthMonth = Integer.parseInt(strBirthMonth);
            int iBirthDay = Integer.parseInt(strBirthDay);
            
            
            
            
                    
            
            
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet PacientesServlet</title>");            
            out.println("</head>");
            out.println("<body>");
            out.println("<h1>Servlet PacientesServlet at " + request.getContextPath() + "</h1>");
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
