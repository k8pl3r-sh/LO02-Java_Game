package main;
import java.util.*;

import cartes.Carte;


/**
 * La classe {@code Lieu} représente un lieu contenant un tas de cartes.
 */
public class Lieu {
	private LinkedList<Carte> tasCartes;
	
	/**
     * Constructeur pour créer une instance de la classe Lieu.
     * Initialise le tas de cartes comme une nouvelle liste chaînée.
     */
	public Lieu(){
		tasCartes = new LinkedList<Carte>(); 
	}
	
	/**
     * Retire la première carte du tas de cartes (la carte du dessus).
     *
     * @return La carte retirée du tas.
     */
	public Carte distribuerUneCarte(){ 
		Carte c;
		c = tasCartes.poll(); 
		return c;	
	}
		
	/**
     * Mélange toutes les cartes dans le lieu.
     */
	public void melanger(){
		Collections.shuffle(tasCartes);
	}
		
		
	/**
     * Vérifie si le tas de cartes est vide.
     *
     * @return true si le tas de cartes est vide, sinon false.
     */
	public boolean estVide() {
		return tasCartes.isEmpty(); 
	}
		
	/**
     * Renvoie une représentation textuelle des cartes présentes dans le lieu.
     *
     * @return Une chaîne de caractères représentant les cartes dans le lieu.
     */
	public String toString(){
		return "\nCarte présentent dans le lieu : \n"+tasCartes.toString();
	}
		
	 /**
     * Renvoie la liste chaînée de cartes dans le lieu.
     *
     * @return La liste chaînée de cartes dans le lieu.
     */
	public LinkedList<Carte> getTasCartes(){
		return tasCartes;
	}
	

    /**
     * Ajoute une carte au lieu.
     *
     * @param carte La carte à ajouter.
     */
	public void addCarte(Carte carte) {
		tasCartes.add(carte);
	}
	
	/**
	 * Distribue la carte la plus haute du lieu à un joueur.
	 * Vérifie d'abord si le lieu n'est pas vide, puis retire la dernière carte du lieu
	 * et l'ajoute à la main du joueur spécifié.
	 *
	 * @param joueur Le joueur auquel distribuer la carte.
	 */
	public void distribuerCarteLaPlusHaute(Joueur joueur) {
	    if (!estVide()) {
	        Carte carteLaPlusHaute = tasCartes.peekLast();


	        tasCartes.removeLast();
	        joueur.getMainJoueur().addCarte(carteLaPlusHaute);
	    }
	}
	
	/**
	 * Renvoie la carte la plus haute du lieu sans la retirer.
	 *
	 * @return La carte la plus haute du lieu, ou null si le lieu est vide.
	 */
	public Carte retourneCarteLaPlusHaute() {
	    if (!estVide()) {

	        Carte carteLaPlusHaute = tasCartes.peekLast();
	        return carteLaPlusHaute;
	    }
	    return null;
	}
	
	
	/**
	 * Déplace la carte la plus haute du lieu vers un autre lieu cible.
	 * Vérifie d'abord si le lieu actuel n'est pas vide, puis retire la dernière carte du lieu
	 * et l'ajoute au lieu cible spécifié.
	 *
	 * @param lieuCible Le lieu vers lequel déplacer la carte.
	 */
	public void deplacerCarte(Lieu lieuCible) {
		if (!estVide()) {
	        Carte carteLaPlusHaute = tasCartes.peekLast();

	        tasCartes.removeLast();
	        lieuCible.addCarte(carteLaPlusHaute);
	    }
		
	}
	
	/**
	 * Retire la carte spécifiée du lieu.
	 *
	 * @param carte La carte à retirer du lieu.
	 */
	public void retireCarte(Carte carte) {
		tasCartes.remove(carte);
    }
	
	/**
	 * Déplace la carte du lieu vers un autre lieu cible en spécifiant le nom de la carte.
	 * Recherche la carte par son nom, la retire du lieu actuel et l'ajoute au lieu cible.
	 * Lance une exception si la carte n'est pas trouvée.
	 *
	 * @param nomCarte    Le nom de la carte à déplacer.
	 * @param destination  Le lieu vers lequel déplacer la carte.
	 * @throws IllegalStateException Si la carte spécifiée n'est pas trouvée.
	 */
	public void deplacerCarteParNom(String nomCarte, Lieu destination) {
	    Carte carteADeplacer = null;

	    for (Carte carte : tasCartes) {
	        if (carte.getNom().equalsIgnoreCase(nomCarte)) {
	            carteADeplacer = carte;
	            break;
	        }
	    }

	    if (carteADeplacer != null) {
	        this.retireCarte(carteADeplacer);
	        destination.addCarte(carteADeplacer);
	    } else {
	        throw new IllegalStateException("Carte non trouvée : " + nomCarte);
	    }
	}
	
	/**
	 * Renvoie la carte du lieu ayant le nom spécifié.
	 *
	 * @param nomCarte Le nom de la carte à rechercher.
	 * @return La carte ayant le nom spécifié, ou null si aucune carte n'est trouvée.
	 */
	public Carte getCarteParNom(String nomCarte) {
        for (Carte carte : tasCartes) {
            if (carte.getNom().equalsIgnoreCase(nomCarte)) {
                return carte;
            }
        }
        return null;
    }
	
	/**
	 * Calcule la somme maximale des points par type de carte dans le lieu.
	 * Les points de la carte MOSAIQUE sont ajoutés à chaque type de carte.
	 *
	 * @return La somme maximale des points par type de carte + les points accumulés par MOSAIQUE.
	 */
	public int sommeMaxParTypeCarte() {
        Map<TypeCarte, Integer> sommeParType = new HashMap<>();
        int sommeMosaique = 0;

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

        int sommeMax = sommeParType.values().stream().max(Integer::compareTo).orElse(0);
        return sommeMax;
    }
	
}
