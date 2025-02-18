package com.codecademy.java2;

public class DNA {

    public static void main(String[] args) {

        //  -. .-.   .-. .-.   .
        //    \   \ /   \   \ /
        //   / \   \   / \   \
        //  ~   `-~ `-`   `-~ `-

        String dna1 = "ATGCGATACGCTTGA";
        String dna2 = "ATGCGATACGTGA";
        String dna3 = "ATTAATATGTACTGA";

        String dna = dna1;

        int dnaLength = dna.length();
        int start = dna.indexOf("ATG");
        int end = dna.indexOf("TGA");
        if (start != -1 && end != -1 && (end - start) % 3 == 0) {
            String protein = dna.substring(start, end+3);
            System.out.println("Protein: " + protein);
        } else{
            System.out.println("No protein.");
        }

    }
}

