package com.codecademy.java2.languageFamilies;

public class Language{
    protected String name;
    protected int numSpeakers;
    protected String regionsSpoken;
    protected String wordOrder;

    Language(String langName, int numSpeak, String regSpoken, String wrdOrdr){
        this.name = langName;
        this.numSpeakers = numSpeak;
        this.regionsSpoken = regSpoken;
        this.wordOrder = wrdOrdr;
    }

    public void getInfo(){
        System.out.println(this.name + " is spoken by " + this.numSpeakers + " people mainly in " + this.regionsSpoken + ". The language follows the word order: " + this.wordOrder);
    }

    public static void main(String[] args){
        Language russian = new Language("Russian", 69, "All of Russia", "this and that");
        russian.getInfo();

        Mayan testMayan = new Mayan("testMayan", 54189);
        testMayan.getInfo();

        SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1110000000);
        mandarin.getInfo();
        SinoTibetan burmese = new SinoTibetan("Burmese", 43000000);
        burmese.getInfo();



    }


}
