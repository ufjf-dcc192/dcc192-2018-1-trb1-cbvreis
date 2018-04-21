package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import trabalho01.Mesas;

@WebServlet(name = "MesasServlet", urlPatterns = {"/mesas.html"})
public class MesasServlet extends HttpServlet {

    List<Mesas> mesas = new ArrayList<>();
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        
        
        Mesas mesa1 = new Mesas(1);
        Mesas mesa2 = new Mesas(2);
        Mesas mesa3 = new Mesas(3);
        
        mesas.add(mesa1);
        mesas.add(mesa2);
        mesas.add(mesa3);

        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MesasServlet</title>");
            out.println("</head>");
            out.println("<body>");
            for (int i = 0 ; i < mesas.size();i++){
               out.println("<h1>" + mesas.get(i).toString() + "</h1>");
            
            }
            
            out.println("</body>");
            out.println("</html>");
        }
    }

}
