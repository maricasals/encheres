/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Article;
import encheres.entity.Enchere;
import encheres.entity.Utilisateur;
import encheres.service.ArticleCrudService;
import encheres.service.UtilisateurCrudService;
import encheres.spring.AutowireServlet;
import java.io.IOException;
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
@WebServlet(name = "EncheresListServlet", urlPatterns = {"/encheres_list_servlet"})
public class EncheresListServlet extends AutowireServlet {
    
    @Autowired
    private ArticleCrudService articleCrudService;

    @Autowired
    private UtilisateurCrudService utilisateurCrudService;
    
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        
        List<Article> listEncheres = (List<Article>) articleCrudService.findAll();
        List<Utilisateur> listUtilisateus = (List<Utilisateur>) utilisateurCrudService.findAll();
        
        if(listEncheres.isEmpty()){
            throw new RuntimeException("En ce moment il n'y a pas d'encheres disponibles");
        }else{
            req.setAttribute("listEncheres", listEncheres);
            req.getRequestDispatcher("list_encheres.jsp").forward(req, resp);
        }
    }
 

}
