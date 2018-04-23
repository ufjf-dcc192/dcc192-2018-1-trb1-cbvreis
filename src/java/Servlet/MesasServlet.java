package Servlet;

import static java.awt.SystemColor.window;
import java.io.IOException;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;
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
        List<Mesas> mesas = ListaDeMesas.getInstance();
        /*--- VERIFICA ESTADO DO PEDIDO PARA SABER SE PODE SER FECHADA A MESA---*/
        if(!mesas.get(cod).getPedido().isEstado()){
            mesas.remove(cod);
        }else{
            //request.setAttribute("alerta", alerta);
            /*IGOR - ver alerta */
        }
        response.sendRedirect("mesas.html");

    }

    private void fecharMesa(HttpServletRequest request, HttpServletResponse response) throws IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        List<Mesas> mesas = ListaDeMesas.getInstance();
        mesas.get(cod).setFlagMesa(true);
        response.sendRedirect("mesas.html");

    }
}

    





