<%@page import="java.util.List"%>
<%@page import="trabalho01.Mesas"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Gerir Mesas</title>
    </head>
    <body>
        <h1>Inserir uma Nova Mesa</h1>

        <a href ="adicionar.html"/> Adicionar Mesa </a>
    <div>
        <br/>
        <table border="1">
            <tbody>
                <%
                    List<Mesas> mesas = (List<Mesas>) request.getAttribute("mesas");
                    
                    for (int i = 0; i < mesas.size(); i++) {
                %>
                <tr>
                    
                    <td> <a href="ver-mesa.html?codigo=<%=i%>"><%= mesas.get(i).toString()%> </a></td>
                    <td><% if(mesas.get(i).getPedido().isEstado()==true){
                            %> ABERTO
                            <%
                            }else{
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

    </div>

</body>
</html>