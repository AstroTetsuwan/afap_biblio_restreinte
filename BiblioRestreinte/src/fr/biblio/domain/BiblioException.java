package fr.biblio.domain;

public class BiblioException extends Exception {
	public BiblioException() {
		super("Problème générique");
	}
	public BiblioException(String message) {
		super(message);
	}
	
}
