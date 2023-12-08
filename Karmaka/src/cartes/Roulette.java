package cartes;

public class Roulette extends CarteRouge {
	static int compteurInstance = 0;

	public Roulette() {
		super("Roulette", "", 2);
		if (compteurInstance > 2) {
            throw new IllegalStateException("Vous ne pouvez pas créer plus de trois instances.");
        }
        compteurInstance++;
	}
	
	@Override
	public void appliquerPouvoir() {
		// Défaussez jusqu'à 2 cartes de votre Main. Vous pouvez ensuite puiser à la Source autant de carte(s) + 1.
		
	}

}
