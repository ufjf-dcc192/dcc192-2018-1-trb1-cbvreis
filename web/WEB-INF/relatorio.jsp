<%@page import="trabalho01.Mesas"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@include file ="jspf/cabecalho.jspf"%>
<% List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Relatório Gerencial</title>
    </head>
    <body>
        <div class="container">
            <h1>Relatório Gerencial</h1>

            <table class="table table-striped">
                <thread >
                    <tr>
                    <td> Valor Total da Mesa</td>
                    <td> Abertura do Pedido</td>
                    <td> Fechamento do Pedido</td>
                    </tr>
                </thread>
                <tbody>

                <% for (int i = 0; i < mesas.size(); i++) {%>
                <tr>
                    <td>Mesa <%=i%>: R$<%= mesas.get(i).getPedido().getSomaTotal()%></td>
                    <td><%= mesas.get(i).getPedido().getDataPedidoAbertura()%></td>
                    <td><%= mesas.get(i).getPedido().getDataPedidoFechamento()%></td>
                </tr>
                <%}%>
            <tbody>

            </table>
            <br/>
            <a href ="index.html" class="btn btn-primary btn-lg"> Voltar ao Menu </a>
        </div>
    </body>
        <%@include file ="jspf/rodape.jspf"%>

</html>
