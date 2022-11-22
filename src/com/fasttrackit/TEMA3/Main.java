package com.fasttrackit.TEMA3;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {

    public static void main(String[] args) {

        List<Integer> winningNum = new ArrayList<>();
        List<Integer> guessedNum = new ArrayList<>();
        Random rand = new Random();

        int countFour = 0;
        int countFive = 0;
        int countSix = 0;
        int totalCount = 0;

        do {
            winningNum.clear();
            guessedNum.clear();

            for (int i = 0; i < 6; i++) {
                int winning = rand.nextInt(1, 49);
                if (winningNum.contains(winning)) {
                   winning = rand.nextInt(1,49);
                   i--;
                }
                winningNum.add(winning);
            }

            System.out.println("================ 6 of 49 ================");
            System.out.println("=========================================");

            for (int i = 0; i < 6; i++) {
               int number = rand.nextInt(1, 49);
                if (guessedNum.contains(number)) {
                    number = rand.nextInt(1, 49);
                    i--;
                }
                guessedNum.add(number);
            }

            System.out.println("Your ticket is : " + guessedNum);
            System.out.println("\nThe winning numbers were: " + winningNum);
            guessedNum.retainAll(winningNum);
            System.out.println("Your matched numbers are: " + guessedNum);

            if (guessedNum.containsAll(winningNum)) {
                System.out.println("!!!!!!!!!!!!!  CONGRATS  !!!!!!!!!!!!!!");
                System.out.println("=============   6 0f 6   ==============");
                System.out.println("\n");
                countSix ++;


            } else if (guessedNum.size() == 4 && countFour == 0) {
                System.out.println("!!!!!!!!!!!!!  CONGRATS  !!!!!!!!!!!!!!");
                System.out.println("=============   4 0f 6   ==============");
                System.out.println("\n");
                countFour += totalCount;


            } else if (guessedNum.size() == 5 && countFive == 0) {
                System.out.println("!!!!!!!!!!!!!  CONGRATS  !!!!!!!!!!!!!!");
                System.out.println("=============   5 0f 6   ==============");
                System.out.println("\n");
                countFive += totalCount;

            } else {
                System.out.println("Sorry, Try again!");
                totalCount++;
                System.out.println("\n");
            }

        } while (countSix != 1 );
        countSix = totalCount;
        System.out.println("toate incercarile: " + totalCount);
        System.out.println("s-a castigat cu 4 numere dupa " + countFour + " de incercari ");
        System.out.println("s-a castigat cu 5 numere dupa " + countFive + " de incercari ");
        System.out.println("s-a castigat cu 6 numere dupa " + countSix + " de incercari ");
    }
}
