<%-- 
    Document   : encheres
    Created on : 14 mars 2016, 11:10:41
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
         <br/>
         <c:import url="_MENU.jsp"/>
        <div class="contenue">
            <a href="encheres_list_servlet">List des Encheres
            </a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <a href="encheres_puja.jsp">New Puja</a>
        </div>
    </body>
</html>
