package fr.univlittoral.javaquarium.BO;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import fr.univlittoral.javaquarium.DO.PoissonDO;
import fr.univlittoral.javaquarium.repo.PoissonRepository;

@Service
public class PoissonBO {

	@Autowired
	private PoissonRepository repo;
	
	/**
	 * CRUD
	 * @return une liste de poissons
	 */
	public Collection<PoissonDO> findAll() {
		return repo.findAll();
	}
	
	/**
	 * CRUD
	 * Ajoute un poisson
	 */
	public PoissonDO save(final PoissonDO request) {
		return repo.save(request);
	}
	
	public Collection<PoissonDO> findByEspece(final String espece) {
		return repo.findAllByEspece(espece);
	}
}
