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
                   int somaParcial = 0;
                   
                if(pedido.getPedidos()!=null){ 
                %>
                <% for(int i = 0 ; i<pedido.getPedidos().size();i++){
                    somaParcial+= pedido.getPedidos().get(i).getPreco();%>
                <tr>
                    <td><%=pedido.getPedidos().get(i)%></td>
                    
                    
                   <% }}%>
            </tr>
            <a href ="adicionar-pedido.html?codigo=<%=
               codigo
               %>"> Adicionar Pedido </a>
            </tbody>
        </table>
             <%=somaParcial%>

    </div>
    </body>
</html>
