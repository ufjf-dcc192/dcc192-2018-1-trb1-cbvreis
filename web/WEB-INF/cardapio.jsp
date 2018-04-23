<%@page import="trabalho01.Cardapio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@include file ="jspf/cabecalho.jspf"%>
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
        <div class="container">
            <h1>Nosso Cardápio</h1>
        </div>
            <div class="container">
            <table class="table table-bordered">
                <thread >
                    <tr>
                        <th> Produto</th>
                        <th> Preço</th>
                   </tr>
                </thread>
                <tbody>

                    <% for (int i = 0; i < cardapio.size(); i++) {%>
                    <tr>
                        <td><%= cardapio.get(i).getNome()%></td>
                        <td>R$<%= cardapio.get(i).getPreco()%></td>
                    </tr>
                    <%}%>
            </table>
            <br/>
            <a href ="index.html" class="btn btn-primary btn-lg">  Voltar ao Menu </a>
        </div>
    </body>

    <%@include file ="jspf/rodape.jspf"%>
</html>
