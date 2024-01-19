package main;

import java.util.*;

import cartes.Carte;
import main.Sauvegarde;

/**
 * Cette classe représente un joueur dans le jeu.
 */
public class Joueur {
	private Lieu mainJoueur;
	private Lieu pileJoueur;
	private Lieu oeuvresJoueur;
	private Lieu vieFutureJoueur;
	private int niveauKarmique;
	private int anneauxKarmique;
	private String nom;
	private boolean bot;
	
	 /**
     * Constructeur par défaut de la classe Joueur.
     * Initialise les différents lieux du joueur et les compteurs karmiques.
     */
	public Joueur() {
		this.mainJoueur = new Lieu();
		this.pileJoueur = new Lieu();
		this.oeuvresJoueur = new Lieu();
		this.vieFutureJoueur = new Lieu();
		this.niveauKarmique = 0;
		this.anneauxKarmique = 0;
		this.bot = false;
	}
	
	 /**
     * Obtient le nom du joueur.
     * @return Le nom du joueur.
     */
	public String getNomJoueur() {
		return nom;
	}
	
	/**
     * Définit le nom du joueur.
     * @param nom Le nouveau nom du joueur.
     */
	public void setNomJoueur(String nom) {
		this.nom = nom;
	}
	
	 /**
     * Obtient le lieu représentant la main du joueur.
     * @return Le lieu de la main du joueur.
     */
	public Lieu getMainJoueur() {
		return mainJoueur;
	}
	
	/**
     * Définit le lieu de la main du joueur.
     * @param mainJoueur Le nouveau lieu de la main du joueur.
     */
	public void setMainJoueur(Lieu mainJoueur) {
		this.mainJoueur = mainJoueur;
	}
	
	/**
     * Obtient le lieu représentant la pile du joueur.
     * @return Le lieu de la pile du joueur.
     */
	public Lieu getPileJoueur() {
		return pileJoueur;
	}
	
	/**
     * Définit le lieu de la pile du joueur.
     * @param pileJoueur Le nouveau lieu de la pile du joueur.
     */
	public void setPileJoueur(Lieu pileJoueur) {
		this.pileJoueur = pileJoueur;
	}
	
	/**
    * Obtient le lieu représentant les œuvres du joueur.
    * @return Le lieu des œuvres du joueur.
    */
	public Lieu getOeuvresJoueur() {
		return oeuvresJoueur;
	}
	
	/**
     * Définit le lieu des œuvres du joueur.
     * @param oeuvresJoueur Le nouveau lieu des œuvres du joueur.
     */
	public void setOeuvresJoueur(Lieu oeuvresJoueur) {
		this.oeuvresJoueur = oeuvresJoueur;
	}
	
	/**
     * Obtient le lieu représentant la Vie Future du joueur.
     * @return Le lieu de la Vie Future du joueur.
     */
	public Lieu getVieFutureJoueur() {
		return vieFutureJoueur;
	}
	
	/**
     * Définit le lieu de la Vie Future du joueur.
     * @param vieFutureJoueur Le nouveau lieu de la Vie Future du joueur.
     */
	public void setVieFutureJoueur(Lieu vieFutureJoueur) {
		this.vieFutureJoueur = vieFutureJoueur;
	}
	
	/**
     * Obtient le niveau karmique du joueur.
     * @return Le niveau karmique du joueur.
     */
	public int getniveauKarmique() {
		return niveauKarmique;
	}
	
	/**
     * Définit le niveau karmique du joueur en l'incrémentant à chaque appel
     */
	public void setniveauKarmique() {
		this.niveauKarmique += niveauKarmique;
	}
	
	/**
     * Obtient le nombre d'anneaux karmiques du joueur.
     * @return Le nombre d'anneaux karmiques du joueur.
     */
	public int getanneauxKarmique() {
		return niveauKarmique;
	}
	
	/**
     * Incrémente le nombre d'anneaux karmiques du joueur.
     */
	public void setanneauxKarmique() {
		this.anneauxKarmique += anneauxKarmique;
	}
	
	/**
     * Décrémente le nombre d'anneaux karmiques du joueur de la valeur spécifiée.
     * @param cost La valeur à décrémenter.
     */
	public void setanneauxKarmique(int cost) {
		this.anneauxKarmique -= cost;
	}	
	
	/**
     * Vérifie si le joueur est un bot.
     * @return Vrai si le joueur est un bot, sinon faux.
     */
	public boolean isBot() {
		if(this.bot == true) {
			return true;
		}
		else {
			return false;
		}
	}
	
	/**
     * Définit le joueur comme un bot.
     */
	public void setBot() {
		this.bot = true;
	}
	
	/**
     * Effectue le choix du joueur en utilisant la liste d'entiers spécifiée comme options.
     * @param scanner Scanner pour la saisie utilisateur.
     * @param listePoss Liste d'entiers représentant les options possibles.
     * @return Choix du joueur.
     */
	public int choix(Scanner scanner, List<Integer> listePoss) {
	int choixJoueur;
	if(bot) {
		// Implémentation de la stratégie du bot
	    Random random = new Random();   
	        
	    // Obtention d'un index aléatoire dans la liste
	    int indexAleatoire = random.nextInt(listePoss.size());
	    // Obtention de la valeur correspondant à l'index aléatoire
	    int valeurAleatoire = listePoss.get(indexAleatoire);
		choixJoueur = valeurAleatoire;
	}
	else {
		do {
		System.out.println("Entrez votre choix :");
		while (!scanner.hasNextInt()) {
		System.out.println("Veuillez entrer un choix possible :");
		scanner.next();
		}
		choixJoueur = scanner.nextInt();
		} while (!listePoss.contains(choixJoueur));
	}
	scanner.nextLine();
	return choixJoueur;
	}
	
	/**
     * Effectue le choix du joueur en utilisant le tas spécifié comme options.
     * @param scanner Scanner pour la saisie utilisateur.
     * @param tas Lieu contenant les options possibles.
     * @return Choix du joueur.
     */
	public String choix(Scanner scanner, Lieu tas) {
	String choixJoueur;
	if(bot) {
		Random random = new Random();
        
        
	    // Obtention d'un index aléatoire dans la liste
	    int indexAleatoire = random.nextInt(tas.getTasCartes().size());
	    // Obtention de la valeur correspondant à l'index aléatoire
	    Carte valeurAleatoire = tas.getTasCartes().get(indexAleatoire);
	    choixJoueur = valeurAleatoire.getNom();
	}
	else {
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
				System.out.println("(non implémenté) :Partie sauvegardée, à la prochaine");
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
