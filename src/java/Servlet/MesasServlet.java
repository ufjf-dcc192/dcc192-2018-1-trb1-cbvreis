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

@WebServlet(name = "MesasServlet", urlPatterns = {"/mesas.html", "/adicionar.html", "/fechar-mesa.html", "/excluir-mesa.html"})
public class MesasServlet extends HttpServlet {

    List<Mesas> mesas = ListaDeMesas.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        if ("/mesas.html".equals(request.getServletPath())) {
            listarMesas(request, response);
        } else if ("/adicionar.html".equals(request.getServletPath())) {

            mesas.add(new Mesas());
            listarMesas(request, response);
        } else if ("/excluir-mesa.html".equals(request.getServletPath())) {

            excluirMesa(request, response);
        } else if ("/fechar-mesa.html".equals(request.getServletPath())) {

            fecharMesa(request, response);
        }

    }

    private void listarMesas(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.setAttribute("mesas", mesas);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesas.jsp");
        despachante.forward(request, response);

    }

    private void excluirMesa(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        List<Mesas> tarefas = ListaDeMesas.getInstance();
        tarefas.remove(cod);
        response.sendRedirect("mesas.html");

    }

    private void fecharMesa(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        List<Mesas> mesas = ListaDeMesas.getInstance();
        mesas.get(cod).setFlagMesa(true);
        response.sendRedirect("mesas.html");

    }
}

    





    /*
    
    List<Mesas> mesas = new ArrayList<>();
    List<ItemDoPedido> itens = new ArrayList<>();
    Pedidos pedido1 = new Pedidos(1, true, itens);

    ItemDoPedido item1 = new ItemDoPedido("Coca-Cola", 1, 15);
    ItemDoPedido item2 = new ItemDoPedido("Fanta", 2, 10);
    ItemDoPedido item3 = new ItemDoPedido("Suco", 3, 12);

    Mesas mesa1 = new Mesas(1, pedido1);
*/
