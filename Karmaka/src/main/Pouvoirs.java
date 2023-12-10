package main;

public enum Pouvoirs {
    Transmigration {
        public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Transmigration");
        }
    },
    CoupdOeil {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir CoupdOeil");
        }
    },
    RevesBrises {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir RevesBrises");
        }
    },
    Deni {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Deni");
        }
    },
    Vol {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Vol");
        }
    },
    Destinee {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Destinee");
        }
    },
    Duperie {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Duperie");
        }
    },
    Lendemain {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Lendemain");
        }
    },
    Sauvetage {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Sauvetage");
        }
    },
    Longevite {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Longevite");
        }
    },
    Recyclage {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Recyclage");
        }
    },
    Semis {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Semis");
        }
    },
    Voyage {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Voyage");
            //source.distribuerCarteLaPlusHaute(joueur);
            //source.distribuerCarteLaPlusHaute(joueur);
            //source.distribuerCarteLaPlusHaute(joueur);
        }
    },
    Jubile {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Jubile");
        }
    },
    DernierSouffle {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir DernierSouffle");
        }
    },
    Crise {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Crise");
        }
    },
    Fournaise {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Fournaise");
        }
    },
    Vengeance {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Vengeance");
        }
    },
    Panique {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Panique");
        }
    },
    Roulette {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Roulette");
        }
    },
    Bassesse {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Bassesse");
        }
    },
    Incarnation {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Incarnation");
        }
    },
    Mimetisme {
    	public void appliquerPouvoir() {
            System.out.println("Appliquer pouvoir Mimetisme");
        }
    };

    // Méthode abstraite
    public abstract void appliquerPouvoir();
}
