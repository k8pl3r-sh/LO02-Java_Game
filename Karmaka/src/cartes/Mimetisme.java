package cartes;

public class Mimetisme extends CarteMosaique {
	static int compteurInstance = 0;

	public Mimetisme() {
		super("Mimetisme", "", 1);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Choisissez un rival; Copiez le pouvoir de son oeuvre exposée
		
	}
	
	
}
