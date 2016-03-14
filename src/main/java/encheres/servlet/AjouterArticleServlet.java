/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Article;
import encheres.entity.StatusVente;
import encheres.entity.Utilisateur;
import encheres.service.ArticleCrudService;
import encheres.service.UtilisateurCrudService;
import encheres.spring.AutowireServlet;
import java.io.IOException;
import java.util.GregorianCalendar;
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
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajouter_article"})
public class AjouterArticleServlet extends AutowireServlet {

    @Autowired
    private ArticleCrudService articleCrudService;

    @Autowired
    private UtilisateurCrudService utilisateurCrudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Article article = new Article();

        //Ajouter article en base
        //Parametre date
        int duree = Integer.parseInt(req.getParameter("dateVente"));
        GregorianCalendar calendrier = new GregorianCalendar();
        calendrier.add(GregorianCalendar.DAY_OF_YEAR, duree);
        article.setDateVente(calendrier.getTime());

        article.setNom(req.getParameter("article"));
        String categorie = req.getParameter("categorie");
//        article.setCategorie(c);
        article.setPrixDepart(Long.parseLong(req.getParameter("prixDepart")));
        article.setPrixActuel(Long.parseLong(req.getParameter("prixDepart")));
        article.setStatus(StatusVente.DISPO);
        article.setUtilisateur(utilisateurCrudService.findByEmail((String) req.getSession().getAttribute("email")));
        articleCrudService.save(article);

        //Ajouter article dans mon panier
        List<Article> mesArticles = articleCrudService.findByUtilisateurOrderByDateVente((Utilisateur) req.getSession().getAttribute("email"));
        req.setAttribute("mesArticles", mesArticles);

        resp.sendRedirect("panier_page.jsp");

    }

}
