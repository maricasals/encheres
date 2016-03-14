<%-- 
    Document   : list_articles
    Created on : 14-mar-2016, 1:34:05
    Author     : Maria
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Tous les Annonces</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        <div>
            <form  action="encheres_list_servlet" method="get">
                <table class="contenue">
                    <tr>
                        <td>Article</td>
                        <td>Categorie</td>
                        <td>PrixDepart</td>
                        <td>PrixActuel</td>
                        <td>Stat</td>
                        <td>Propieteur</td>
                        <td></td>
                    </tr>

                    <c:forEach items="${listEncheres}" var="MonEncher">
                        <tr>
                            <td>
                                ${MonEncher.nom}
                            </td>
                            <td>
                                ${MonEncher.categorie}
                            </td>
                            <td>
                                ${MonEncher.prixDepart}
                            </td>
                            <td>
                                ${MonEncher.prixActuel}
                            </td>
                            <td>
                                ${MonEncher.status}
                            </td>
                            <td>
                                ${MonEncher.Utilisateur}
                            </td>
                            <!--                            <td>
                            <%--<c:if test="${MonEncher.status.DISPO}">--%>
                                <a href="encheres_puja.jsp">ENCHERIR</a>
                            <%--</c:if>--%>
                        </td>-->
                        </tr>
                    </c:forEach>

                </table>
            </form>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
