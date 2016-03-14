/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.service;

import encheres.entity.Article;
import encheres.entity.Utilisateur;
import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface ArticleCrudService extends CrudRepository<Article, Long>{
    
    public List<Article> findByUtilisateurOrderByDateVente(Utilisateur utilisateur);
    public List<Article> findByUtilisateurEmailOrderByDateVente(String email);
//    public List<Article> findByPrixOrderByPrixDepartDesc(long p);
//    public List<Article> findByUtilisateurEmailOrderByEmail(String email);
    
}
