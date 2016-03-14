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
            <form  action="mes_articles_servlet" method="get">
                <table class="contenue">
                    <tr>
                        <td>Article</td>
                        <td>Categorie</td>
                        <td>PrixDepart</td>
                        <td>PrixActuel</td>
                        <td>Stat</td>
                    </tr>

                    <c:forEach items="${mesArticles}" var="MonArticle">
                        <br/>
                        <tr>
                            <td>
                                ${MonArticle.nom}
                            </td>
                            <td>
                                ${MonArticle.categorie}
                            </td>
                            <td>
                                ${MonArticle.prixDepart}
                            </td>
                            <td>
                                ${MonArticle.prixActuel}
                            </td>
                            <td>
                                ${MonArticle.status}
                            </td>
                        </tr>

                    </c:forEach>

                </table>
            </form>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
