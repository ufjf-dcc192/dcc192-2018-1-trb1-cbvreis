package Servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import trabalho01.ListaDeMesas;
import trabalho01.Mesas;
import trabalho01.Pedidos;

@WebServlet(name = "MesaDetalhesServlet", urlPatterns = {"/ver-mesa.html","/adicionar-pedido.html"})
public class MesaDetalhesServlet extends HttpServlet {
 
    List<Mesas> mesas = ListaDeMesas.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/ver-mesa.html".equals(request.getServletPath())) {
            verMesa(request, response);
        } 
        else if ("/adicionar-pedido.html".equals(request.getServletPath())) {
            adicionarPedido(request, response);
        } 

    }

    private void verMesa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        
        int cod = Integer.parseInt(request.getParameter("codigo"));
        request.setAttribute("pedidos", mesas.get(cod).getPedido());
        request.setAttribute("mesa", cod);

       
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesa-com-pedido.jsp");
        despachante.forward(request, response);
   
    }

    private void adicionarPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int cod = Integer.parseInt(request.getParameter("mesa"));
        request.setAttribute("pedidos", mesas.get(cod).getPedido());
        request.setAttribute("mesa", cod);
       
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/adicionar-pedido.jsp");
        despachante.forward(request, response);
        
    }
   

}


