package org.sid;

import org.springframework.data.rest.core.config.Projection;

//creation d'une projection
@Projection(name = "p1",types = {Etudiant.class}) //on donne le nom de la projection et l'entite
public interface EtudiantProjection {
	
	//on definir les methode a renvoyer pour la projection

	public String getNom();
	public Formation getFormation();
}
