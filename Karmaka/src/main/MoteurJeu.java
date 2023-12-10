package main;

import cartes.*;
import java.util.Scanner;

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
	
	
	public static void reincarnation() {
		// Vérification de la condition de réincarnation + réincarnation si besoin
		// implémentation renaissance
		;
	}
	
	public static boolean victoire() {
		// Vérifie la condition de victoire
		return false;
	}
	
	public static void choixJoueur() {
		// Choix à chaque tour
		;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Lieu source = new Lieu();
		Lieu fosse = new Lieu();
		Lieu coutKarmique = new Lieu();

		generationSource(source);
		source.melanger();
		
		Joueur[] joueurs = new Joueur[2];
		
		
		joueurs[0] = new Joueur();
		joueurs[1] = new Joueur();
		
		// choix bot ou joueur
		System.out.println("Options : ");
		System.out.println("1 - 1V1 contre un joueur");
		System.out.println("2 - 1V1 contre un robot");
		System.out.print("Choix : ");
        int choix = scanner.nextInt();
        
        if(choix == 2) {
        	System.out.println("Vous allez jouez contre un robot");
        	// todo
        }
        else if (choix == 1) {
        	System.out.println("Vous allez jouez contre un joueur");
        	//todo
        }
        else {
        	System.out.println("ERREUR");
        	// gestion d'erreur à faire sur un while
        }
        
		
		
		generationPiles(joueurs[0], source);
		generationPiles(joueurs[1], source);
		
		// Fin d'initialisation
		
		while (!victoire()) {
		    // Code à exécuter tant que la condition de victoire est fausse
		    // Cette partie du code sera répétée tant que la condition est vraie
			
			
			// boucle for element in joueurs:
			
			// Joueur 1 :
			// reincarnation() 
			// pioche carte pile -> main (ou s'abstient et passe son tour, si pile vide passer étape suiv)
			
			// Joueur une carte de la main : 
				// points : main -> oeuvre
				// pouvoir : annoncer effet -> donner à l'adversaire
				// futur : main -> vie future
			
			// Cout Karmique :
			// affichage carte tas temporaire -> la défausser OU la placer sur la vie future
			
			
			for (Joueur joueur : joueurs) {
	            // System.out.println("Nom : " + joueur.getNom());
				System.out.println("Joueur suivant :");
				
				if(!(joueur.getPileJoueur().estVide())) {
					// Pile non vide
					
					// Check passer son tour
					System.out.println("Options : ");
					System.out.println("1 - Piocher une carte");
					System.out.println("2 - Passer son tour");
					System.out.print("Choix : ");
			        int choix2 = scanner.nextInt();
			        
			        // check sur choix pour piocher / passer son tour
			        
			        if(choix2 == 2) {
			        	// terminer la boucle du tour
			        	break;
			        }
				}
			    
				// Si pile joueur vide ou choix de piocher
				source.distribuerCarteLaPlusHaute(joueur);
			    System.out.println(joueur.getMainJoueur());
			        	
	        	System.out.println("Options : ");
				System.out.println("1 - Jouer une carte pour son pouvoir");
				System.out.println("2 - Joueur une carte pour ses points");
				System.out.println("3 - Joueur une carte pour son futur");
				System.out.print("Choix : ");
		        int choix3 = scanner.nextInt();
		        scanner.nextLine(); // Ajouter cette ligne pour consommer le reste de la ligne
		        
		        //check input
		        
				System.out.println("Quel est le nom de la carte à jouer ?");
		        String name = scanner.nextLine();
		       
		        // Gestion des erreurs à faire : à faire dans lieu pour déplacer carte
		        
				Carte carteTrouvee = null;
				for (Carte carte : joueur.getMainJoueur().getTasCartes()) {
				    if (carte.getNom().equalsIgnoreCase(name)) {
				        carteTrouvee = carte;
				        break; // Sortir de la boucle une fois que la carte est trouvée
				    }
				}
				
				if (carteTrouvee == null) { // existence carte
					System.out.println("Carte non trouvée.");
				}
		        
		        switch (choix3) {
		            case 1: // Pouvoir
		                carteTrouvee.appliquerPouvoir(); // à changer pour faire les vérifications dans lieu
		                // puis donner la carte à la pile temporaire
		                //joueur.getMainJoueur().getTasCartes().deplacerCarteParNom(name, coutKarmique);
		                
		                break;
		            case 2: // Points
		                System.out.println("Jouer une carte pour ses points");
		                break;
		                
		            case 3: // Futur
		                System.out.println("Jouer une carte pour son futur");
		                break;
		                
		            default:
		                System.out.println("Choix non valide");
		                break;
		        }
		        
				     
			        
					
				}
	        }
		scanner.close();
		}
}


