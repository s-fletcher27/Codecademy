package com.codecademy.java1;

public class MadLibs {
    /*
    This program generates a mad libbed story.
    Author: Sam
    Date: 14.02.2025
    */
    public static void main(String[] args){
        String name1 = "Sam";
        String name2 = "Abi";
        String adjective1 = "Weird";
        String adjective2 = "Funny";
        String adjective3 = "Boring";
        String verb1 = "Laughing";
        String noun1 = "house";
        String noun2 = "computer";
        String noun3 = "table";
        String noun4 = "sofa";
        String noun5 = "remote";
        String noun6 = "television";
        String place1 = "Gloucester";
        int number = 69;

        //The template for the story
        String story = "This morning "+name1+" woke up feeling "+adjective1+". 'It is going to be a "+adjective2+" day!' Outside, a bunch of "+noun1+"s were protesting to keep "+noun2+" in stores. They began to "+verb1+" to the rhythm of the "+noun3+", which made all the "+noun4+"s very "+adjective3+". Concerned, "+name1+" texted "+name2+", who flew "+name1+" to "+place1+" and dropped "+name1+" in a puddle of frozen "+noun5+". "+name1+" woke up in the year "+number+", in a world where "+noun6+"s ruled the world.";

        System.out.println(story);
    }
}

