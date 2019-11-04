package fr.wildcodeschool.thewizardproject.model;

public class Gandalf implements WizardInterface {

	private OutfitInterface outfit;

    public Gandalf(OutfitInterface theOutfit) {
        outfit = theOutfit;
    }

    @Override
    public String changeDress() {
        return this.outfit.getDress();
    }
    
	@Override
	public String giveAdvice() {
		return "Don't trust the government";
	}
}
