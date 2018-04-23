package Servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import trabalho01.ListaDeMesas;
import trabalho01.Mesas;

@WebServlet(name = "RelatorioServlet", urlPatterns = {"/relatorio.html"})
public class RelatorioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
       
        if ("/relatorio.html".equals(request.getServletPath())) {
            exibirRelatorio(request, response);
        }
        
    }

    private void exibirRelatorio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        List<Mesas> mesas =  ListaDeMesas.getInstance();
        
        request.setAttribute("mesas", mesas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/relatorio.jsp");
        despachante.forward(request, response);

    }
    
}
