<%-- 
    Document   : newjsp
    Created on : 30/09/2022, 11:52:59
    Author     : natan
--%>

<%@page import="Classes.Pessoa"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
    <%
    //Recebe os valores da tela HTML
    String vnomepessoa = request.getParameter("nomePessoa");
    String vemail = request.getParameter("email");
    
    Pessoa pes = new Pessoa();
    pes.setNomePessoa(vnomepessoa);
    pes.setEmail(vemail);
    
    if(pes.IncluirPessoa()) {
        response.sendRedirect("cadastrarpessoa.jsp?pmensagem=Pessoa cadastrada com sucesso");
    } else {
        response.sendRedirect("cadastrarpessoa.jsp?pmensagem=Problemas ao cadastrar pessoa");
    }
    %>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World!</h1>
    </body>
</html>
