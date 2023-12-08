package cartes;

public class Semis extends CarteVerte {
	static int compteurInstance = 0;

	public Semis() {
		super("Semis", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Puisez 2 cartes à la Source, puis placez sur Votre VieFuture 2 cartes de votre Main.
		
	}
	

}
