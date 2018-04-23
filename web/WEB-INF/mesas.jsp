<%@page import="java.util.List"%>
<%@page import="trabalho01.Mesas"%>
<%@include file ="jspf/cabecalho.jspf"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerir Mesas</title>
    </head>
    <body>
    <div class="container">
        <h1>Gerenciamento de Mesas</h1>
        <p>Seja bem-vindo, clique na mesa desejada para adicionar um pedido</p>
    
            <table class="table table-bordered">
                <thead>
                    <tr>
                        <th>Mesa</th>
                        <th>Pedido</th>
                        <th>Excluir Mesa</th>
                    </tr>
                </thead>
                <tbody>
                    <%
                        List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");

                        for (int i = 0; i < mesas.size(); i++) {
                    %>
                    <tr>

                        <td> <a href="ver-mesa.html?codigo=<%=i%>"><%= mesas.get(i).toString()%> </a></td>
                        <td><% if (mesas.get(i).getPedido().isEstado() == true) {
                            %> ABERTO
                            <%
                            } else {
                            %> FECHADO
                            <%
                                }
                            %> </td>
                        <td colspan="3"> <a href="excluir-mesa.html?codigo=<%=i%>"> Excluir Mesa </a> </td>
                    </tr>
                    <%
                        }
                    %>
                </tbody>
            </table>
        <a href="adicionar.html" class="btn btn-primary btn-lg">Adicionar Mesa </a>
        <a href="index.html" class="btn btn-primary btn-lg">Voltar ao Menu </a>
        </div>
        <br/>
    </body>
        <%@include file ="jspf/rodape.jspf"%>

</html>