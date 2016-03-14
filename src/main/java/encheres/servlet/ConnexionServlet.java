/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Utilisateur;
import encheres.service.UtilisateurCrudService;
import encheres.spring.AutowireServlet;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "ConnexionServlet", urlPatterns = {"/connexion_servlet"})
public class ConnexionServlet extends AutowireServlet {

    @Autowired
    private UtilisateurCrudService userCrudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Utilisateur u1 = userCrudService.findByEmail(req.getParameter("email"));

        if (u1 != null){
            if(u1.getMdp().equals(req.getParameter("mdp"))){
                userCrudService.save(u1);
                req.getRequestDispatcher("user_page.jsp").forward(req, resp);
                return;
            }if(!(u1.getMdp().equals(req.getParameter("mdp")))){
                throw new RuntimeException("Attention! Le mot de pas choisi est incorrecte");
            }else{
                throw new RuntimeException("Login pas trouvé, nouveau Utilisateur? Inscrivez vous!");
            }
        }
    }        
}
