package cartes;

public class Recyclage extends CarteVerte {
	static int compteurInstance = 0;

	public Recyclage() {
		super("Recyclage","",1);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Ajoutez à votre Vie Future une de des 3 dernières cartes de la Fosse.
		
	}
	

}
