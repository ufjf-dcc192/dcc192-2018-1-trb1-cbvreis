package Servlet;

import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import trabalho01.Cardapio;
import trabalho01.ListaDoCardapio;

@WebServlet(name = "CardapioServlet", urlPatterns = {"/cardapio.html"})
public class CardapioServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        if ("/cardapio.html".equals(request.getServletPath())) {
            listarCardapio(request, response);
        }
    }

    private void listarCardapio(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        List<Cardapio> cardapio =  ListaDoCardapio.getInstance();
        request.setAttribute("cardapio", cardapio);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/cardapio.jsp");
        despachante.forward(request, response);
        
        
    }
}
