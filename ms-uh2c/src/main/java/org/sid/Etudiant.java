package org.sid;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity //pour faire de la classe une ntite dans la base de donnee
@Data //pour faire sortir les gettter et setter des attribut
@AllArgsConstructor
@NoArgsConstructor
public class Etudiant {
	
	@Id @GeneratedValue(strategy=GenerationType.IDENTITY) //on definir id comme la cle primaire et sa valueur s'incremntera auto
	private Long id;
	private String nom;
	private String prenom;
	private Date dateNaissance;
	
	public Etudiant(Long id, String nom, String prenom, Date dateNaissance) {
		super();
		this.id = id;
		this.nom = nom;
		this.prenom = prenom;
		this.dateNaissance = dateNaissance;
	}
	
	public Etudiant()
	{
		
	}
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNom() {
		return nom;
	}
	public void setNom(String nom) {
		this.nom = nom;
	}
	public String getPrenom() {
		return prenom;
	}
	public void setPrenom(String prenom) {
		this.prenom = prenom;
	}
	public Date getDateNaissance() {
		return dateNaissance;
	}
	public void setDateNaissance(Date dateNaissance) {
		this.dateNaissance = dateNaissance;
	}
}
