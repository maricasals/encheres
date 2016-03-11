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
                            <label>Mes articles postées</label>
                        </td>
                        <td>
                            <label>Mes Encheres</label>
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <c:forEach items="${mesArticles}" var="monArticle">
                            - ${monArticle.nom_article} &nbsp;&nbsp;&nbsp; ${monArticle.categorie} &nbsp;&nbsp;&nbsp; ${monArticle.stat}
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
