<%-- 
    Document   : datos
    Created on : 11-16-2022, 06:25:46 PM
    Author     : fer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Resultado</title>
    </head>
    <body>
        <h1>Sus datos</h1>
        <form name="resultado" action="">
            <textarea name="area" rows="20" cols="40">
                <%
                    if(request.getAttribute("formPeso")!=null){
                        out.print((String)request.getAttribute("formPeso"));
                    }
                %>
            </textarea>
        </form>
    </body>
</html>
