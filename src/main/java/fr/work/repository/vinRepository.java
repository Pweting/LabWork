package fr.work.repository;

import fr.work.modele.Vin;
import org.springframework.data.jpa.repository.JpaRepository;

public interface vinRepository extends JpaRepository<Vin, Integer> {

/*
@Query("select distinct nom from vin where nom like %")
public List<Vin> findByName();
*/

}
