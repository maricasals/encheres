<%-- 
    Document   : _MENU
    Created on : 8 mars 2016, 14:55:48
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <body>
        <div class="menu">
            <a href="home_page.jsp"><img src="Images/home.png"></a>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <c:choose>
                <c:when test="${sessionScope.email != null}">
                    <a href="home_page.jsp">Desconnexion</a>
                </c:when>
                <c:otherwise>
                    <a href="connexion_page.jsp">Login</a> &nbsp;&nbsp;&nbsp;
                    <a href="login_page.jsp">New User</a> &nbsp;&nbsp;&nbsp;
                </c:otherwise>
            </c:choose>

            <%--<c:if test="${sessionScope.email=!null}">--%>
            <!--<a href="home_page.jsp">Deconnection</a> &nbsp;&nbsp;&nbsp;-->
            <%--</c:if>--%>
            <%--<c:if test="${sessionScope.email==null}">--%>
            <!--<a href="connexion_page.jsp">Login</a> &nbsp;&nbsp;&nbsp;-->
            <!--<a href="login_page.jsp">New User</a> &nbsp;&nbsp;&nbsp;-->
            <%--</c:if>--%>
        </div>
    </body>
</html>
