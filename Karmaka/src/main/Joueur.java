package main;
import java.util.*;

public class Joueur {
	private Lieu mainJoueur;
	private Lieu pileJoueur;
	private Lieu oeuvresJoueur;
	private Lieu vieFutureJoueur;
	
	public Joueur() {
		mainJoueur = new Lieu();
		pileJoueur = new Lieu();
		oeuvresJoueur = new Lieu();
		vieFutureJoueur = new Lieu();
	}
	
	public Lieu getMainJoueur() {
		return mainJoueur;
	}
	public void setMainJoueur(Lieu mainJoueur) {
		this.mainJoueur = mainJoueur;
	}
	public Lieu getPileJoueur() {
		return pileJoueur;
	}
	public void setPileJoueur(Lieu pileJoueur) {
		this.pileJoueur = pileJoueur;
	}
	public Lieu getOeuvresJoueur() {
		return oeuvresJoueur;
	}
	public void setOeuvresJoueur(Lieu oeuvresJoueur) {
		this.oeuvresJoueur = oeuvresJoueur;
	}
	public Lieu getVieFutureJoueur() {
		return vieFutureJoueur;
	}
	public void setVieFutureJoueur(Lieu vieFutureJoueur) {
		this.vieFutureJoueur = vieFutureJoueur;
	}
	
	
	
}
