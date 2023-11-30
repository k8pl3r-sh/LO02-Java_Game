package test_projet_LO02;

import cartes.*;


public class MoteurJeu {
	

	// methode miseEnPlacePartie
	// while (checkVictoire != True)
		// methode tourDeJeu
			// methode reincarnation 
			// methode choixJoueur
			// applique la bonne méthode en fonction du choix
	

	public static void main(String[] args) {
		
		// Essais d'ajouts de carte dans une pile fosse
		Incarnation carte1 = new Incarnation();
		Vol carte2 = new Vol();
		Vol carte3 = new Vol();
		Vol carte4 = new Vol();
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
