<%-- 
    Document   : ajouter_article
    Created on : 11 mars 2016, 10:38:07
    Author     : admin
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>New Article</title>
        <c:import url="_CSS.jsp"/>
    </head>
    <body>
        <c:import url="_MENU.jsp"/>
        <div>Ajouter nouveaux article :</div>
        <div>
            <!--            <form action="ajouter_article" method="post">
                            <table>
                                <tr>
                                    <td>
                                        <label>Nom article :</label>
                                    </td>
                                    <td>
                                        <input type="text" name="nom_article">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label>Prix de depart</label>
                                    </td>
                                    <td>
                                        <input type="text" name="prixDepart">
                                    </td>
                                </tr>
                                <tr>
                                    <td>
                                        <label>Categorie</label>
                                    </td>
                                    <td>
                                        <select name="categorie">
                                            <option value="1">Vehicules</option>
                                            <option value="2">Immobiliaire</option>
                                            <option value="3">Meubles et objets d'art</option>
                                            <option value="4">Materiels</option>
                                            <option value="5">Autre</option>
                                        </select> 
                                    </td>
                                </tr>
                                <tr>
                                    <td colspan="2">
                                        <input type="submit" name="Ajouter" value="Ajouter">
                                    </td>
                                </tr>
                            </table>
                        </form>-->
            <form  method="post" action="ajouter_article">

                <div >
                    <label>Article</label>
                    <input name="article" placeholder="Article" type="text" required="true">
                </div>
                <div >
                    <label>Description</label>
                    <textarea name="description"  type="text" required="true"></textarea>
                </div>
                    <div >
                        <label>Catégorie</label>
                        <select name="categorie">
                            <option value="1">Vehicules</option>
                            <option value="2">Immobiliaire</option>
                            <option value="3">Meubles et objets d'art</option>
                            <option value="4">Materiels</option>
                            <option value="5">Autre</option>
                        </select> 
                    </div>
                <div>
                    <label>Prix de départ</label>
                    <input name="prixDepart" type="number" min="1" required="true">
                </div>
                <div>
                    <label>Durée de la vente</label>
                    <div>
                        <div>
                            Jour(s)
                        </div>
                        <input id="dateVente" name="dateVente" type="number" min="1" required="true">

                    </div>

                </div>
                <button type="submit"> Envoyer</button>
            </form>
        </div>
    </body>
    <c:import url="_PIED.jsp"/>
</html>
