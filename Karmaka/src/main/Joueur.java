package main;

import java.util.*;

public class Joueur {
	private Lieu mainJoueur;
	private Lieu pileJoueur;
	private Lieu oeuvresJoueur;
	private Lieu vieFutureJoueur;
	private int niveauKarmique;
	private int anneauxKarmique;
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
		return choixJoueur;
	}
	
	public String choix(Scanner scanner, Lieu args) { // NE FONCTIONNE PAS
		String choixJoueur;
		if(bot) { // SURCHARGE POUR String
			// implémenter la stratégie du bot
			choixJoueur = "BOT";
		}
		else {
			// Joueur
			boolean found = false;
			do {
	            System.out.println("Entrez votre choix :");
	            choixJoueur = scanner.nextLine();

	            for (Lieu arg : getTasCartes()) {
	                if (arg.equals(choixJoueur)) {
	                    found = true;
	                    break;
	                }
	            }

	            if (!found) {
	                System.out.println("Veuillez entrer un choix possible :");
	            }

	        } while (!found);
	    }
		return choixJoueur;
	}
	
	
	
	
}
