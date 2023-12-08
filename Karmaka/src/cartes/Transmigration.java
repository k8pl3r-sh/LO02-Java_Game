package cartes;

public class Transmigration extends CarteBleue {
	static int compteurInstance = 0;

	public Transmigration() {
		super("Transmigration", "", 1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de deux instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// utiliser la méthode de Lieu deplacer Carte
		// Placez dans votre main n'importe quelle carte de votre vie future
		
	}
	
	
}
