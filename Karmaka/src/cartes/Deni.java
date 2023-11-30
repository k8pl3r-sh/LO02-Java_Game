package cartes;

public class Deni extends CarteVerte {
	static int compteurInstance = 0;

	public Deni() {
		super("Deni", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Défaussez une carte de votre Main. Copiez le pouvoir de cette carte
		
	}
	
	
}
