<%@page import="java.util.List"%>
<%@page import="trabalho01.Pedidos"%>
<%@page import="trabalho01.Mesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
   <body>
        <h1>Mesa  </h1>

    <div>
        <table border="1">
            <tbody>
                <%
                   Pedidos pedido = (Pedidos) request.getAttribute("pedidos");
                   List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
                   int codigo = (Integer) request.getAttribute("codigo");
                   
                if(pedido.getPedidos()!=null){ 
                %>
                <% for(int i = 0 ; i<pedido.getPedidos().size();i++){ %>
                <tr>
                    <td><%=pedido.getPedidos()%></td>
                   
                   <% }}%>
            </tr>
            <a href ="adicionar-pedido.html?codigo=<%=
               codigo
               %>"> Adicionar Pedido </a>
             
            </tbody>
        </table>

    </div>
    </body>
</html>
