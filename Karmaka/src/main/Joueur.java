package main;

import java.util.*;

import cartes.Carte;
import main.Sauvegarde;

public class Joueur {
	private Lieu mainJoueur;
	private Lieu pileJoueur;
	private Lieu oeuvresJoueur;
	private Lieu vieFutureJoueur;
	private int niveauKarmique;
	private int anneauxKarmique;
	private String nom;
	private boolean bot;
	// variable bot/ joueur
	
	public Joueur() {
		// implémenter la variable bot/joueur
		this.mainJoueur = new Lieu();
		this.pileJoueur = new Lieu();
		this.oeuvresJoueur = new Lieu();
		this.vieFutureJoueur = new Lieu();
		this.niveauKarmique = 0;
		this.anneauxKarmique = 0;
		this.bot = false;
	}
	
	public String getNomJoueur() {
		return nom;
	}
	public void setNomJoueur(String nom) {
		this.nom = nom;
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
	public void setanneauxKarmique(int cost) {
		this.anneauxKarmique -= cost;
	}	
	public boolean isBot() {
		if(this.bot == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	public void setBot() {
		this.bot = true;
	}
	

	public int choix(Scanner scanner, List<Integer> listePoss) {
	int choixJoueur;
	if(bot) {
	// implémenter la stratégie du bot
	choixJoueur = 1;
	}
	else {
	// Joueur
		do {
		System.out.println("Entrez votre choix :");
		while (!scanner.hasNextInt()) {
		System.out.println("Veuillez entrer un choix possible :");
		scanner.next(); // Ignore la saisie invalide
		}
		choixJoueur = scanner.nextInt();
		} while (!listePoss.contains(choixJoueur));
	}
	scanner.nextLine(); // permet de résoudre les soucis de buffers
	return choixJoueur;
	}
	
	public String choix(Scanner scanner, Lieu tas) {
	// en paramètre : joueur.getMainJoueur()
	String choixJoueur;
	if(bot) { // SURCHARGE POUR String
	// implémenter la stratégie du bot
	// choixJoueur = tas.getCarteParNom(name);
	choixJoueur = tas.retourneCarteLaPlusHaute(); // A CHANGER JUSTE POUR COMPIL
	}
	else {
		// Joueur
		boolean found = false;
		do {
			System.out.println("Entrez votre choix :");
			choixJoueur = scanner.nextLine();
			
			for (Carte carte : tas.getTasCartes()) {
				if (carte.getNom().equalsIgnoreCase(choixJoueur)) {
				  choixJoueur = carte.getNom();
				  found = true;
				  break;
				}
			}
			
			if(choixJoueur == "save") {
				//Sauvegarde enregistrement = new Sauvegarde();
				//Sauvegarde.serializeObject(enregistrement, "sauvegarde.ser");
				// cette méthode ne sérialise qu'un objet
				System.out.println("Partie sauvegardée, à la prochaine");
				System.exit(0);

			}
			else if (choixJoueur == "exit") {
				System.exit(0);
			}
			
			if (!found) {
				System.out.println("Veuillez entrer un choix possible :");
			}
			
		} while (!found);
	}
	return choixJoueur;
	}

	
	
	
	
}
