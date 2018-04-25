<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@page import="trabalho01.Cardapio"%>
<%@page import="java.util.List"%>
<%@page import="java.util.List"%>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Itens no Cardápio</title>
        <%@include file ="jspf/cabecalho.jspf"%>
    </head>
    <body>
        <div class="container">
            <h1>Nosso Cardápio</h1>
        </div>
            <div class="container">
            <table class="table table-bordered">
                <thread>
                    <tr>
                       <th> Produto</th>
                       <th> Preço</th>
                   </tr>
                </thread>
                <tbody>
                   <c:forEach var="cardapioItem" items="${cardapio}">
                    <tr>
                       <td>${cardapioItem.nome}</td>
                       <td><fmt:formatNumber value = "${cardapioItem.preco}" type = "currency"/> </td>
                    </tr>
                   </c:forEach>
            </table>
            <br/>
            <a href ="index.html" class="btn btn-primary btn-lg">  Voltar ao Menu </a>
        </div>
    </body>
    <%@include file ="jspf/rodape.jspf"%>
</html>
