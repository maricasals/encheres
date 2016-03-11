/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.service;

import encheres.entity.Categorie;
import org.springframework.data.repository.CrudRepository;

/**
 *
 * @author admin
 */
public interface CategorieCrudService extends CrudRepository<Categorie, Long>{
    
}
