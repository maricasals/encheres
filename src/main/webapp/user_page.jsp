<%-- 
    Document   : user_page
    Created on : 10 mars 2016, 16:29:52
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>User Page</title>
        <c:import url="_CSS.jsp"/>
        <c:import url="_TITRE.jsp"/>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        <br/>
        <div class="contenue">
            <a href="encheres.jsp">Encheres</a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="ajouter_article.jsp">New Article</a>
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="panier_page.jsp">Mon Panier</a>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
