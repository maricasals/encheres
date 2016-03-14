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
            <form  action="article_servlet" method="post">
                <table class="contenue">
                    <tr>
                        <td>Article</td>
                        <td>Categorie</td>
                        <td>PrixDepart</td>
                        <td>PrixActuel</td>
                        <td>Stat</td>
                        <td>Propieteur</td>
                    </tr>
                    <tr>
                        <c:forEach items="${listAnnonces}" var="MonAnnonce">
                            <td>
                                ${MonAnnonce.nom}
                            </td>
                            <td>
                                ${MonAnnonce.categorie}
                            </td>
                            <td>
                                ${MonAnnonce.prixDepart}
                            </td>
                            <td>
                                ${MonAnnonce.prixActuel}
                            </td>
                            <td>
                                ${MonAnnonce.status}
                            </td>
                            <td>
                                ${MonAnnonce.Utilisateur}
                            </td>
                        </c:forEach>
                    </tr>
                </table>
            </form>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
