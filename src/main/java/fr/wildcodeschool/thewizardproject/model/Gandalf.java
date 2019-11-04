package fr.wildcodeschool.thewizardproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("gandalfId")
public class Gandalf implements WizardInterface {

	private OutfitInterface outfit;
	
	@Autowired
    public Gandalf(@Qualifier("outfitRed") OutfitInterface theOutfit) {
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
