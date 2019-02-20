package fr.biblio.domain;

import java.util.ArrayList;
import java.util.Date;

import fr.biblio.dao.LivreDAO;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public abstract class Utilisateur extends Personne {

	protected int idUtilisateur;
	protected String pwd;
	protected String pseudonyme;
	protected ArrayList<EmpruntEnCours> emprunts = new ArrayList<>();
	protected ArrayList<EmpruntArchive> empruntsArchive = new ArrayList<>();
	
	public Utilisateur(String nom,String prenom, int id) {
		super(nom, prenom);
		this.setIdUtilisateur(id);
	}
	
	public abstract boolean isPretAccepte();
	public abstract boolean isAnyPretEnRetard();
	
	public void addEmprunt(EmpruntEnCours e) {
		if(this.isPretAccepte()) {
			this.emprunts.add(e);
			 e.getEx().setStatus(StatusExemplaire.PRETE);
		}
	}
	
	public void removeEmprunt(EmpruntEnCours e) {
		this.emprunts.remove(e);
	}
	
	public void addArchive(EmpruntArchive e) {
		this.empruntsArchive.add(e);
		e.getEx().setStatus(StatusExemplaire.DISPONIBLE);
	}
	
	public int getNbrEmpruntEnCours() {
		return this.emprunts.size();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
}
