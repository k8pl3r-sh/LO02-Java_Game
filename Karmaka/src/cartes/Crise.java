package cartes;

public class Crise extends CarteRouge {
	static int compteurInstance = 0;

	public Crise() {
		super("Crise", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Le rival de votre choix défausse une de ses oeuvres
		
	}

}
