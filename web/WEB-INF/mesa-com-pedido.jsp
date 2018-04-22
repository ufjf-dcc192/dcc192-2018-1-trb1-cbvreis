<%@page import="java.util.List"%>
<%@page import="trabalho01.Pedidos"%>
<%@page import="trabalho01.Mesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Pedidos pedido = (Pedidos) request.getAttribute("pedidos");
    List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
    int codigo = (Integer) request.getAttribute("codigo");
    int somaParcial = 0;
%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Mesa  </h1>
        <%if(!pedido.isEstado()){ %>
        <h1>
            Pedido fechado!
        </h1>
        <%}%>
        <% if (pedido.getPedidos() != null) { %>
        <div>
            <table border="1">
                <tbody>

                    <% for (int i = 0; i < pedido.getPedidos().size(); i++) {
                        somaParcial += pedido.getPedidos().get(i).getPreco();%>
                    <tr>
                        <td><%=pedido.getPedidos().get(i)%></td>


                        <% }%>
                    </tr>
                </tbody>
            </table>
          <%}%>
            <br/>

            <div> O Valor atual para pagamento é :<b> <%=somaParcial%> </b></div>





            
        <%if(pedido.isEstado()){ %>
        <br/><a href ="adicionar-pedido.html?codigo=<%=codigo%>"> Adicionar Pedido </a>

        <br/><a href ="fechar-pedido.html?codigo=<%=codigo%>"> Fechar Pedido </a>
        
        <br/> <%=pedido.getDataPedidoAbertura() %>
  

        <%}%>

        

        </div>
        <br/><a href ="mesas.html"> Voltar as Mesas </a>

    </body>
</html>
