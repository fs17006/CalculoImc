<%-- 
    Document   : index
    Created on : 11-16-2022, 05:14:15 PM
    Author     : fer
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Bienvenido</title>
    </head>
    <body>
        <h1>Calculadora de peso ideal</h1>
        <p>Por favor llene los siguientes campos:</p>
        <form name="formPeso" method="post" action="<%=request.getContextPath()%>/servlet1">
            <select name="sexo" type="text" required> <option value="masculino"> masculino <option value="femenino"> femenino </select>
            <br>
            <input type="text" name="nombre" placeholder="Ingrese su nombre" required>
            <input type="text" name="peso" placeholder="ingrese su peso en libras" required>
            <input type="text" name="altura" placeholder="ingrese su altura en metros" required>
            <input type="text" name="edad" placeholder="ingrese su edad" required>
            <input type="reset" value="borrar">
            <input type="submit" value="Calcular">
        </form>
    </body>
</html>
