package fr.univlittoral.javaquarium.DAO;

import java.util.Collection;

import fr.univlittoral.javaquarium.DO.PoissonDO;

public interface IPoissonDAO {
	
	public Collection<PoissonDO> findAll();
}
