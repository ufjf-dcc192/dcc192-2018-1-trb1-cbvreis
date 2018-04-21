<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        
        <%
                    
           // Pedidos pedido = (Pedidos) request.getAttribute("pedidos");
            int codigo = (Integer) request.getAttribute("mesa");
                   
         %>
        <h1>Pedidos referentes a mesa <%=codigo%></h1>
        
        <form method="post">
            Pedido para mesa: <input name="mesa" placeholder=" <%=codigo%>" Readonly> 
            Nome do produto: <input type ="text" name="nomeProduto" /> 
            Quantidade: <input type ="text" name = "quantidade" /> 
            Valor: <input type ="text" name = "valor" /> 
        
        <input type ="Submit" /> 

         </form>
    </body>
</html>
