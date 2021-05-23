package org.sid;

import org.springframework.data.rest.core.config.Projection;

@Projection(name="p1",types = {Etudiant.class}) //on definir une projection et avec pour nom p1 et pour classe Etudiant
public interface EtudiantProjection {
	
	//methode qui sera renvoyer par la projection
	public String getNom();
	public String getFormation();

}
