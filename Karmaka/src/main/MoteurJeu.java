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
	
	
	public static void generationSource(Lieu paquet) {
		// Cartes bleues
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Vol", Pouvoirs.Vol, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Vol", Pouvoirs.Vol, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Destinee", Pouvoirs.Destinee, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Destinee", Pouvoirs.Destinee, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Duperie", Pouvoirs.Duperie, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Duperie", Pouvoirs.Duperie, TypeCarte.BLEU, 3));
		
		// Vertes
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		
		// Rouges
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Vengeance", Pouvoirs.Vengeance, TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Vengeance", Pouvoirs.Vengeance, TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Roulette", Pouvoirs.Roulette, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Roulette", Pouvoirs.Roulette, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Roulette", Pouvoirs.Roulette, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Bassesse", Pouvoirs.Roulette, TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Bassesse", Pouvoirs.Roulette, TypeCarte.ROUGE, 3));
		
		// Mosaïque
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Mimetisme", Pouvoirs.Mimetisme, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Mimetisme", Pouvoirs.Mimetisme, TypeCarte.MOSAIQUE, 1));
	}
	
	
	public static void generationPiles(Joueur joueur, Lieu source) {
		// Génération des différentes piles pour un joueur donné au démarrage de la partie 
		
		// 4 cartes à mettre dans la main 
		for (int i = 0; i < 4; i++) {
			source.distribuerCarteLaPlusHaute(joueur);
		}
		
		// 2 cartes à mettre sur la pile
		source.deplacerCarte(joueur.getPileJoueur());
		source.deplacerCarte(joueur.getPileJoueur());
	}
	
	public static void jeu() {
		// Implémentation des tours de jeu tout au long de la partie
		;
	}
	
	public static void reincarnation() {
		// Vérification de la condition de réincarnation + réincarnation si besoin
		;
	}
	
	public static void victoire() {
		// Vérifie la condition de victoire
		;
	}
	
	public static void choixJoueur() {
		// Vérifie la condition de victoire
		;
	}
	

	
	

	public static void main(String[] args) {


		
		Lieu source = new Lieu();
		Lieu fosse = new Lieu();
		generationSource(source);
		source.melanger();
		
		
		Joueur joueur1 = new Joueur();
		Joueur joueur2 = new Joueur();
		
		// ask Joueur ou bot en face
		
		generationPiles(joueur1, source);
		generationPiles(joueur2, source);
		
		System.out.println(joueur1.getMainJoueur().toString());
		System.out.println(joueur1.getPileJoueur().toString());

		System.out.println(joueur2.getMainJoueur().toString());
		System.out.println(joueur2.getPileJoueur().toString());
		
		
	}
}
