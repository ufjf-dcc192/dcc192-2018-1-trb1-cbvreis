<%@page import="java.util.List"%>
<%@page import="trabalho01.Pedidos"%>
<%@page import="trabalho01.Mesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    Pedidos pedido = (Pedidos) request.getAttribute("pedidos");
    List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
    int codigo = (Integer) request.getAttribute("codigo");
    double somaParcial = 0;
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Controle da Mesa <%=codigo%> </title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <div class="container">
            <h1>Mesa <%=codigo%> </h1>

            <%if (!pedido.isEstado()) { %>
            <h1 style="color:red">
                Pedido fechado!
            </h1>
            <%}%>

            <div class="container">
                <%if (pedido.isEstado()) {%>
                <br/><a href ="adicionar-pedido.html?codigo=<%=codigo%>" class="btn btn-primary btn-sm"> Adicionar Itens aoPedido </a>
                <a href ="fechar-pedido.html?codigo=<%=codigo%>" class="btn btn-primary btn-sm"> Fechar Pedido </a>
                <%}%>
            </div>

            <br/>
            <% if (pedido.getPedidos() != null) { %>
            <div class="container">
                <table class="table table-bordered">
                    <tbody>
                        <% for (int i = 0; i < pedido.getPedidos().size(); i++) {
                                somaParcial += pedido.getPedidos().get(i).getPreco();%>
                        <tr>
                            <td><%=pedido.getPedidos().get(i)%></td><% }%>
                        </tr>
                    </tbody>
                </table>
                <%}%>
                <br/>
                <h2> O Valor atual para pagamento é :<b>R$ <%=String.format("%.2f",somaParcial)%> </b></h2>

                <p> Horário de abertura do pedido:  <%=pedido.getDataPedidoAbertura()%></p>
                <%if (!pedido.isEstado()) { %> <p style="color:red">Horário de fechamento do pedido: <%=pedido.getDataPedidoFechamento()%> </p><%}%>
                <!--Botões serão validados de acordo com o estado do pedido-->
            </div>
            <div class="container">
                <br/><p>  
                    <a href ="mesas.html" class="btn btn-primary btn-lg"> Voltar as Mesas </a></p>
            </div>
        </div>
        <%@include file ="jspf/rodape.jspf"%>
    </body>

</html>
