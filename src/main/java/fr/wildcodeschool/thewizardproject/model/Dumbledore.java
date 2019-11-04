package fr.wildcodeschool.thewizardproject.model;

public class Dumbledore implements WizardInterface {

	private OutfitInterface outfit;

    public Dumbledore(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String changeDress() {
        return this.outfit.getDress();
    }
    
	@Override
	public String giveAdvice() {
		return "Smoke weed Harry";
	}

}
