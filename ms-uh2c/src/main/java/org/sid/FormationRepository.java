package org.sid;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.web.bind.annotation.CrossOrigin;

@CrossOrigin("*") //on autorise tout les autres domaines d'acceder a l#app via l'url
public interface FormationRepository extends JpaRepository<Formation, Long> {

}
