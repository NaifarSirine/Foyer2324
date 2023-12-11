package tn.esprit.spring.DAO.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import tn.esprit.spring.DAO.Entities.Etudiant;

public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
    Etudiant findByCin(long cin);
}
