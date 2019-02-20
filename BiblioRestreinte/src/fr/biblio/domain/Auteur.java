package fr.biblio.domain;

import java.util.Date;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@Getter
@Setter
@ToString
public class Auteur extends Personne {
	
	public Auteur(String nom, String prenom) {
		super(nom, prenom);
	}
}
