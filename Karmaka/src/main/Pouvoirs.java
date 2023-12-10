package main;

public enum Pouvoirs {
    Transmigration {
        public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Transmigration");
        }
    },
    CoupdOeil {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir CoupdOeil");
        }
    },
    RevesBrises { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
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
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Deni");
        }
    },
    Vol { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
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
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Destinee");
        }
    },
    Duperie {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Application pouvoir Duperie");
            
        }
    },
    Lendemain {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Lendemain");
        }
    },
    Sauvetage {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Sauvetage");
        }
    },
    Longevite {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Longevite");
        }
    },
    Recyclage {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Recyclage");
        }
    },
    Semis {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Semis");
        }
    },
    Voyage { // OK
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Voyage");
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            source.distribuerCarteLaPlusHaute(joueur);
            System.out.println(joueur.getMainJoueur());
        }
    },
    Jubile {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Jubile");
        }
    },
    DernierSouffle {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir DernierSouffle");
        }
    },
    Crise {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Crise");
        }
    },
    Fournaise { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Application pouvoir Fournaise");
            if(!adversaire.getVieFutureJoueur().estVide()) {
                adversaire.getVieFutureJoueur().deplacerCarte(fosse);
                adversaire.getVieFutureJoueur().deplacerCarte(fosse);
                }
        }
    },
    Vengeance { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Application pouvoir Vengeance");
            if(!adversaire.getOeuvresJoueur().estVide()) {
            adversaire.getOeuvresJoueur().deplacerCarte(fosse);
            }
        }
    },
    Panique {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Panique");
        }
    },
    Roulette {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Roulette");
        }
    },
    Bassesse {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Bassesse");
        }
    },
    Incarnation {
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Appliquer pouvoir Incarnation");
        }
    },
    Mimetisme { // à vérifier
    	public void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse) {
            System.out.println("Application pouvoir Mimetisme");
            if(!adversaire.getOeuvresJoueur().estVide()) {
            	adversaire.getOeuvresJoueur().retourneCarteLaPlusHaute().appliquerPouvoir(joueur, adversaire, source, fosse);
            }
            else {
            	System.out.println("Erreur");
            }
            
        }
    };

    // Méthode abstraite
    public abstract void appliquerPouvoir(Joueur joueur, Joueur adversaire, Lieu source, Lieu fosse);
}
