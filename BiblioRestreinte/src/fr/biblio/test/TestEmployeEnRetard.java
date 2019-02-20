package fr.biblio.test;

import java.util.Calendar;
import java.util.Date;

import fr.biblio.dao.ExemplaireDAO;
import fr.biblio.dao.UtilisateurDAO;
import fr.biblio.domain.Employe;
import fr.biblio.domain.EmpruntEnCours;
import fr.biblio.domain.Exemplaire;

public class TestEmployeEnRetard {
	public static void main(String[] args) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());
		cal.add(Calendar.DATE, -20);
		Date dateMoins20Jours = cal.getTime();
		
		ExemplaireDAO daoEX = new ExemplaireDAO();
		Exemplaire ex1 = daoEX.findByKey(1);
		Exemplaire ex2= daoEX.findByKey(2);

		EmpruntEnCours empruntAujourdhui= new EmpruntEnCours(new Date(), ex1);
		EmpruntEnCours eec = new EmpruntEnCours(dateMoins20Jours, ex2);

		UtilisateurDAO daoU = new UtilisateurDAO();	
		
		Employe ad =  (Employe) daoU.findByKey(2);
		ad.addEmprunt(eec);
		System.out.println("Employe a un emprunt en retard: " + ad.getEmprunts());
		
		System.out.println("On essaye d'ajouter un emprunt aujourd'hui: ");
		ad.addEmprunt(empruntAujourdhui);
		System.out.println("L'emprunt a été ajouté à Employemalgré le retard: " + ad.getEmprunts());
		System.out.println("Car isPretAccepté renvoie: " + ad.isPretAccepte());
	}
}
