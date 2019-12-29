/**
 * 
 */
package fr.univlittoral.javaquarium.Mapper;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.stereotype.Component;

import fr.univlittoral.javaquarium.DO.PoissonDO;
import fr.univlittoral.javaquarium.DTO.PoissonDTO;

/**
 * @author antoineoffroy
 * Mapping entités 
 */

@Component
public class PoissonMapper {

	/**
	 * Mapping d'un poisson
	 * @param source poisson
	 * @return
	 */
	public PoissonDTO map(final PoissonDO source) {
		final PoissonDTO result = new PoissonDTO();
		if (null == source) {
			return result;
		}

		result.setNom(source.getEspece());
		result.setDescription(source.getDescription1());
		result.setCouleur(source.getCouleur());
		result.setLargeur(source.getLargeur());
		result.setLongueur(source.getLongueur());
		result.setPrix(source.getPrix());
		return result;
	}
	
	/**
	 * Mapping d'une collection de poissons 
	 * @param source liste de poissons
	 * @return
	 */
	public Collection<PoissonDTO> map(final Collection<PoissonDO> source) {
		final Collection<PoissonDTO> result = new ArrayList<>();
		
		if (null == source) {
			return result;
		}

		for(final PoissonDO poissonDO : source) {
			final PoissonDTO dto = new PoissonDTO();
			dto.setNom(poissonDO.getEspece());
			dto.setCouleur(poissonDO.getCouleur());
			dto.setDescription(poissonDO.getDescription1());
			dto.setLargeur(poissonDO.getLargeur());
			dto.setLongueur(poissonDO.getLongueur());
			dto.setPrix(poissonDO.getPrix());
			result.add(dto);
		}
		return result;
	}
	
	/**
	 * Mapping d'une collection de poissons 
	 * @param source liste de poissons
	 * @return
	 */
	public PoissonDO map(final PoissonDTO request) {
		
		final PoissonDO source = new PoissonDO();
		if (null == request) {
			return source;
		}

		source.setEspece(request.getNom());
		source.setDescription1(request.getDescription());
		source.setLargeur(request.getLargeur());
		source.setLongueur(request.getLongueur());
		source.setCouleur(request.getCouleur());
		source.setPrix(request.getPrix());
		return source;
	}
}
