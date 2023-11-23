package test_projet_LO02;

import cartes.Carte;

public class MoteurJeu {
	

	// methode miseEnPlacePartie
	// while (checkVictoire != True)
		// methode tourDeJeu
			// methode reincarnation 
			// methode choixJoueur
			// applique la bonne méthode en fonction du choix
	

	public static void main(String[] args) {
		
		// Essais d'ajouts de carte dans une pile fosse
		Carte carte1 = new Carte("carte1", "fait jsp quoi", "bleu", 3);
		Carte carte2 = new Carte("carte2", "fait jsp quoi", "bleu", 3);
		Carte carte3 = new Carte("carte3", "fait jsp quoi", "bleu", 3);
		Carte carte4 = new Carte("carte4", "fait jsp quoi", "bleu", 3);
		Lieu fosse1 = new Lieu();
		fosse1.addCarte(carte1);
		fosse1.addCarte(carte2);
		fosse1.addCarte(carte3);
		fosse1.addCarte(carte4);
		fosse1.melanger();
		System.out.println(fosse1.toString());
		
		// Essais de pioche dans une pile source
		Joueur joueur1 = new Joueur();
		fosse1.distribuerCarteLaPlusHaute(joueur1);
		System.out.println(joueur1.getMainJoueur().toString());
		System.out.println(fosse1.toString());
		
		// Schema du programme
		// 1. Instanciation des joueurs, des cartes, Fosse et source
		// 2. While (check victoire)
		
	}
}
