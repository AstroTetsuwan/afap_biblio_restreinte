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
public class Employe extends Utilisateur {

	private String matricule;
	private CategorieEmploye catEmploye;
	
	public Employe(String nom,String prenom, int id) {
		super(nom, prenom, id);
	}
	
	@Override
	public boolean isPretAccepte() { return true; }
	@Override
	public boolean isAnyPretEnRetard() { return true; }
	@Override
	public String toString() {
		return super.toString();
	}
}
