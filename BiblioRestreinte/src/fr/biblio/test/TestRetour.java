package fr.biblio.test;

import java.util.Date;

import fr.biblio.dao.ExemplaireDAO;
import fr.biblio.dao.UtilisateurDAO;
import fr.biblio.domain.Adherent;
import fr.biblio.domain.EmpruntArchive;
import fr.biblio.domain.EmpruntEnCours;
import fr.biblio.domain.Exemplaire;

public class TestRetour {

	public static void main(String[] args) {
		ExemplaireDAO daoEX = new ExemplaireDAO();
		Exemplaire ex1 = daoEX.findByKey(1);
		Exemplaire ex2= daoEX.findByKey(2);
		Exemplaire ex3= daoEX.findByKey(3);

		EmpruntEnCours eec= new EmpruntEnCours(new Date(), ex1);
		EmpruntEnCours eec2 = new EmpruntEnCours(new Date(), ex2);
		EmpruntEnCours eec3 = new EmpruntEnCours(new Date(), ex3);
		
		UtilisateurDAO daoU = new UtilisateurDAO();	
		
		Adherent ad =  (Adherent) daoU.findByKey(1);
		ad.addEmprunt(eec);
		ad.addEmprunt(eec2);
		ad.addEmprunt(eec3);
		System.out.println("Exemplaire emprunté - status: " + eec.getEx().getStatus());
		System.out.println("Nombre d'emprunts en cours de l'utilisateur: " + ad.getNbrEmpruntEnCours());
		System.out.println("RETOUR: ");
		ad.removeEmprunt(eec);
		ad.addArchive(new EmpruntArchive(new Date(), eec.getDateEmprunt(), eec.getEx()));
		System.out.println("Nombre d'emprunts en cours de l'utilisateur: " + ad.getNbrEmpruntEnCours());
		System.out.println("Archive: " + ad.getEmpruntsArchive());
		System.out.println("Status de l'exemplaire rendu: " + eec.getEx().getStatus());
	}

}
