<%@page import="trabalho01.Cardapio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%
    List<Cardapio> cardapio = (List<Cardapio>) request.getAttribute("cardapio");
%>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Itens no Cardápio</title>
    </head>
    <body>
        <h1>Nosso Cardápio</h1>
        
        <table border="1">
            
                <% for (int i = 0; i< cardapio.size();i++){%>
                <tr>
                <td><%= cardapio.get(i).getNome() %></td>
                <td><%= cardapio.get(i).getPreco() %></td>
                
            </tr>
                <%}%>
            
        </table>
        <br/>
        <a href ="index.html"> Voltar ao Menu </a>
    </body>

</html>
