/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package encheres.service;

import org.springframework.data.repository.CrudRepository;
import encheres.entity.Enchere;

/**
 *
 * @author tom
 */
public interface EnchereCrudService extends CrudRepository<Enchere, Long>{
    
}
