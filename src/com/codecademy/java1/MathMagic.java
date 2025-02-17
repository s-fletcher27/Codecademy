package com.codecademy.java1;

public class MathMagic {
    public static void main(String[] args) {

        //original number
        int myNumber = 50;
        int stepOne = myNumber * myNumber;
        int stepTwo = stepOne + myNumber;
        int stepThree = stepTwo / myNumber;
        int stepFour = stepThree + 17;
        int stepFive = stepFour - myNumber;
        int stepSix = stepFive / 6;
        System.out.println(stepSix);

        int secondNumber = 69;
        int firstStep = secondNumber * 3;
        int secondStep = firstStep / secondNumber;
        System.out.println("Second number: " + secondStep);

    }
}
