<%-- 
    Document   : panier_page
    Created on : 11 mars 2016, 11:36:30
    Author     : admin
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Panier Page</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        <br/>
        <div>
            <form action="ajouter_article" method="post">
                <table>
                    <tr>
                        <td>
                            <label>Mes annonces</label>
                        </td>
                            <c:forEach items="${mesArticles}" var="monArticle">
                            - ${monArticle.nom} &nbsp;&nbsp;&nbsp; ${monArticle.categorie} &nbsp;&nbsp;&nbsp; ${monArticle.status} &nbsp;&nbsp;&nbsp; ${monArticle.prixDepart} &nbsp;&nbsp;&nbsp; ${monArticle.prixActuel} &nbsp;&nbsp;&nbsp;
                            <br/>
                            </c:forEach>
                    <td>
                        <label>Mes Encheres</label>
                    </td>
                    </tr>
                    <tr>
                        <td>
                            <c:forEach items="${mesEncheres}" var="monEnchere">
                                - ${monEnchere.nom} &nbsp;&nbsp;&nbsp; ${monEnchere.categorie} &nbsp;&nbsp;&nbsp; ${monEnchere.status}
                                <br/>
                            </c:forEach>
                        </td>
                        <td>

                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
