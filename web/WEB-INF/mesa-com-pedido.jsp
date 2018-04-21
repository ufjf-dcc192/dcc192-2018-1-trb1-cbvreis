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
                   int codigo = (Integer) request.getAttribute("mesa");
                   
                %>
                <tr>
                    <td><%= pedido.toString()%></td>
                   
            <a href ="adicionar-pedido.html?mesa=<%=
               codigo
               %>"> Adicionar Pedido </a>
                </tr>
             
            </tbody>
        </table>

    </div>
    </body>
</html>
