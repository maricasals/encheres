<%-- 
    Document   : connexion_page
    Created on : 10 mars 2016, 16:06:24
    Author     : admin
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Connexion Page</title>
    </head>
    <body>
        <div>Connexion Page:</div>
        <form action="connexion_servlet" method="post">
            <table>
                <tr>
                    <td>
                        <label>Email</label>
                    </td>
                    <td>
                        <input type="text" name="email">
                    </td>
                </tr>
                <tr>
                    <td>
                        <label>Mot de pas</label>
                    </td>
                    <td>
                        <input type="password" name="mdp">
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" name="Connexion" value="Connexion">
                    </td>
                </tr>
            </table>
        </form>
    </body>
</html>
