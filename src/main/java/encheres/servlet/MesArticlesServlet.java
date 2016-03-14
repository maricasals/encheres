/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Article;
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
@WebServlet(name = "MesArticlesServlet", urlPatterns = {"/mes_articles_servlet"})
public class MesArticlesServlet extends AutowireServlet {
    
    @Autowired
    private ArticleCrudService articleCrudService;
    
    @Autowired
    private UtilisateurCrudService utilisateurCrudService;

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //Ajouter article dans mon panier
        List<Article> mesArticles = articleCrudService.findByUtilisateurEmailOrderByDateVente((String) req.getSession().getAttribute("email"));
        req.setAttribute("mesArticles", mesArticles);
        req.getRequestDispatcher("list_mes_articles.jsp").forward(req, resp);
    }
 

}
