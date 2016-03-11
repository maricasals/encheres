/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.servlet;

import encheres.entity.Utilisateur;
import encheres.spring.AutowireServlet;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import encheres.service.UtilisateurCrudService;
import java.util.List;

/**
 *
 * @author tom
 */
@WebServlet(name = "LoginServlet", urlPatterns = {"/login_servlet"})
public class LoginServlet extends AutowireServlet {

    @Autowired
    private UtilisateurCrudService userCrudService;

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        Utilisateur u = userCrudService.findByEmail(req.getParameter("email"));
        
            if(u == null){
                Utilisateur uNew = new Utilisateur();
                uNew.setEmail(req.getParameter("email"));
                uNew.setMdp(req.getParameter("mdp"));
                System.out.println("*************************************");
                userCrudService.save(uNew);
                req.getRequestDispatcher("user_page.jsp").forward(req, resp);
                return;
            } else {
                throw new RuntimeException("L'utilisateur déjà exist ");
            }
        }
        
        
}
