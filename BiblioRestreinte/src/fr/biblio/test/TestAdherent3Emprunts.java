package fr.biblio.test;

import java.util.Calendar;
import java.util.Date;

import fr.biblio.dao.ExemplaireDAO;
import fr.biblio.dao.UtilisateurDAO;
import fr.biblio.domain.Adherent;
import fr.biblio.domain.EmpruntEnCours;
import fr.biblio.domain.Exemplaire;

public class TestAdherent3Emprunts {
	public static void main(String[] args) {
		ExemplaireDAO daoEX = new ExemplaireDAO();
		Exemplaire ex1 = daoEX.findByKey(1);
		Exemplaire ex2= daoEX.findByKey(2);
		Exemplaire ex3= daoEX.findByKey(3);
		Exemplaire ex4= daoEX.findByKey(4);

		

		EmpruntEnCours eec= new EmpruntEnCours(new Date(), ex1);
		EmpruntEnCours eec2 = new EmpruntEnCours(new Date(), ex2);
		EmpruntEnCours eec3 = new EmpruntEnCours(new Date(), ex3);
		
		UtilisateurDAO daoU = new UtilisateurDAO();	
		
		Adherent ad =  (Adherent) daoU.findByKey(1);
		ad.addEmprunt(eec);
		ad.addEmprunt(eec2);
		ad.addEmprunt(eec3);
		System.out.println("L'adhérent a 3 emprunts: " + ad.getEmprunts());
		
		System.out.println("On essaye d'ajouter un emprunt: ");
		EmpruntEnCours eec4 = new EmpruntEnCours(new Date(), ex4);
		ad.addEmprunt(eec4);
		System.out.println("L'emprunt n'a pas été ajouté à l'adhérent, il y en a toujours que 3: " + ad.getEmprunts());
		System.out.println("Car isPretAccepté renvoie: " + ad.isPretAccepte());
	}
}
