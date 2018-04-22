<%@page import="trabalho01.Mesas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%
    List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Relatório Gerencial</h1>
        
        <table border="1">
        <% for (int i = 0; i< mesas.size();i++){%>
                <tr>
                    <td>Mesa <%=i%>: R$<%= mesas.get(i).getPedido().getSomaTotal() %></td>
                    <td><%= mesas.get(i).getPedido().getDataPedidoAbertura() %></td>
                    <td><%= mesas.get(i).getPedido().getDataPedidoFechamento() %></td>
                </tr>
        <%}%>
            
        </table>
        <br/>
        <a href ="index.html"> Voltar ao Menu </a>
    </body>
</html>
