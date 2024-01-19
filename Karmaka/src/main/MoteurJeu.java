package main;

import cartes.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;
import java.util.Scanner;

import main.TypeCarte;

/**
 * Classe MoteurJeu définit la manière dont le jeu doit s'initialiser et fonctionner
 */
public class MoteurJeu {

	/**
	 * Génère les cartes de la source (paquet) au début du jeu.
	 * @param paquet Lieu représentant la source de cartes.
	 */
	public static void generationSource(Lieu paquet) {
		
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
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
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
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Incarnation", Pouvoirs.Incarnation, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Mimetisme", Pouvoirs.Mimetisme, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Sauvetage", Pouvoirs.Sauvetage, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Longevite", Pouvoirs.Longevite, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Mimetisme", Pouvoirs.Mimetisme, TypeCarte.MOSAIQUE, 1));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("DernierSouffle", Pouvoirs.DernierSouffle, TypeCarte.ROUGE, 1));
		paquet.addCarte(new Carte("Fournaise", Pouvoirs.Fournaise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("CoupdOeil", Pouvoirs.CoupdOeil, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Duperie", Pouvoirs.Duperie, TypeCarte.BLEU, 3));
		paquet.addCarte(new Carte("Jubile", Pouvoirs.Jubile, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Semis", Pouvoirs.Semis, TypeCarte.VERT, 2));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Deni", Pouvoirs.Deni, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("Voyage", Pouvoirs.Voyage, TypeCarte.VERT, 3));
		paquet.addCarte(new Carte("Roulette", Pouvoirs.Roulette, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Crise", Pouvoirs.Crise, TypeCarte.ROUGE, 2));
		paquet.addCarte(new Carte("Transmigration", Pouvoirs.Transmigration, TypeCarte.BLEU, 1));
		paquet.addCarte(new Carte("Destinee", Pouvoirs.Destinee, TypeCarte.BLEU, 2));
		paquet.addCarte(new Carte("RevesBrises", Pouvoirs.RevesBrises, TypeCarte.BLEU, 2));

	}
	
	/**
	 * Génère les piles du joueur au début du jeu.
	 * @param joueur Joueur pour lequel générer les piles.
	 * @param source Lieu représentant la source de cartes.
	 */
	public static void generationPiles(Joueur joueur, Lieu source) {
		
		// 4 cartes à mettre dans la main 
		for (int i = 0; i < 4; i++) {
			source.distribuerCarteLaPlusHaute(joueur);
		}
		
		// 2 cartes à mettre sur la pile
		source.deplacerCarte(joueur.getPileJoueur());
		source.deplacerCarte(joueur.getPileJoueur());
	}
	

	/**
	 * Effectue le processus de réincarnation du joueur.
	 * @param joueur Joueur concerné par la réincarnation.
	 * @param fosse Lieu représentant la fosse de cartes.
	 * @param source Lieu représentant la source de cartes.
	 */
	public static void reincarnation(Joueur joueur, Lieu fosse, Lieu source) {
		if(joueur.getMainJoueur().estVide() && joueur.getPileJoueur().estVide()) {
		    switch (joueur.getniveauKarmique()) {
		        case 0:
		            evoluerNiveauKarmique(joueur, 4, fosse, source);
		            break;
		        case 1:
		            evoluerNiveauKarmique(joueur, 5, fosse, source);
		            break;
		        case 2:
		            evoluerNiveauKarmique(joueur, 6, fosse, source);
		            break;
		        case 3:
		            evoluerNiveauKarmique(joueur, 7, fosse, source); // Transcendance
		            break;
		        default:
		            System.out.println("Erreur");
		            break;
		    }
		}
	}
	
	/**
	 * Évolue le niveau karmique du joueur en fonction du seuil de points à atteindre.
	 * @param joueur Joueur dont le niveau karmique doit évoluer.
	 * @param seuilPoints Seuil de points à atteindre pour évoluer.
	 * @param fosse Lieu représentant la fosse.
	 * @param source Lieu représentant la source.
	 */
	public static void evoluerNiveauKarmique(Joueur joueur, int seuilPoints, Lieu fosse, Lieu source) {
	    if (joueur.getOeuvresJoueur().sommeMaxParTypeCarte() >= seuilPoints) {
	        joueur.setniveauKarmique();
	    } 
	    else if(joueur.getOeuvresJoueur().sommeMaxParTypeCarte() + joueur.getanneauxKarmique() >= seuilPoints){
	    	int utilise = seuilPoints - joueur.getOeuvresJoueur().sommeMaxParTypeCarte();
	    	joueur.setanneauxKarmique(utilise);
	        
	    }
	    else {
	    	System.out.println("Vous n'avez pas gagné de niveau sur l'échelle karmique");
	    	joueur.setanneauxKarmique();
	    }

	    renaissance(joueur, fosse, source);
	}
	
	/**
	 * Effectue le processus de renaissance du joueur.
	 * @param joueur Joueur concerné par la renaissance.
	 * @param fosse Lieu représentant la fosse de cartes.
	 * @param source Lieu représentant la source de cartes.
	 */
	public static void renaissance(Joueur joueur, Lieu fosse, Lieu source) {
		while (!joueur.getOeuvresJoueur().estVide()) {
			joueur.getOeuvresJoueur().deplacerCarte(fosse);
	    }
		
		int i = 0;
		while (!joueur.getVieFutureJoueur().estVide()) {
			if(i> 4) {
				joueur.getVieFutureJoueur().deplacerCarte(joueur.getPileJoueur());
			}
			else {
				joueur.getVieFutureJoueur().deplacerCarte(joueur.getMainJoueur());
			}
			i += 1;
		}
		while(i<6) {
			source.distribuerCarteLaPlusHaute(joueur);
			i+= 1;
		}
	}
	
	/**
 * Vérifie si l'un des joueurs a atteint le niveau karmique maximum (4).
 * @param joueurs Tableau des joueurs à vérifier.
 * @return true si l'un des joueurs a gagné, false sinon.
 */
	public static boolean victoire(Joueur[] joueurs) {
		for (Joueur joueur : joueurs) {
			if(joueur.getniveauKarmique() == 4) {
				return true;
			}
		}
		return false;
	}
	
	/**
	 * Récupère le nom du joueur victorieux, s'il y en a un. Cette fonction n'est appelée que lorsque une condition de victoire est remplie.
	 * @param joueurs Tableau des joueurs à vérifier.
	 * @return Le nom du joueur victorieux (sinon une chaîne de caractères par défaut).
	 */
	public static String getJoueurVictorieux(Joueur[] joueurs) {
		for (Joueur joueur : joueurs) {
			if(joueur.getniveauKarmique() == 4) {
				return joueur.getNomJoueur();
			}
		}
		return "Pour faire plaisir au compilateur";
	}

	/**
	 * Vérifie et gère le cas où le lieu de coût karmique n'est pas vide.
	 * Propose au joueur de récupérer la carte dans sa vie future ou dans la fosse.
	 * @param joueur Joueur actuel.
	 * @param coutKarmique Lieu représentant le coût karmique.
	 * @param fosse Lieu représentant la fosse de cartes.
	 * @param scanner Scanner pour la saisie utilisateur.
	 */
	public static void checkCoutKarmique(Joueur joueur, Lieu coutKarmique, Lieu fosse, Scanner scanner) {

		if(!coutKarmique.estVide()) {
			int choix = 1;
			Carte cK = coutKarmique.retourneCarteLaPlusHaute();
			System.out.println("Tu as cette carte que tu peux récupérer : " + cK.getNom());
			System.out.println("1 - Je la veux pour ma vie future");
			System.out.println("2 - Je ne la veux pas");
			System.out.println("Ton choix :");
			if (joueur.isBot()) {
				Random random = new Random();   				        
			    int nombreAleatoire = random.nextInt(2) + 1;
			    choix = nombreAleatoire;
			} else {
				
				List<Integer> listeEntiers = List.of(1, 2);
				choix = joueur.choix(scanner, listeEntiers);
			}
			
			if(choix == 1) {
				coutKarmique.deplacerCarte(joueur.getVieFutureJoueur());
				System.out.println("Tu as choisis de placer la carte dans ta vie Future");
			}
			else { // choix == 2
				coutKarmique.deplacerCarte(fosse);
				System.out.println("Tu as choisis de ne pas placer la carte dans ta vie Future");
			}
		}
	}
	
	/**
	 * Obtient l'adversaire du joueur parmi les joueurs spécifiés (2 joueurs par défaut).
	 * @param joueur Joueur actuel.
	 * @param joueurs Tableau des joueurs.
	 * @return L'adversaire du joueur.
	 */
	public static Joueur getAdversaire(Joueur joueur, Joueur[] joueurs) {
		if(joueurs[0] == joueur) {
			return joueurs[1];
		}
		return joueurs[0];
	}
	
	
	/**
 * Permet au joueur de jouer une carte de sa main.
 * @param joueurs Tableau des joueurs.
 * @param joueur Joueur actuel.
 * @param source Lieu source de cartes.
 * @param fosse Lieu de défausse.
 * @param coutKarmique Lieu représentant le coût karmique.
 * @param scanner Scanner pour la saisie utilisateur.
 */
	public static void jouerCarte(Joueur[] joueurs, Joueur joueur, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner scanner) {
		System.out.println("Voici votre main :");;
		System.out.println(joueur.getMainJoueur());
    	int choice = 1;
    	String name = null;
		if(joueur.isBot()) {
			Random random = new Random();   				        
		    int nombreAleatoire = random.nextInt(3) + 1;
		    choice = nombreAleatoire;
			name = joueur.getMainJoueur().getTasCartes().getLast().getNom();
		} else {
			System.out.println("Options : ");
			System.out.println("1 - Jouer une carte pour son pouvoir");
			System.out.println("2 - Joueur une carte pour ses points");
			System.out.println("3 - Joueur une carte pour son futur");
			System.out.print("Choix : ");
			List<Integer> listeEntiers = List.of(1, 2, 3);
	        choice = joueur.choix(scanner, listeEntiers);
	        
			System.out.println("Quel est le nom de la carte à jouer ?");
	        name = joueur.choix(scanner, joueur.getMainJoueur());
		}
        
        switch (choice) {
            case 1:
            	System.out.println("Vous avez choisi de jouer une carte pour son pouvoir");
            	Joueur adversaire = getAdversaire(joueur, joueurs);
            	joueur.getMainJoueur().deplacerCarteParNom(name, coutKarmique);
            	coutKarmique.getCarteParNom(name).appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, scanner);
                break;
                
            case 2:
            	System.out.println("Vous avez choisi de jouer une carte pour ses points");
                joueur.getMainJoueur().deplacerCarteParNom(name, joueur.getOeuvresJoueur());
                System.out.println(joueur.getOeuvresJoueur()); // visible de tous
                System.out.println(joueur.getMainJoueur());
                break;
                
            case 3:
            	System.out.println("Vous avez choisi de jouer une carte pour la mettre dans votre Vie Future");
                joueur.getMainJoueur().deplacerCarteParNom(name, joueur.getVieFutureJoueur());
                break;
                
            default:
                System.out.println("Choix non valide");
                break;
        }
        
	}
	
	/**
	 * Effectue les étapes d'initialisation du jeu.
	 * @return Une liste d'objets contenant le scanner, la fosse, la source, le lieu de coût karmique et les joueurs.
	 */
	public static List<Object> initialisation() {
		List<Object> objets = new ArrayList<>();
		
		Scanner scanner = new Scanner(System.in);
		
		Lieu source = new Lieu();
		Lieu fosse = new Lieu();
		Lieu coutKarmique = new Lieu();

		generationSource(source);
		source.melanger();
		
		Joueur[] joueurs = new Joueur[2];
		
		
		joueurs[0] = new Joueur();
		joueurs[1] = new Joueur();
		
		// Lancement du jeu
		System.out.println("#----------------------#");
		System.out.println("Bienvenue dans Karmaka");
		System.out.println("#----------------------#");
		
		// choix bot ou joueur
		System.out.println("Choisissez un mode de jeu : ");
		System.out.println("1 - 1V1 contre un joueur");
		System.out.println("2 - 1V1 contre un robot");
		System.out.println("3 - 1V1 entre 2 robots");
		System.out.print("Choix : ");
		List<Integer> liste3Entiers = List.of(1, 2);
        int choix = joueurs[0].choix(scanner, liste3Entiers);
        
        if(choix == 2) {
        	System.out.println("Vous allez jouez contre un robot");
        	joueurs[1].setBot();
        }
        else if (choix == 1) {
        	System.out.println("Vous allez jouez contre un joueur");
        }
        else {
        	System.out.println("2 robots vont jouer l'un contre l'autre");
        	joueurs[0].setBot();
        	joueurs[1].setBot();
        }
        
        String nomjoueur;
        
        System.out.println("Nom des joueurs : ");
        System.out.print("Joueur 1 : ");
        nomjoueur = scanner.nextLine();
        joueurs[0].setNomJoueur(nomjoueur);
        System.out.print("Joueur 2 : ");
        nomjoueur = scanner.nextLine();
        joueurs[1].setNomJoueur(nomjoueur);
        
        System.out.println("Rappel (non implémenté) : tapez 'exit' au lieu d'une carte pour quitter");
        System.out.println("Rappel (non implémenté) : tapez 'save' au lieu d'une carte pour sauvegarder");
        
        
        
        
		
		generationPiles(joueurs[0], source);
		generationPiles(joueurs[1], source);
		
		objets.add(scanner);
		objets.add(fosse);
		objets.add(source);
		objets.add(coutKarmique);
		objets.add(joueurs);
		return objets;
	}

	/**
	 * Méthode permettant de faire fonctionner le jeu
	 */
	public static void main(String[] args) {
		
		System.out.println("#---------------------------------#");
		System.out.println("Bienvenue dans le jeu Karmaka");
		System.out.println("#---------------------------------#");
		System.out.println("Options : ");
		System.out.println("1 - Nouvelle Partie");
		System.out.println("2 - Charger Partie");
		System.out.print("Choix : ");
		Scanner scanner_temp = new Scanner(System.in);
		int choix = scanner_temp.nextInt();
		
		if(choix == 2) { // Si sérialisation
			System.out.print("Cette option n'est pas implémentée");
		}
		
		
		List<Object> listeObjects = new ArrayList<>();
		listeObjects = initialisation();
		Scanner scanner = (Scanner) listeObjects.get(0);
		
		Lieu source = (Lieu) listeObjects.get(1);
		Lieu fosse = (Lieu) listeObjects.get(2);
		Lieu coutKarmique = (Lieu) listeObjects.get(3);
		Joueur[] joueurs = (Joueur[]) listeObjects.get(4);

		
		while (!victoire(joueurs)) { // Code à exécuter tant que la condition de victoire est fausse
			for (Joueur joueur : joueurs) {
				System.out.println("\n\n#----------------------#");
				System.out.println("      Nouveau Tour");
				System.out.println("#----------------------#");
				System.out.println("C'est ton tour " + joueur.getNomJoueur());
				System.out.println("Tu as " + joueur.getanneauxKarmique()+" anneaux Karmiques");
				
				reincarnation(joueur, fosse, source);
				checkCoutKarmique(joueur, coutKarmique, fosse, scanner);
				
				if(!(joueur.getPileJoueur().estVide())) {
					// Si pile non vide 
					
					System.out.println("Options : ");
					System.out.println("1 - Piocher une carte");
					System.out.println("2 - Passer son tour");
					System.out.print("Choix : ");
					int choice = 1;
					if (joueur.isBot()) {
					    Random random = new Random();   				        
					    int nombreAleatoire = random.nextInt(2) + 1;
					    choice = nombreAleatoire;
					} else {
						List<Integer> listeEntiers = List.of(1, 2);
				        choice = joueur.choix(scanner, listeEntiers);
					}
			        switch(choice) {
			        case 2 :
			        	System.out.println("Vous avez choisi de passer votre tour");
			        	break;
			        case 1 :
			        	joueur.getPileJoueur().distribuerCarteLaPlusHaute(joueur);
			        	jouerCarte(joueurs, joueur, source, fosse, coutKarmique, scanner);
			        default:
		                System.out.println("Choix non valide");
		                break;
			        }
				}
			    		
			}
		
	    }
		System.out.println("Victoire de " + getJoueurVictorieux(joueurs));
		scanner.close();
		}


	
}


