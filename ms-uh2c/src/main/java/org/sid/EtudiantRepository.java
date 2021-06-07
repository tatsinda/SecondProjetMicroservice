package org.sid;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource //utilisation de sprind data rest pour generer un web service via les methode par defaut
public interface EtudiantRepository extends JpaRepository<Etudiant,Long> {
	public List<Etudiant> findByNomContains(String nom);//methode personnaliser et ecrite suivant des normes
	

}
