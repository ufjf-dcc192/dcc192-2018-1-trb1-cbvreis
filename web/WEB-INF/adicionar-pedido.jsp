<%@page import="trabalho01.ListaDosItens"%>
<%@page import="trabalho01.ItemDoPedido"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Pedido</title>
    </head>
    <body>

        <%int codigo = (Integer) request.getAttribute("mesa");%>
        <h1>Pedidos referentes a mesa <%=codigo%></h1>
        <form method="post">
            Pedido para mesa: <input name="mesa" placeholder=" <%=codigo%>" value="3" > 
            Quantidade: <input type ="text" name = "quantidade" /> 
            <!--COMBO DE SELEÇÃO -->
            <select name="produto">
                <% List<ItemDoPedido> produtos = ListaDosItens.getInstance();

                    for (int i = 0; i < produtos.size(); i++) {%>

                    <option  value="<%=produtos.get(i).getNome()%>" ><%=produtos.get(i).getNome()%></option>

            <%}%>
            </select>
             <input type ="Submit" /> 
        </form>
    </body>
</html>
