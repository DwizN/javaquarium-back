package fr.univlittoral.javaquarium.repo;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univlittoral.javaquarium.DO.PoissonDO;
import fr.univlittoral.javaquarium.DO.UtilisateurDO;

@Repository
public interface UtilisateurRepository extends JpaRepository<UtilisateurDO, Long> {

	UtilisateurDO findByUsername(final String userName);

}
