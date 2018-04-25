package Servlet;

import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import trabalho01.Cardapio;
import trabalho01.ItemDoPedido;
import trabalho01.ListaDeMesas;
import trabalho01.ListaDoCardapio;
import trabalho01.Mesas;

@WebServlet(name = "MesaDetalhesServlet", urlPatterns = {"/ver-mesa.html", "/fechar-pedido.html", "/adicionar-pedido.html"})
public class MesaDetalhesServlet extends HttpServlet {

    List<Mesas> mesas = ListaDeMesas.getInstance();
    List<Cardapio> produtosNoCardapio = ListaDoCardapio.getInstance();

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        int mesa = Integer.parseInt(request.getParameter("mesa"));
        try {
            int quantidade = Integer.parseInt(request.getParameter("quantidade"));
            String produto = request.getParameter("produto");
            double preco = 0;
            /*Flag para nao permitir usuario inspencionar e colocar produto invalido*/
            int flagCombo = 0;
            for (int i = 0; i < produtosNoCardapio.size(); i++) {
                if (produtosNoCardapio.get(i).getNome().equals(produto)) {
                    preco = produtosNoCardapio.get(i).getPreco();
                    flagCombo = 1;
                    break;
                }
            }
            if (flagCombo == 0) {
                response.sendRedirect("ver-mesa.html?codigo=" + mesa);
            } else {
                ItemDoPedido novoItem = new ItemDoPedido(produto, quantidade, preco);
                mesas.get(mesa).getPedido().getPedidos().add(novoItem);
                mesas.get(mesa).getPedido().setSomaTotal((quantidade * preco));
                response.sendRedirect("ver-mesa.html?codigo=" + mesa);
            }
        } catch (NumberFormatException e) {
            response.sendRedirect("ver-mesa.html?codigo=" + mesa);
        }

    }

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        if ("/ver-mesa.html".equals(request.getServletPath())) {
            verMesa(request, response);
        } else if ("/adicionar-pedido.html".equals(request.getServletPath())) {
            adicionarPedido(request, response);
        } else if ("/fechar-pedido.html".equals(request.getServletPath())) {
            fecharPedido(request, response);
        }

    }

    private void verMesa(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        request.setAttribute("pedidos", mesas.get(cod).getPedido());
        request.setAttribute("codigo", cod);

        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesa-com-pedido.jsp");
        despachante.forward(request, response);

    }

    private void adicionarPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        if (mesas.get(cod).getPedido().isEstado()) {
            request.setAttribute("codigo", cod);
            SimpleDateFormat sdff = new SimpleDateFormat("dd/MM/yyyy");
            String dia = (sdff.format(new Date()));
            SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
            String hora = (sdf.format(new Date()));
            if (mesas.get(cod).getPedido().getFlagDate() == 0) {
                mesas.get(cod).getPedido().setDataPedidoAbertura(dia + " " + hora);
                mesas.get(cod).getPedido().setFlagDate(1);
            }
            RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/adicionar-pedido.jsp");
            despachante.forward(request, response);
        } else {
            response.sendRedirect("ver-mesa.html?codigo=" + cod);
        }
    }

    private void fecharPedido(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        int cod = Integer.parseInt(request.getParameter("codigo"));
        mesas.get(cod).getPedido().setEstado(false);
        SimpleDateFormat sdff = new SimpleDateFormat("dd/MM/yyyy");
        String dia = (sdff.format(new Date()));
        SimpleDateFormat sdf = new SimpleDateFormat("HH:mm");
        String hora = (sdf.format(new Date()));
        mesas.get(cod).getPedido().setDataPedidoFechamento(dia + " " + hora);
        request.setAttribute("pedidos", mesas.get(cod).getPedido());
        request.setAttribute("codigo", cod);
        RequestDispatcher despachante = request.getRequestDispatcher("/WEB-INF/mesa-com-pedido.jsp");
        despachante.forward(request, response);

    }
}
