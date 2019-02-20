package fr.biblio.domain;

import java.util.Calendar;
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
public class Adherent extends Utilisateur {
	private String telephone;
	private final int nbrMaxPrets = 3;
	private final int dureeMaxPrets = 15;
	
	public Adherent(String nom,String prenom, int id) {
		super(nom, prenom, id);
	}
	
	@Override
	public boolean isPretAccepte() {
		return this.emprunts.size() + 1 <= nbrMaxPrets && !this.isAnyPretEnRetard();
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public boolean isAnyPretEnRetard() {
		for(EmpruntEnCours e : this.emprunts) {			
			Date limite = this.getDateLimitePret(e.getDateEmprunt());
			if(limite.before(new Date()))
				return true;
		}		
		return false;
	}
	
	private Date getDateLimitePret(Date dateEmprunt) {
		Calendar cal = Calendar.getInstance();
		cal.setTime(dateEmprunt);
		cal.add(Calendar.DATE, this.dureeMaxPrets);
		return cal.getTime();
	}
}