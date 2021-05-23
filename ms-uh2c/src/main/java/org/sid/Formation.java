package org.sid;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Formation {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY)
	private Long id;
	private String nom;
	private int duree;
	
	@OneToMany(mappedBy = "formation") //association et on dit que c'est une association bidirectionnellle, donc de meme avec celle etudiant
	private Collection<Etudiant> etudiants; //une formation comtient un ensemble d'etudiant

	public Formation(Long id, String nom, int duree, Collection<Etudiant> etudiants) {
		super();
		this.id = id;
		this.nom = nom;
		this.duree = duree;
		this.etudiants = etudiants;
	}
	
	public Formation()
	{
		
	}

}