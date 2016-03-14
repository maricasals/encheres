/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.service;

import encheres.entity.Utilisateur;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface UtilisateurCrudService extends CrudRepository<Utilisateur, Long>{
    
    public Utilisateur findOneByEmail(String email);
}
