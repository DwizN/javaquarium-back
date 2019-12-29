/**
 * 
 */
package fr.univlittoral.javaquarium.DAO;

import java.util.Collection;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import fr.univlittoral.javaquarium.DO.PoissonDO;

/**
 * @author antoineoffroy
 *
 */
@Component
public class PoissonDAO implements IPoissonDAO {


	@Override
	public Collection<PoissonDO> findAll() {
		return null;
	}


}
