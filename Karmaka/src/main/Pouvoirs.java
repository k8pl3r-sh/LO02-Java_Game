package main;

import java.util.List;
import java.util.Scanner;

import cartes.Carte;

public enum Pouvoirs {
    Transmigration {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Transmigration");
            System.out.println(joueur.getVieFutureJoueur());
            
            
            
        }
    },
    CoupdOeil { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir CoupdOeil");
            System.out.println(adversaire.getMainJoueur());
            jouerCarte(joueurs, joueur, source, fosse, coutKarmique);
        }
    },
    RevesBrises { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Application pouvoir RevesBrises");
            if(!adversaire.getVieFutureJoueur().estVide()) {
            	adversaire.getVieFutureJoueur().deplacerCarte(joueur.getVieFutureJoueur());
        
            }
            else {
            	System.out.println("Erreur");
            }
            
        }
    },
    Deni {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Deni");
        }
    },
    Vol { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Vol");
            if(!adversaire.getOeuvresJoueur().estVide()) {
            	adversaire.getOeuvresJoueur().deplacerCarte(joueur.getMainJoueur());
            }
            else {
            	System.out.println("Erreur");
            }
        }
    },
    Destinee {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Destinee");
        }
    },
    Duperie {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Application pouvoir Duperie");
            
        }
    },
    Lendemain { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Lendemain");
            source.distribuerCarteLaPlusHaute(joueur);
            jouerCarte(joueurs, joueur, source, fosse, coutKarmique);
        }
    },
    Sauvetage {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Sauvetage");
        }
    },
    Longevite { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Longevite");
            source.deplacerCarte(adversaire.getPileJoueur());
            source.deplacerCarte(adversaire.getPileJoueur());
        }
    },
    Recyclage { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
        }
    },
    Semis {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Semis");
        }
    },
    Voyage { // OK
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Voyage");
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            System.out.println(joueur.getMainJoueur());
        }
    },
    Jubile {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Jubile");
        }
    },
    DernierSouffle {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir DernierSouffle");
        }
    },
    Crise {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Crise");
            List<Integer> listePoss = new ArrayList<>();
            for(int i=1; i <= adversaire.getOeuvresJoueur().size(); i++) {
            	listePoss.add(i);
            }
            System.out.println("Voici votre main, indiquez la position de la carte que vous souhaitez défausser");
            System.out.println(adversaire.getMainJoueur());
            adversaire.getMainJoueur().remove(adversaire.choix(entree, listPoss)-1);
            System.out.println("Voici votre nouvelle main, indiquez la position de la carte que vous souhaitez défausser");
            System.out.println(adversaire.getMainJoueur());
        }
    },
    Fournaise { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Application pouvoir Fournaise");
            if(!adversaire.getVieFutureJoueur().estVide()) {
                adversaire.getVieFutureJoueur().deplacerCarte(fosse,entree);
                adversaire.getVieFutureJoueur().deplacerCarte(fosse,entree);
                }
        }
    },
    Vengeance { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Application pouvoir Vengeance");
            if(!adversaire.getOeuvresJoueur().estVide()) {
            	adversaire.getOeuvresJoueur().deplacerCarte(fosse,entree);
            }
        }
    },
    Panique { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Panique");
            if(!adversaire.getPileJoueur().estVide()) {
            	 adversaire.getPileJoueur().deplacerCarte(fosse);
                 jouerCarte(joueurs, joueur, source, fosse, coutKarmique);
            }
        }
    },
    Roulette {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Roulette");
        }
    },
    Bassesse {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Bassesse");
        }
    },
    Incarnation {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Appliquer pouvoir Incarnation");
            
        }
    },
    Mimetisme { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree) {
            System.out.println("Application pouvoir Mimetisme");
            if(!adversaire.getOeuvresJoueur().estVide()) {
            	adversaire.getOeuvresJoueur().retourneCarteLaPlusHaute().appliquerPouvoir(joueur, adversaire, source, fosse, Scanner entree);
            }
            else {
            	System.out.println("Erreur");
            }
            
        }
    };

    public abstract void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Scanner entree);
}
