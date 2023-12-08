package cartes;

public class Sauvetage extends CarteVerte {
	static int compteurInstance = 0;

	public Sauvetage() {
		super("Sauvetage", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Ajoutez à votre Main une des 3 dernières cartes de la Fosse
		
	}

}
