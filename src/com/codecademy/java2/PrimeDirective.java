package com.codecademy.java2;

import java.util.ArrayList;

class PrimeDirective {

    //method to check if number passed through is prime, passing true for prime, false for not prime
    public boolean isPrime(int number){
        if(number == 2){
            return true;
        } else if(number < 2){
            return false;
        }
        for(int i = 2; i < number; i++){
            if(number % i == 0){
                return false;
            }
        }
        return true;
    }

    //method that adds prime numbers to an ArrayList called primes, and returns the ArrayList
    public ArrayList<Integer> onlyPrimes(int[] numbers){
        ArrayList<Integer> primes = new ArrayList<>();
        for(int number : numbers){
            if(isPrime(number) == true){
                primes.add(number);
            }
        }
        return primes;
    }

    public static void main(String[] args) {

        PrimeDirective pd = new PrimeDirective();
        int[] numbers = {6, 29, 28, 33, 11, 100, 101, 43, 89};

        /* TESTING PRIME LOGIC
        System.out.println(pd.isPrime(7));
        System.out.println(pd.isPrime(28));
        System.out.println(pd.isPrime(2));
        System.out.println(pd.isPrime(0));
        */
        System.out.println(pd.onlyPrimes(numbers));
    }

}
