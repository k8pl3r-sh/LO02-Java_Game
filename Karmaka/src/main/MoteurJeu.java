package main;

import cartes.*;
import main.TypeCarte;

public class MoteurJeu {
	

	// methode miseEnPlacePartie
	// while (checkVictoire != True)
		// methode tourDeJeu
			// methode reincarnation 
			// methode choixJoueur
			// applique la bonne méthode en fonction du choix
	public static void generation_source(Lieu paquet) {
		// Cartes bleues
		paquet.addCarte(new Carte("Transmigration", "pouvoirTransmigration", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Transmigration", "pouvoirTransmigration", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Transmigration", "pouvoirTransmigration", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", "pouvoirCoupdOeil", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", "pouvoirCoupdOeil", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", "pouvoirCoupdOeil", TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("RevesBrises", "pouvoirRevesBrises", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", "pouvoirRevesBrises", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", "pouvoirRevesBrises", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", "pouvoirDeni", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", "pouvoirDeni", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", "pouvoirDeni", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Vol", "pouvoirVol", TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Vol", "pouvoirVol", TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Destinee", "pouvoirDestinee", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Destinee", "pouvoirDestinee", TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Duperie", "pouvoirDuperie", TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Duperie", "pouvoirDuperie", TypeCarte.BLEU, 3));
		
		// Vertes
		paquet.addCarte(new Carte("Lendemain", "pouvoirLendemain", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", "pouvoirLendemain", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", "pouvoirLendemain", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Sauvetage", "pouvoirSauvetage", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Sauvetage", "pouvoirSauvetage", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Sauvetage", "pouvoirSauvetage", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", "pouvoirLongevite", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", "pouvoirLongevite", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", "pouvoirLongevite", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Recyclage", "pouvoirRecyclage", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", "pouvoirRecyclage", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", "pouvoirRecyclage", TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Semis", "pouvoirSemis", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", "pouvoirSemis", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", "pouvoirSemis", TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Voyage", "pouvoirVoyage", TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Voyage", "pouvoirVoyage", TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", "pouvoirJubile", TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", "pouvoirJubile", TypeCarte.VERT, 3));
		
		// Rouges
		paquet.addCarte(new Carte("DernierSouffle", "pouvoirDernierSouffle", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", "pouvoirDernierSouffle", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", "pouvoirDernierSouffle", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Crise", "pouvoirDernierCrise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Crise", "pouvoirDernierCrise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Crise", "pouvoirDernierCrise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", "pouvoirFournaise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", "pouvoirFournaise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", "pouvoirFournaise", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Vengeance", "pouvoirVengeance", TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Vengeance", "pouvoirVengeance", TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Panique", "pouvoirPanique", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", "pouvoirPanique", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", "pouvoirPanique", TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Roulette", "pouvoirRoulette", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Roulette", "pouvoirRoulette", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Roulette", "pouvoirRoulette", TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Bassesse", "pouvoirBassesse", TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Bassesse", "pouvoirBassesse", TypeCarte.ROUGE, 3));
		
		// Mosaïque
		paquet.addCarte(new Carte("Incarnation", "pouvoirIncarnation", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", "pouvoirIncarnation", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", "pouvoirIncarnation", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", "pouvoirIncarnation", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", "pouvoirIncarnation", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Mimetisme", "pouvoirMimetisme", TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Mimetisme", "pouvoirMimetisme", TypeCarte.MOSAIQUE, 1));
	}
	
	
	public static void generation_piles(Joueur joueur) {
		// Génération des différentes piles pour un joueur donné au démarrage de la partie 
		;
	}
	

	public static void main(String[] args) {
		
		Lieu source = new Lieu();
		generation_source(source);
		source.melanger();
		
		// ask nombre de joueur (1 ou 2) pour création ou nom d'un bot + stratégie
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		source.distribuerCarteLaPlusHaute(joueur1);
		System.out.println(joueur1.getMainJoueur().toString());
		System.out.println(source.toString());
		
		
		
		
		/*
		Incarnation carte1 = new Incarnation();
		Vol carte2 = new Vol();
		Vol carte3 = new Vol();
		//Vol carte4 = new Vol();

		Lieu fosse1 = new Lieu();
		fosse1.addCarte(carte1);
		fosse1.addCarte(carte2);
		fosse1.addCarte(carte3);
		fosse1.addCarte(new Carte("Jubile", "pouvoirJubile", TypeCarte.BLEU, 3));
		//fosse1.addCarte(carte4);
		fosse1.melanger();
		System.out.println(fosse1.toString());
		
		// Essais de pioche dans une pile source
		Joueur joueur1 = new Joueur();
		fosse1.distribuerCarteLaPlusHaute(joueur1);
		System.out.println(joueur1.getMainJoueur().toString());
		System.out.println(fosse1.toString());
		*/
		
		// Schema du programme
		// 1. Instanciation des joueurs, des cartes, Fosse et source
		// 2. While (check victoire)
		
	}
}
