package com.codecademy.java2.languageFamilies;

public class Mayan extends Language{

    Mayan(String languageName, int speakers){
        super(languageName, speakers, "Central America", "very-object-subject");
    }

    @Override
    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ".");
        System.out.println("The language follows the word order: " + this.wordOrder);
        System.out.println("Fun fact: " + this.name + " is an ergative language.");
    }

}
