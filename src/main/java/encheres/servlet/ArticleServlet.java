/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Article;
import encheres.service.ArticleCrudService;
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
 * @author Maria
 */
@WebServlet(name = "ArticleServlet", urlPatterns = {"/article_servlet"})
public class ArticleServlet extends AutowireServlet {
    
    @Autowired
    ArticleCrudService articleCrudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        List<Article> listAnnonces = (List<Article>) articleCrudService.findAll();
        req.setAttribute("listAnnonces", listAnnonces);
        req.getRequestDispatcher("list_articles.jsp").forward(req, resp);
        
        
    }
    
    


}
