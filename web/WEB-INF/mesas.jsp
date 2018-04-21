<%@page import="java.util.List"%>
<%@page import="trabalho01.Mesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Inserir uma nova Mesa</title>
    </head>
    <body>
        <h1>Inserir uma Nova Mesa</h1>

        <label>Mesa </label>
        <a href ="adicionar.html"/> Adicionar Mesa </a>
    <div>
        <table border="1">
            <tbody>
                <%
                    List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
                    for (int i = 0; i < mesas.size(); i++) {
                %>
                <tr>
                    
                    <td> <a href="editar.html?codigo=<%=i%>"><%= mesas.get(i).toString()%> </a></td>
                    <td> <a href="editar.html?codigo=<%=i%>">
                            <% if(mesas.get(i).isFlagMesa()==true){
                            %> Fechado
                            <%
                            }else{
                            %> Aberto
                            <%
                                }
                            %> </a></td>
                    <td colspan="3"> <a href="adicionar-Itens.html?codigo=<%=i%>"> Adicionar Itens </a> </td>
                    <td colspan="3"> <a href="fechar-mesa.html?codigo=<%=i%>"> Fechar Pedido </a> </td>
                    <td colspan="3"> <a href="excluir-mesa.html?codigo=<%=i%>"> Ecluir Mesa </a> </td>
                </tr>
                <%
                    }
                %>
            </tbody>
        </table>

    </div>

</body>
</html>