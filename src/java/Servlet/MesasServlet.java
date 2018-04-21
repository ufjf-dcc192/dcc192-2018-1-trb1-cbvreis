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
import trabalho01.ItemDoPedido;
import trabalho01.Mesas;
import trabalho01.Pedidos;


@WebServlet(name = "MesasServlet", urlPatterns = {"/mesas.html"})
public class MesasServlet extends HttpServlet {

        List<Mesas> mesas = new ArrayList<>();
        List<ItemDoPedido> itens = new ArrayList<>();
        Pedidos pedido1 = new Pedidos(1, true, itens);

        ItemDoPedido item1 = new ItemDoPedido("Coca-Cola", 1, 15);
        ItemDoPedido item2 = new ItemDoPedido("Fanta", 2, 10);
        ItemDoPedido item3 = new ItemDoPedido("Suco", 3, 12);

        Mesas mesa1 = new Mesas(1, pedido1);

    
    
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
        
        
        itens.add(item1);
        itens.add(item2);
        itens.add(item3);
        mesas.add(mesa1);

        
        
        response.setContentType("text/html;charset=UTF-8");
        try (PrintWriter out = response.getWriter()) {

            out.println("<!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println("<title>Servlet MesasServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form method = 'post'>");
                out.println("<input name ='produto' type ='text' />");
                out.println("<input name ='quantidade' type ='text' />");
                out.println("<input name ='quantidade' type ='submit' />");
            out.println("</form>");
            
            for (int i = 0; i < mesas.size(); i++) {
                out.println("<h1>" + mesas.get(i).toString() + "</h1>");

                for (int j = 0; j < itens.size(); j++) {

                    out.println("<h1>" + mesas.get(i).getPedido().getPedidos().get(j).toString() + "</h1>");
                }
            }
            out.println("</body>");
            out.println("</html>");
        }
    }
    
        protected void doPost(HttpServletRequest request, HttpServletResponse response)
        throws ServletException, IOException {
            
            
            //Int quan = request.getQueryString("produto");
            
        }
}
