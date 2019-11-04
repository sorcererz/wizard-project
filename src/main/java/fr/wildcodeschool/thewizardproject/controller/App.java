package fr.wildcodeschool.thewizardproject.controller;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import fr.wildcodeschool.thewizardproject.model.WizardInterface;

public class App {

	public void start() {
        
        
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("classpath*:applicationContext.xml");
        WizardInterface myWizard = context.getBean("theWizard", WizardInterface.class);

        context.close();

        System.out.println("");
        System.out.println("******************");
        System.out.println(myWizard.giveAdvice());
        System.out.println("******************");
        System.out.println(myWizard.changeDress());
        System.out.println("******************");
    }
}
