/**
 * 
 */
package fr.univlittoral.javaquarium.BO;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univlittoral.javaquarium.DO.UtilisateurDO;
import fr.univlittoral.javaquarium.repo.UtilisateurRepository;

/**
 * @author antoineoffroy
 *
 */
@Service
public class UtilisateurBO {

	@Autowired
	private UtilisateurRepository repo;
	
	/**
	 * CRUD
	 * Cherche un UtilisateurDO par son Username
	 */
	public UtilisateurDO findByUsername(final String username) {
		return repo.findByUsername(username);
	}
}
