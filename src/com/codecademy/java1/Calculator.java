package com.codecademy.java1;

public class Calculator{

    public Calculator(){

    }

    public int add(int x, int y){
        return x + y;
    }

    public int subtract(int x, int y){
        return x - y;
    }

    public int multiply(int x, int y){
        return x * y;
    }

    public int divide(int x, int y){
        return x / y;
    }

    public int modulo(int x, int y){
        return x % y;
    }

    public static void main(String[] args){
        Calculator myCalculator = new Calculator();

        System.out.println("Addition of x + y = " + myCalculator.add(5, 7));
        System.out.println("Addition of x + y = " + myCalculator.subtract(45, 11));
    }
}
