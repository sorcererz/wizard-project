package fr.wildcodeschool.thewizardproject.model;

import org.springframework.stereotype.Component;

@Component
public class OutfitRed implements OutfitInterface{
	
	@Override
	public String getDress() {
		return "The wizard dress is red";
	}
}
