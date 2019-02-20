package fr.biblio.dao;

import java.util.ArrayList;

import fr.biblio.domain.EmpruntEnCours;

public class EmpruntDAO {
	private ArrayList<EmpruntEnCours> empruntDB = new ArrayList<>();
	
	public void insert(EmpruntEnCours e) {
		this.empruntDB.add(e);
	}
}
