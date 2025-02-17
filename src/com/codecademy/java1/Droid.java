package com.codecademy.java1;

public class Droid {

    String name;
    int batteryLevel;

    public Droid(String droidName){
        name = droidName;
    }

    public String toString(){
        return "Hello, I'm the droid: " + name;
    }

    public void performTask(String task){
        System.out.println(name + " is performing a task: " + task);
        batteryLevel -= 10;
    }



    public static void main(String[] args){
        Droid codey = new Droid("Codey");
        System.out.println(codey);
        codey.performTask("Dancing");

    }
}
