/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Utilisateur;
import encheres.service.ArticleCrudService;
import encheres.service.UtilisateurCrudService;
import encheres.spring.AutowireServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;

/**
 *
 * @author admin
 */
@WebServlet(name = "UtilisateurServlet", urlPatterns = {"/utilisateur_servlet"})
public class UtilisateurServlet extends AutowireServlet {

    @Autowired
    private UtilisateurCrudService utilisateurCrudService;
    
    @Autowired
    private ArticleCrudService articleCrudService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        Utilisateur utilisateur = new Utilisateur(req.getParameter("email"), req.getParameter("mdp"));
        utilisateurCrudService.save(utilisateur);
        
        req.getRequestDispatcher("home_page.jps").include(req, resp);
    }
    
    

}
