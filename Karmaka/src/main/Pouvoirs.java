package main;

import java.util.*;

import cartes.Carte;

public enum Pouvoirs {
    Transmigration { 
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            if(!joueur.getVieFutureJoueur().estVide()) {
            	System.out.println("Appliquer pouvoir Transmigration");
                System.out.println(joueur.getVieFutureJoueur());
                System.out.println("Quel est le nom de la carte à récuperer ?");
                joueur.getVieFutureJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getMainJoueur()); 
                System.out.println(joueur.getMainJoueur());
            } else {
            	System.out.println("Votre Vie Future est vide");
            }
        }	
    },
    CoupdOeil { 
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir CoupdOeil");
            System.out.println(adversaire.getMainJoueur());
            Joueur[] listeJoueurs = new Joueur[] {joueur,adversaire};
            MoteurJeu.jouerCarte(listeJoueurs, joueur, source, fosse, coutKarmique, entree);
        }
    },
    RevesBrises { 
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir RevesBrises");
            if(!adversaire.getVieFutureJoueur().estVide()) {
                adversaire.getVieFutureJoueur().deplacerCarte(joueur.getVieFutureJoueur());
            }
            else {
                System.out.println("Erreur, la Vie Future de votre adversaire est vide.");
            }
            
        }
    },
    Deni {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Deni");
            System.out.println(joueur.getMainJoueur());
            System.out.println("Voici votre main, quelle carte voulez-vous défausser et copier le pouvoir ?");
            String name = joueur.choix(entree, joueur.getMainJoueur());
            while (name == "Deni") {
                System.out.println("Vous ne pouvez pas copier cette carte");
            	name = joueur.choix(entree, joueur.getMainJoueur());
            }
            joueur.getMainJoueur().getCarteParNom(name).appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, entree);
            joueur.getMainJoueur().deplacerCarteParNom(name, fosse);
            }
    },
    Vol {
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
            int size = adversaire.getMainJoueur().getTasCartes().size();
            int start = size - 3; 

            if (start >= 0) {
                System.out.println("Voici 3 cartes de la main de votre adversaire :");
                for (int i = start; i < size; i++) {
                    System.out.println(adversaire.getMainJoueur().getTasCartes().get(i));
                }
            } else {
                System.out.println("La liste contient moins de trois éléments.");
            }
            System.out.println("Écrivez le nom de la carte que vous voulez récupérer :");
            
            adversaire.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getMainJoueur());
            System.out.println("Voici votre nouvelle main :");
            System.out.println(joueur.getMainJoueur());
        }
    },
    Lendemain {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Lendemain");
            source.distribuerCarteLaPlusHaute(joueur);
            Joueur[] listeJoueurs = new Joueur[] {joueur,adversaire};
            MoteurJeu.jouerCarte(listeJoueurs, joueur, source, fosse, coutKarmique, entree);
        }
    },
    Sauvetage {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Sauvetage");
            int size = fosse.getTasCartes().size();
            int start = size - 3; 

            if (start >= 0) {
                System.out.println("Voici les 3 dernieres cartes de la fosse :");
                for (int i = start; i < size; i++) {
                    System.out.println(fosse.getTasCartes().get(i));
                }
            } else {
                System.out.println("La liste contient moins de trois éléments.");
            }
            System.out.println("Écrivez le nom de la carte que vous voulez récupérer :");
            
            fosse.deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getMainJoueur());
            System.out.println("Voici votre nouvelle main :");
            System.out.println(joueur.getMainJoueur());
        }
    },
    Longevite {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Longevite");
            source.deplacerCarte(adversaire.getPileJoueur());
            source.deplacerCarte(adversaire.getPileJoueur());
        }
    },
    Recyclage {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
            fosse.deplacerCarte(joueur.getVieFutureJoueur());
        }
    },
    Semis { //tested
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Semis");
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            System.out.println("Voici votre nouvelle main :");
            System.out.println(joueur.getMainJoueur());
            System.out.println("Quelle est la premiere carte que vous souhaitez placer dans votre Vie Future ?");
            joueur.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getVieFutureJoueur());
            System.out.println("Quelle est la seconde carte que vous souhaitez placer dans votre Vie Future ?");

            joueur.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getVieFutureJoueur());
        }
    },
    Voyage {
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
            System.out.println("Voici votre main, indiquez la premiere carte que vous souhaitez placer sur vos oeuvres");
            System.out.println(joueur.getMainJoueur());
            
            joueur.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getOeuvresJoueur());
            System.out.println("Voici votre main, indiquez la seconde carte que vous souhaitez placer sur vos oeuvres");
            System.out.println(joueur.getMainJoueur());
           
            joueur.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), joueur.getOeuvresJoueur());
        }
    },
    DernierSouffle {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir DernierSouffle");
            System.out.println("Voici votre main, la carte que votre adversaire vous fait defausser :");
            System.out.println(adversaire.getMainJoueur());
           
            adversaire.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), fosse);
        }
    },
    Crise {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Crise");
            System.out.println("Voici votre main, indiquez la carte que vous souhaitez défausser");
            System.out.println(adversaire.getMainJoueur());
            adversaire.getMainJoueur().deplacerCarteParNom(adversaire.choix(entree, adversaire.getMainJoueur()), fosse);
            System.out.println(adversaire.getMainJoueur());
        
        }
    },
    Fournaise {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Fournaise");
            if(!adversaire.getVieFutureJoueur().estVide()) {
                adversaire.getVieFutureJoueur().deplacerCarte(fosse);
                if(!adversaire.getVieFutureJoueur().estVide()) {
                	adversaire.getVieFutureJoueur().deplacerCarte(fosse);
                } else {
                	System.out.println("La vie future de votre adversaire est vide");
                }
            } else {
            	System.out.println("La vie future de votre adversaire est vide");
            }
        }
    },
    Vengeance {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Vengeance");
            if(!adversaire.getOeuvresJoueur().estVide()) {
                adversaire.getOeuvresJoueur().deplacerCarte(fosse);
            }
        }
    },
    Panique { 
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Panique");
            if(!adversaire.getPileJoueur().estVide()) {
                 adversaire.getPileJoueur().deplacerCarte(fosse);
                 Joueur[] listeJoueurs = new Joueur[] {joueur,adversaire};
                 MoteurJeu.jouerCarte(listeJoueurs, joueur, source, fosse, coutKarmique, entree);
            }
        }
    },
    Roulette {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Roulette");
            System.out.println("Voici votre main");
            System.out.println(adversaire.getMainJoueur());
            System.out.println("Combien de cartes souhaitez-vous défausser ? (jusqu'à 2)");
            List<Integer> listeEntiers = Arrays.asList(0,1,2);
            int nbChoix = joueur.choix(entree, listeEntiers);
            for (int i=1; i<=nbChoix ; i++) {
            	System.out.println("Quel est le nom de la carte à défausser ?");
            	System.out.println(joueur.getMainJoueur());
                joueur.getMainJoueur().deplacerCarteParNom(joueur.choix(entree, joueur.getMainJoueur()), fosse); 
            }
            System.out.println("Combien de cartes souhaitez vous piocher (max : nombre de carte défaussées + 1)");
            listeEntiers = Arrays.asList(0,1,2,3);
            nbChoix = joueur.choix(entree, listeEntiers);

            for (int i=1; i<=nbChoix ; i++) {
            	source.distribuerCarteLaPlusHaute(joueur);
            }
        }
    },
    Bassesse {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Bassesse");
            System.out.println("2 cartes aléatoire de la main de votre rival on été défaussées");
            if (!adversaire.getMainJoueur().estVide()) {
                adversaire.getMainJoueur().deplacerCarte(fosse);
            	if (!adversaire.getMainJoueur().estVide()) {
                    adversaire.getMainJoueur().deplacerCarte(fosse);
            	}
            }
        }
    },
    Incarnation {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Appliquer pouvoir Incarnation");
            System.out.println("Voici vos oeuvres, indiquez la carte que vous souhaitez copier");
            System.out.println(joueur.getOeuvresJoueur());
            joueur.getOeuvresJoueur().getCarteParNom(joueur.choix(entree, joueur.getMainJoueur())).appliquerPouvoir(joueur,adversaire,source,fosse,coutKarmique,entree);
            
        }
    },
    Mimetisme {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree) {
            System.out.println("Application pouvoir Mimetisme");
            if(!adversaire.getOeuvresJoueur().estVide()) {
                adversaire.getOeuvresJoueur().retourneCarteLaPlusHaute().appliquerPouvoir(joueur, adversaire, source, fosse, coutKarmique, entree);
            }
            else {
                System.out.println("Erreur");
            }
            
        }
    };

    public abstract void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse, Lieu coutKarmique, Scanner entree);
}
