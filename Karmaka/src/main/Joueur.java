package main;

public class Joueur {
	private Lieu mainJoueur;
	private Lieu pileJoueur;
	private Lieu oeuvresJoueur;
	private Lieu vieFutureJoueur;
	private int niveauKarmique;
	private int anneauxKarmique;
	// variable bot/ joueur
	
	public Joueur() {
		// implémenter la variable bot/joueur
		this.mainJoueur = new Lieu();
		this.pileJoueur = new Lieu();
		this.oeuvresJoueur = new Lieu();
		this.vieFutureJoueur = new Lieu();
		this.niveauKarmique = 0;
		this.anneauxKarmique = 0;
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
	public int getniveauKarmique() {
		return niveauKarmique;
	}
	public void setniveauKarmique() {
		this.niveauKarmique += niveauKarmique;
	}
	public int getanneauxKarmique() {
		return niveauKarmique;
	}
	public void setanneauxKarmique() {
		this.anneauxKarmique += anneauxKarmique;
	}
	
	public void choix() {
		// à développer : permet de faire le choix en fonction de joueur/bot
		;
	}
	
	public boolean estHumain() {
		// Retourne True si ce n'est pas un bot
		;
	}
	
	
	
}
