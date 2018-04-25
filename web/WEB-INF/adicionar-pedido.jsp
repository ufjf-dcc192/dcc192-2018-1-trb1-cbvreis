<%@page import="trabalho01.ListaDoCardapio"%>
<%@page import="trabalho01.Cardapio"%>
<%@page import="java.util.List"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Adicionar Pedido</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>

        <div class="container">
            <%int codigo = (Integer) request.getAttribute("codigo");%>
            <h1>Pedidos referentes a mesa <%=codigo%></h1>
            <form method="post">
                <div class="form-group">
                    <label for="usr">Pedido para mesa: </label>
                    <input name="mesa" class="form-control" value="<%=codigo%>" readonly>     
                </div>

                <div class="form-group">
                    <label for="usr"> Quantidade:</label>
                    <input type="number" min="0" max="15" class="form-control" name = "quantidade" /> 

                </div>

                <!--COMBO DE SELEÇÃO -->
                <div class="form-group">
                    <select name="produto" class="form-control">
                        <% List<Cardapio> produtos = ListaDoCardapio.getInstance();

                            for (int i = 0; i < produtos.size(); i++) {%>

                        <option  value="<%=produtos.get(i).getNome()%>" ><%=produtos.get(i).getNome()%></option>
                        <%}%>
                   </select>

                </div>

                   <input class="btn btn-primary btn-lg" type ="Submit" /> 
            </form>
        </div>
    </body>
        <%@include file ="jspf/rodape.jspf"%>

</html>
