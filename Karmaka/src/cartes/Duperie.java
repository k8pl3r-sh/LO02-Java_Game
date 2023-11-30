package cartes;

public class Duperie extends CarteBleue {
	static int compteurInstance = 0;

	public Duperie() {
		super("Duperie", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Regarder 3 cartes de la Main d'un rival, ajoutez en une à votre Main
		
	}
	
	
}
