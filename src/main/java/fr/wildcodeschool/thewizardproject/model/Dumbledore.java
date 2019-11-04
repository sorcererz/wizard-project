package fr.wildcodeschool.thewizardproject.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("dumbledoreId")
public class Dumbledore implements WizardInterface {

	private OutfitInterface outfit;
	
	@Autowired
    public Dumbledore(@Qualifier("outfitBlue") OutfitInterface theOutfit) {
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
