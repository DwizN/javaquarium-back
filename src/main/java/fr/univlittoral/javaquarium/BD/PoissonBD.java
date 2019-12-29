/**
 * 
 */
package fr.univlittoral.javaquarium.BD;

import java.util.Collection;
import java.util.logging.Logger;

import javax.transaction.Transactional;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import fr.univlittoral.javaquarium.BO.PoissonBO;
import fr.univlittoral.javaquarium.DO.PoissonDO;
import fr.univlittoral.javaquarium.DTO.PoissonDTO;
import fr.univlittoral.javaquarium.Mapper.PoissonMapper;

/**
 * @author antoineoffroy
 *
 */

@RestController
@RequestMapping(value = "/rest/bd/poisson")
@Transactional
public class PoissonBD {
	
	@Autowired
	private PoissonBO poissonBO;
	
	@Autowired
	private PoissonMapper poissonMapper;
	
	/**
	 * CRUD
	 * @return une liste de poissons
	 */
	@GetMapping(value = "/listePoissons")
	public Collection<PoissonDTO> getAllPoissons() {
		final Collection<PoissonDO> poissonsDO = poissonBO.findAll();		
		return poissonMapper.map(poissonsDO);	
	}
	
	/**
	 * CRUD
	 * ajoute un poisson
	 */
	@PostMapping(value = "/addPoisson")
	public void addPoisson(@RequestBody final PoissonDTO request) {
			poissonBO.save(poissonMapper.map(request));	
	}
	
	
	/**
	 * CRUD
	 * Check si une espèce existe ou non 
	 * @param espece
	 * @return
	 */
	// Dans ce projet osef mais better de le foutre dans le BO pour réutilisabilité. 
	@GetMapping(value="/isValid/{espece}")
		public Boolean checkIfEspeceIsValid(@PathVariable String espece){
			return (poissonBO.findByEspece(espece).isEmpty()) ? true : false;
	}
}
