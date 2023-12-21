package main;

import java.util.*;

import cartes.Carte;


//import cartes.Carte;

public enum Pouvoirs {
    Transmigration {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Transmigration");
            System.out.println(joueur.getVieFutureJoueur());
            
            
            
        }
    },
    CoupdOeil { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir CoupdOeil");
            System.out.println(adversaire.getMainJoueur());
            //jouerCarte(joueurs, joueur, source, fosse, joueur.coutKarmique());
        }
    },
    RevesBrises { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
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
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Deni");
        }
    },
    Vol { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
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
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Destinee");
            int size = source.getTasCartes().size();
            int start = size - 3; 

            if (start >= 0) {
                System.out.println("Les trois dernieres cartes de la source sont :");
                for (int i = start; i < size; i++) {
                    System.out.println(source.getTasCartes().get(i));
                }
            } else {
                System.out.println("La liste contient moins de trois éléments.");
            }
            List<Integer> listeNombre = List.of(1,2);
            System.out.println("Choisisez le nombre de carte que vous souhaitez mettre dans votre Vie Future");
            int nbChoix = joueur.choix(entree, listeNombre);
            entree.nextLine(); // a implementer dans choix
            for (int i=1; i<=nbChoix ; i++) {
            	System.out.println("Quel est le nom de la carte à récuperer ?");
                String name = entree.nextLine();
                source.deplacerCarteParNom(name, joueur.getVieFutureJoueur()); 
            }
            if(nbChoix == 2) {
            	List<Integer> listeNombre2 = List.of(0,1);
            	int nbChoix2 = joueur.choix(entree, listeNombre2);
            	if(nbChoix2 == 1) {
            		source.melanger();
            	}
            }
            System.out.println(joueur.getVieFutureJoueur());
        }
    },
    Duperie {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Duperie");
            
        }
    },
    Lendemain { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Lendemain");
            source.distribuerCarteLaPlusHaute(joueur);
            //jouerCarte(joueurs, joueur, source, fosse, coutKarmique);
        }
    },
    Sauvetage {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Sauvetage");
        }
    },
    Longevite { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Longevite");
            source.deplacerCarte(adversaire.getPileJoueur());
            source.deplacerCarte(adversaire.getPileJoueur());
        }
    },
    Recyclage { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
        }
    },
    Semis {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Semis");
        }
    },
    Voyage { // OK
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Voyage");
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            System.out.println(joueur.getMainJoueur());
        }
    },
    Jubile {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Jubile");
        }
    },
    DernierSouffle {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir DernierSouffle");
        }
    },
    Crise {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Crise");
                
            System.out.println("Voici votre main, indiquez la position de la carte que vous souhaitez défausser");
            System.out.println(adversaire.getMainJoueur());
            List<String> listeCartes = new ArrayList<>();
            for (Carte carte : adversaire.getMainJoueur()) {
                listeCartes.add(carte);
            }
            adversaire.getMainJoueur().removeCarte(adversaire.choix(entree, adversaire.getOeuvresJoueur()));
        
        }
    },
    Fournaise { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Fournaise");
            if(!adversaire.getVieFutureJoueur().estVide()) {
                adversaire.getVieFutureJoueur().deplacerCarte(fosse,entree);
                adversaire.getVieFutureJoueur().deplacerCarte(fosse,entree);
                }
        }
    },
    Vengeance { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Vengeance");
            if(!adversaire.getOeuvresJoueur().estVide()) {
                adversaire.getOeuvresJoueur().deplacerCarte(fosse,entree);
            }
        }
    },
    Panique { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Panique");
            if(!adversaire.getPileJoueur().estVide()) {
                 adversaire.getPileJoueur().deplacerCarte(fosse);
                 jouerCarte(joueur, joueur, source, fosse, coutKarmique);
            }
        }
    },
    Roulette {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Roulette");
        }
    },
    Bassesse {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Bassesse");
        }
    },
    Incarnation {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Incarnation");
            
        }
    },
    Mimetisme { // à vérifier
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Mimetisme");
            if(!adversaire.getOeuvresJoueur().estVide()) {
                adversaire.getOeuvresJoueur().retourneCarteLaPlusHaute().appliquerPouvoir(joueur, adversaire, source, fosse, entree);
            }
            else {
                System.out.println("Erreur");
            }
            
        }
    };

    public abstract void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree);
}
