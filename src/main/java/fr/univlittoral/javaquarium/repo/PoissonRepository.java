package fr.univlittoral.javaquarium.repo;

import java.util.Collection;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.univlittoral.javaquarium.DO.PoissonDO;

@Repository
public interface PoissonRepository extends JpaRepository<PoissonDO, Long> {

	Collection<PoissonDO> findAllByEspece(final String espece);

}
