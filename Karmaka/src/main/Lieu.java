package main;
import java.util.*;

import cartes.Carte;

public class Lieu {
	private LinkedList<Carte> tasCartes;
	
	public Lieu(){
		// instancie le jeu de cartes 
		tasCartes = new LinkedList<Carte>(); 
	}
	
	// retire la première carte du tas de cartes (la carte du dessus)
	public Carte distribuerUneCarte(){ 
		Carte c;
		c = tasCartes.poll(); 
		return c;	
	}
		
	// Mélange de toutes les cartes
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
	
	public Carte retourneCarteLaPlusHaute() {
	    if (!estVide()) {
	        // Obtient la dernière carte du lieu actuel
	        Carte carteLaPlusHaute = tasCartes.peekLast(); // Utilisation de peekLast() pour obtenir la dernière carte sans la retirer
	        return carteLaPlusHaute;
	    }
	    return null;
	}
	
	
	// on précise le joueur avec joueur.getPileJoueur()
	public void deplacerCarte(Lieu lieuCible) { // méthode mieux que peek pour prendre et retirer ?
		if (!estVide()) {
	        // Obtient la dernière carte du lieu actuel
	        Carte carteLaPlusHaute = tasCartes.peekLast(); // Utilisation de peekLast() pour obtenir la dernière carte sans la retirer

	        // Retire la carte du lieu actuel et l'ajoute à la main du joueur
	        tasCartes.removeLast(); // Retire la dernière carte du tas
	        lieuCible.addCarte(carteLaPlusHaute); // Ajoute la carte de la main aux Oeuvres du joueur
	    }
		
	}
	
	public void removeCarte(Carte carte) {
		tasCartes.remove(carte);
    }
	
	public void deplacerCarteParNom(String nomCarte, Lieu destination) {
	    Carte carteADeplacer = null;

	    for (Carte carte : tasCartes) {
	        if (carte.getNom().equalsIgnoreCase(nomCarte)) {
	            carteADeplacer = carte;
	            break;
	        }
	    }

	    if (carteADeplacer != null) {
	        this.removeCarte(carteADeplacer); // Retire la carte du lieu actuel
	        destination.addCarte(carteADeplacer); // Ajoute la carte à la destination
	    } else {
	        throw new IllegalStateException("Carte non trouvée : " + nomCarte);
	    }
	}
	
	public Carte getCarteParNom(String nomCarte) {
        for (Carte carte : tasCartes) {
            if (carte.getNom().equalsIgnoreCase(nomCarte)) {
                return carte; // Renvoie la carte si le nom correspond
            }
        }
        return null; // Renvoie null si aucune carte avec ce nom n'est trouvée
    }
	
	public int sommeMaxParTypeCarte() {
        Map<TypeCarte, Integer> sommeParType = new HashMap<>();
        int sommeMosaique = 0;

        // Calcul de la somme des points par type de carte (à l'exception de MOSAIQUE)
        for (Carte carte : tasCartes) {
            TypeCarte type = carte.getType();
            int points = carte.getPoint();

            if (type != TypeCarte.MOSAIQUE) {
                sommeParType.put(type, Math.max(sommeParType.getOrDefault(type, 0), points));
            } else {
                sommeMosaique += points;
            }
        }

        // Ajout des points MOSAIQUE à chaque type de carte
        for (TypeCarte type : sommeParType.keySet()) {
            sommeParType.put(type, sommeParType.get(type) + sommeMosaique);
        }

        // Trouver la somme maximale par type de carte
        int sommeMax = sommeParType.values().stream().max(Integer::compareTo).orElse(0);
        return sommeMax;
    }
	
}
