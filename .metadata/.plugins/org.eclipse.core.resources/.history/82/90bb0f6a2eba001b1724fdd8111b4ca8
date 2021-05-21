package org.sid;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity //pour faire de la classe une ntite dans la base de donnee
@Data //pour faire sortir les gettter et setter des attribut
public class Etudiant {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //on definir id comme la cle primaire et sa valueur s'incremntera auto
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
}
