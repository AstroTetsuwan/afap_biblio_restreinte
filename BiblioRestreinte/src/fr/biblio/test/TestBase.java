package fr.biblio.test;

import javax.swing.JOptionPane;

import fr.biblio.dao.ExemplaireDAO;
import fr.biblio.dao.UtilisateurDAO;
import fr.biblio.domain.Exemplaire;
import fr.biblio.domain.Utilisateur;

public class TestBase {

	private static ExemplaireDAO daoEx = new ExemplaireDAO();
	private static UtilisateurDAO daoU = new UtilisateurDAO();
	
	public static void main(String[] args) {
	
		showExemplaire();
		showExemplaire();
		showUtilisateur();
		showUtilisateur();		
	}
	
	public static int parseString(String s) {
		int idEx = 0;
		try {
			idEx = Integer.parseInt(s);
		} catch(NumberFormatException e) {
			e.printStackTrace();
		}
		return idEx;
	}
	
	public static void showExemplaire() {
		String id = JOptionPane.showInputDialog(null, "Entrez l'identifiant d'un exemplaire");
		int idEx = parseString(id);
		Exemplaire ex1 = daoEx.findByKey(idEx);
		JOptionPane.showMessageDialog(null, ex1.toString(), "Exemplaire demandé", JOptionPane.INFORMATION_MESSAGE);
	}
	
	public static void showUtilisateur() {
		String id = JOptionPane.showInputDialog(null, "Entrez l'identifiant de l'utilisateur.");
		int idU = parseString(id);
		Utilisateur u = daoU.findByKey(idU);
		JOptionPane.showMessageDialog(null, u.toString() + " - className = " + u.getClass(), 
				"Utilisateur demandé", JOptionPane.INFORMATION_MESSAGE);		
	}
}
