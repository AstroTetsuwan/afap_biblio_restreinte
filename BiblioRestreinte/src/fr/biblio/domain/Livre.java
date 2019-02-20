package fr.biblio.domain;

import java.util.ArrayList;

import lombok.Data;

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
public class Livre {
	private int id;
	private String title;
	private String isbn;
	private int nbrPages;
	private ArrayList<Auteur> auteurs = new ArrayList<>();
	
	public Livre(int id, String title, String isbn, int nbrPages, Auteur auteur) {		
		this(id, title, isbn, nbrPages, new ArrayList<>());
		ArrayList<Auteur> auteurs = new ArrayList<>();
		auteurs.add(auteur);
		this.setAuteurs(auteurs);
	}
}
