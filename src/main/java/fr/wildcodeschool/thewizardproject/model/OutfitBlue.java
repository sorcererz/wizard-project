package fr.wildcodeschool.thewizardproject.model;

import org.springframework.stereotype.Component;

@Component
public class OutfitBlue implements OutfitInterface{
	
	@Override
	public String getDress() {
		return "The wizard dress is blue";
	}

}
