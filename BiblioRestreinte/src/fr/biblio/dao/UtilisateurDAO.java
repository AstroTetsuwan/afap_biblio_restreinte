package fr.biblio.dao;


import fr.biblio.domain.Adherent;
import fr.biblio.domain.Employe;
import fr.biblio.domain.Utilisateur;

public class UtilisateurDAO {
	private Utilisateur[] utilisateurDB = {
			new Adherent("Débé", "Maria", 1),
			new Employe("Bouquin", "Miss", 2),
			new Employe("Chassis", "Robert", 3),
			new Adherent("Lombok", "John", 4),
			new Adherent("Jacques", "François", 5),
			new Adherent("Dupont", "Anatole", 6)		
	};
	
	public Utilisateur findByKey(int id) {
		for(Utilisateur u : utilisateurDB)
			if(u.getIdUtilisateur() == id)
				return u;
		
		return null;
	}
}
