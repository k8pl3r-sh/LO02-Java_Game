package main;
import java.util.*;

import cartes.Carte;

public class Lieu {
	private LinkedList<Carte> tasCartes;
	
	public Lieu(){
		// instancie le jeu de cartes 
		tasCartes = new LinkedList<Carte>(); 
	}
	
	// retire la premiére carte du tas de cartes (la carte du dessus)
	public Carte distribuerUneCarte(){ 
		Carte c;
		// on retire la carte du dessus du tas de cartes
		c = tasCartes.poll(); 
		return c;	
	}
		
	// Mélange de toutes les cartes. Très simple ....Appel de shuffle de la classe Collections (à différencier de l'interface Collection)
	public void melanger(){
		Collections.shuffle(tasCartes);
	}
		
		
	// le tas de cartes est-il vide?
	public boolean estVide() {
		// le tas cartes est vide ?
		return tasCartes.isEmpty(); 
	}
		
	public String toString(){
		return "\nCarte présentent dans le lieu : \n"+tasCartes.toString();
	}
		
	public LinkedList<Carte> getTasCartes(){
		return tasCartes;
	}
	
	public void addCarte(Carte carte) {
		tasCartes.add(carte);
	}
	
	public void distribuerCarteLaPlusHaute(Joueur joueur) {
	    // Vérifie si le lieu actuel n'est pas vide
	    if (!estVide()) {
	        // Obtient la dernière carte du lieu actuel
	        Carte carteLaPlusHaute = tasCartes.peekLast(); // Utilisation de peekLast() pour obtenir la dernière carte sans la retirer

	        // Retire la carte du lieu actuel et l'ajoute à la main du joueur
	        tasCartes.removeLast(); // Retire la dernière carte du tas
	        joueur.getMainJoueur().addCarte(carteLaPlusHaute); // Ajoute la carte à la main du joueur
	    }
	}
	/*
	public void deplacerCarte(Lieu lieuCible, Joueur joueur) {
		if (!estVide()) {
	        // Obtient la dernière carte du lieu actuel
	        Carte carteLaPlusHaute = tasCartes.peekLast(); // Utilisation de peekLast() pour obtenir la dernière carte sans la retirer

	        // Retire la carte du lieu actuel et l'ajoute à la main du joueur
	        tasCartes.removeLast(); // Retire la dernière carte du tas
	        joueur.getOeuvresJoueur().addCarte(carteLaPlusHaute); // Ajoute la carte de la main aux Oeuvres du joueur
	    }
		
	}*/
	// on précise le joueur avec joueur.getPileJoueur()
	public void deplacerCarte(Lieu lieuCible) {
		if (!estVide()) {
	        // Obtient la dernière carte du lieu actuel
	        Carte carteLaPlusHaute = tasCartes.peekLast(); // Utilisation de peekLast() pour obtenir la dernière carte sans la retirer

	        // Retire la carte du lieu actuel et l'ajoute à la main du joueur
	        tasCartes.removeLast(); // Retire la dernière carte du tas
	        lieuCible.addCarte(carteLaPlusHaute); // Ajoute la carte de la main aux Oeuvres du joueur
	    }
		
	}
	
	public boolean removeCarte(Carte carte) { // à tester
	    Iterator<Carte> iterator = tasCartes.iterator();
	    while (iterator.hasNext()) {
	        Carte carteDansLeLieu = iterator.next();
	        if (carteDansLeLieu.equals(carte)) {
	            iterator.remove(); // Retire la carte du lieu
	            return true; // Carte retirée avec succès
	        }
	    }
	    return false; // La carte n'a pas été trouvée dans ce lieu
	}
	
	// Méthode deplacerCarteParNom(String NomCarte, Lieu destination) à faire

}
