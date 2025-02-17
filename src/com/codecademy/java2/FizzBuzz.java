package com.codecademy.java2;

public class FizzBuzz{

    public static void main(String[] args){

        //loop to print out 1 --> 100
        for(int i = 1; i < 101; i++){
            //if divisible by 3 & 5 print FizzBuzz!
            if(i % 3 == 0 && i % 5 == 0){
                System.out.println("FizzBuzz!");
            }
            //if divisible by 3 print Fizz!
            else if(i % 3 == 0){
                System.out.println("Fizz!");
            }
            //if divisible by 5 print Buzz!
            else if(i % 5 == 0){
                System.out.println("Buzz!");
            } else{
                System.out.println(i);
            }
        }
    }
}