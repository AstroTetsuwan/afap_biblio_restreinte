package fr.biblio.domain;

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
public class Exemplaire {
	private int idLivre;
	private int id;
	private Date dateAchat;
	private StatusExemplaire status;
	
	public Exemplaire(int idLivre, int id) {
		this.setIdLivre(idLivre);
		this.setId(id);
	}
	
	@Override
	public String toString() {
		LivreDAO daoL = new LivreDAO();
		Livre l = daoL.findByKey(getIdLivre());
		return l.getTitle() + " " + l.getIsbn() + " ID exemplaire: " + this.getId();
	}
} 
