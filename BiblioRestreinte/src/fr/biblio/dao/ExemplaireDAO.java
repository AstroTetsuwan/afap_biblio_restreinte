package fr.biblio.dao;

import fr.biblio.domain.Exemplaire;
import fr.biblio.domain.Livre;

public class ExemplaireDAO {
	private Exemplaire[] exemplaireDB = {
			new Exemplaire(1, 1),
			new Exemplaire(1, 2),
			new Exemplaire(3, 1),
			new Exemplaire(6, 1),
			new Exemplaire(5, 1),
			new Exemplaire(5, 2),
			new Exemplaire(2, 1),
			new Exemplaire(2, 2),
			new Exemplaire(2, 3),
			new Exemplaire(2, 4),
			new Exemplaire(4, 1),
			new Exemplaire(4, 2),
			new Exemplaire(4, 5),
	};
	
	public Exemplaire findByKey(int id) {
		for(Exemplaire ex : exemplaireDB)
			if(ex.getId() == id)
				return ex;
		
		return null;
	}
}
