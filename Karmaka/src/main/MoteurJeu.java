package main;

import cartes.*;

import java.util.List;
import java.util.Scanner;

import main.TypeCarte;

public class MoteurJeu {

	public static void generationSource(Lieu paquet) {
		
		// Cartes bleues
		
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Vol", Pouvoirs.Vol, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Vol", Pouvoirs.Vol, TypeCarte.BLEU, 3));
		
		paquet.addCarte(new Carte("Destinee", Pouvoirs.Destinee, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Duperie", Pouvoirs.Duperie, TypeCarte.BLEU, 3));
		
		// Vertes
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Lendemain", Pouvoirs.Lendemain, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));
		paquet.addCarte(new Carte("Recyclage", Pouvoirs.Recyclage, TypeCarte.VERT, 1));

		//
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		
		// Rouges
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		
		// paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Vengeance", Pouvoirs.Vengeance, TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Vengeance", Pouvoirs.Vengeance, TypeCarte.ROUGE, 3));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Panique", Pouvoirs.Panique, TypeCarte.ROUGE, 1));
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
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Mimetisme", Pouvoirs.Mimetisme, TypeCarte.MOSAIQUE, 1));
		
		///
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Roulette", Pouvoirs.Roulette, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Duperie", Pouvoirs.Duperie, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Destinee", Pouvoirs.Destinee, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));

		
		
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
	

	public static void reincarnation(Joueur joueur) {
		if(joueur.getMainJoueur().estVide() && joueur.getPileJoueur().estVide()) {
		    switch (joueur.getniveauKarmique()) {
		        case 0:
		            evoluerNiveauKarmique(joueur, 4);
		            break;
		        case 1:
		            evoluerNiveauKarmique(joueur, 5);
		            break;
		        case 2:
		            evoluerNiveauKarmique(joueur, 6);
		            break;
		        case 3:
		            evoluerNiveauKarmique(joueur, 7); // -> Transcendance
		            break;
		        default:
		            System.out.println("Erreur");
		            break;
		    }
		}
	}
	
	public static void evoluerNiveauKarmique(Joueur joueur, int seuilPoints) {
	    if (joueur.getOeuvresJoueur().sommeMaxParTypeCarte() >= seuilPoints) {
	        joueur.setniveauKarmique();
	    } 
	    else if(joueur.getOeuvresJoueur().sommeMaxParTypeCarte() + joueur.getanneauxKarmique() >= seuilPoints){
	        // demande choix utiliser anneaux karmiques
	        // implémenter renaissance(joueur) ici ou appeler la méthode si nécessaire
	    }
	    else {
	    	System.out.println("Vous n'avez pas gagné de niveau sur l'échelle karmique");
	    	joueur.setanneauxKarmique();
	    }

	    renaissance(joueur);
	}
	
	
	public static void renaissance(Joueur joueur) {
		// Reconstruction Main et Pile de jeu
		// si renaissance -> fin de tour
		// défausser oeuvres fosse
		// cartes vie futur -> main
		// si moins de 6 cartes Pile + Main : prendre source -> pile sans les voir pour 6 Pile + Main
		;
	}
	
	public static boolean victoire(Joueur[] joueurs) {
		// Appelée au début de chaque loop de jeu
		for (Joueur joueur : joueurs) {
			if(joueur.getniveauKarmique() == 4) {
				return true;
			}
		}
		return false;
	}

	
	public static void checkCoutKarmique(Joueur joueur, Lieu coutKarmique, Lieu fosse) {
		// if coutKarmique not empty
		// Proposer choix au joueur de vie futur ou fosse
		if(!coutKarmique.estVide()) {
			// proposer au joueur de prendre la carte dans sa vie future
			
			// if ...
			// coutKarmique.deplacerCarte(joueur.getVieFutureJoueur());
			
			// else
			// coutKarmique.deplacerCarte(fosse);
		}
		;
	}
	
	public static Joueur getAdversaire(Joueur joueur, Joueur[] joueurs) {
		// On peut implméenter le choix des adversaires si > 2 joueurs
		if(joueurs[0] == joueur) {
			return joueurs[1];
		}
		return joueurs[0];
	}
	
	
	public static void jouerCarte(Joueur[] joueurs, Joueur joueur, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner scanner) {
		//Scanner scannerJouer = new Scanner(System.in);
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

        
        switch (choix3) {
            case 1: // Pouvoir OK
            	Joueur adversaire = getAdversaire(joueur, joueurs);
            	joueur.getMainJoueur().getCarteParNom(name).appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, scanner);
                joueur.getMainJoueur().deplacerCarteParNom(name, coutKarmique);
                break;
                
            case 2: // Points OK
                joueur.getMainJoueur().deplacerCarteParNom(name, joueur.getOeuvresJoueur());
                System.out.println(joueur.getOeuvresJoueur()); // visible de tous
                System.out.println(joueur.getMainJoueur());
                break;
                
            case 3: // Futur OK
                joueur.getMainJoueur().deplacerCarteParNom(name, joueur.getVieFutureJoueur());
                break;
                
            default:
                System.out.println("Choix non valide");
                break;
        }
        
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		Lieu source = new Lieu();
		Lieu fosse = new Lieu();
		Lieu coutKarmique = new Lieu();

		generationSource(source);
		// source.melanger(); à décommenter après debug
		
		Joueur[] joueurs = new Joueur[2];
		
		
		joueurs[0] = new Joueur();
		joueurs[1] = new Joueur();
		
		source.deplacerCarte(joueurs[0].getVieFutureJoueur());
		source.deplacerCarte(joueurs[0].getVieFutureJoueur());
		source.deplacerCarte(joueurs[0].getVieFutureJoueur());
		source.deplacerCarte(joueurs[0].getVieFutureJoueur());
		source.deplacerCarte(fosse);
		source.deplacerCarte(fosse);
		source.deplacerCarte(fosse);
		source.deplacerCarte(fosse);
		
		// choix bot ou joueur
		System.out.println("Options : ");
		System.out.println("1 - 1V1 contre un joueur");
		System.out.println("2 - 1V1 contre un robot");
		System.out.println("3 - 1V1 entre 2 robots");
		System.out.print("Choix : ");
        int choix = scanner.nextInt();
        
        if(choix == 2) {
        	System.out.println("Vous allez jouez contre un robot");
        	joueurs[1].setBot();
        }
        else if (choix == 1) {
        	System.out.println("Vous allez jouez contre un joueur");
        	// rien à faire
        }
        else if (choix == 3) {
        	System.out.println("2 robots vont jouer l'un contre l'autre");
        	joueurs[0].setBot();
        	joueurs[1].setBot();
        }
        else {
        	System.out.println("ERREUR");
        	// gestion d'erreur à faire sur un while
        }
        String nomjoueur = scanner.nextLine();
        
        System.out.println("Nom des joueurs : ");
        System.out.print("Joueur 1 : ");
        nomjoueur = scanner.nextLine();
        joueurs[0].setNomJoueur(nomjoueur);
        System.out.print("Joueur 2 : ");
        nomjoueur = scanner.nextLine();
        joueurs[1].setNomJoueur(nomjoueur);
        
        
        
        
		
		generationPiles(joueurs[0], source);
		generationPiles(joueurs[1], source);
		
		// Fin d'initialisation
		
		while (!victoire(joueurs)) { // Code à exécuter tant que la condition de victoire est fausse
			
			
			for (Joueur joueur : joueurs) {
				System.out.println("Joueur suivant :");
				
				reincarnation(joueur);
				checkCoutKarmique(joueur, coutKarmique, fosse);
				
				if(!(joueur.getPileJoueur().estVide())) {
					// Si pile non vide 
					
					System.out.println("Options : ");
					System.out.println("1 - Piocher une carte");
					System.out.println("2 - Passer son tour");
					System.out.print("Choix : ");
			        int choix2 = scanner.nextInt();
			        
			        // check sur choix pour piocher / passer son tour
			        
			        if(choix2 == 2) {
			        	break; // Passe son tour
			        }
			        else if(choix2 == 1) { // Piocher carte
			        	joueur.getPileJoueur().distribuerCarteLaPlusHaute(joueur);
			        }
				}
			    
				jouerCarte(joueurs, joueur, source, fosse, coutKarmique, scanner);
			    		
			} // loop des joueurs
	    } // loop de jeu
		scanner.close();
		}


	
}


