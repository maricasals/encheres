/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Article;
import encheres.entity.StatusVente;
import encheres.service.ArticleCrudService;
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
@WebServlet(name = "AjouterArticleServlet", urlPatterns = {"/ajouter_article"})
public class AjouterArticleServlet extends AutowireServlet {

    @Autowired
    private ArticleCrudService articleCrudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        resp.sendRedirect("panier_page.jsp");
        
        

        
    }

}
