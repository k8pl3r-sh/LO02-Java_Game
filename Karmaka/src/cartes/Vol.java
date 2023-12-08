package cartes;

public class Vol extends CarteBleue {
	static int compteurInstance = 0;

	public Vol() {
		super("Vol", "", 3);
		if (compteurInstance > 1) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Placez dans votre Main l'oeuvre exposée d'un rival
		
	}
	
	
}
