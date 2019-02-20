package fr.biblio.dao;

import fr.biblio.domain.Auteur;
import fr.biblio.domain.Livre;
import fr.biblio.domain.Utilisateur;

public class LivreDAO {
	private Livre[] livresDB = {
			new Livre(1, "Les misérables", "9782626151413", 556, new Auteur("Hugo", "Victor")),
			new Livre(2, "Les misérables 2", "9782626151413", 556, new Auteur("Hugo", "Victor")),
			new Livre(3, "Les misérables 3", "9782626151413", 556, new Auteur("Hugo", "Victor")),
			new Livre(4, "Les misérables, le retour", "9782626151413", 556, new Auteur("Hugo Jr", "Victor")),
			new Livre(5, "Les misérables, encore eux!", "9782626151413", 556, new Auteur("Hugo Jr", "Victor")),
			new Livre(6, "Les misérables au centre de le Terre", "9782626151413", 556, new Auteur("Hugo Jr", "Victor"))			
	};
	
	public Livre findByKey(int id) {
		for(Livre l : livresDB)
			if(l.getId() == id)
				return l;
		
		return null;
	}
}
