package fr.biblio.domain;

import java.util.Date;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@ToString
public class Personne {

	protected String nom;
	protected String prenom;
	protected Date dob;
	protected String sexe;
	
	public Personne(String nom, String prenom) {
		this.setNom(nom);
		this.setPrenom(prenom);
	}
	
	@Override
	public String toString() {
		return this.nom + " " + this.prenom;
	}
}
