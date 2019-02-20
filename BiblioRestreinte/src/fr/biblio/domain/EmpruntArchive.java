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
@ToString
public class EmpruntArchive {
	private Date dateRestitution;
	private Date dateEmprunt;
	private Exemplaire ex;
}
