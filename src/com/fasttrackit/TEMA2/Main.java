package com.fasttrackit.TEMA2;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
//        arraySum(scan);
//        oddNumbers(scan);
//        isBigger(scan);
//        fundRaising(scan);
//        menuApp(scan);
        randomNumber(scan);
    }

    public static void arraySum(Scanner scan) {
        System.out.print("Enter the length of the array: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        int sum = 0;

        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
            sum += arr[i];
        }
        System.out.println("arr " + Arrays.toString(arr) + ".  arr element sum = " + sum);
        System.out.println("=============================================================");
    }

    public static void oddNumbers(Scanner scan) {
        System.out.print("Enter the length of the array: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        int odd = 0;
        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
            if (arr[i] % 2 != 0) {
                odd++;
            }
        }
        System.out.println("arr " + Arrays.toString(arr) + ".  number of odd elements = " + odd);
        System.out.println("=============================================================");
    }

    public static void isBigger(Scanner scan) {
        System.out.print("Enter the length of the array: ");
        int arrLength = scan.nextInt();
        int[] arr = new int[arrLength];
        int number = 0;

        for (int i = 0; i < arrLength; i++) {
            System.out.print("Enter element: ");
            arr[i] = scan.nextInt();
        }
        System.out.print("Enter a number to check which element in the array is greater than the given number: ");
        number = scan.nextInt();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > number) {
                System.out.println(arr[i] + " is bigger then " + number);
            }
        }
        System.out.println("=============================================================");
    }

    public static void fundRaising(Scanner scan) {
        System.out.print("Enter target: ");
        int target = scan.nextInt();
        int totalDonations = 0;
        Random random = new Random();
        int donation = 0;
        Boolean useLimit = true;
        int limit = 0;
        int donationsMade = 0;

        if (useLimit) {
            System.out.print("Enter donations limit: ");
            limit = scan.nextInt();

        }

        do {
            donation = random.nextInt(1, target / 2);
            System.out.println("donation: " + donation);
            totalDonations += donation;
            donationsMade++;
        } while ((!useLimit && totalDonations < target) || (useLimit && (totalDonations < target) && (limit > donationsMade)));

        if (useLimit && donationsMade >= limit) {
            System.out.println("Donations limit was reached");
        }
        System.out.println("CONGRATS !!!");
        System.out.println("Total donations: " + totalDonations);
    }


    public static void menuApp(Scanner scan) {
        showMenu();
        int orderNumber = 0;
        do {
            orderNumber = scan.nextInt();
            if (orderNumber == 1) {
                System.out.println("You ordered Pizza. Thank you!");
            } else if (orderNumber == 2) {
                System.out.println("You ordered Cheeseburger. Thank you!");
            } else if (orderNumber == 3) {
                System.out.println("You ordered Soup. Thank you!");
            } else if (orderNumber == 4) {
                System.out.println("Exit");
                break;
            } else {
                System.out.println("Please order from menu");
            }
            showMenu();

        } while (orderNumber != 4);
    }

    private static void showMenu() {
        System.out.println();
        System.out.println("================ MENU ===============");
        System.out.println("Please select something from the menu");
        System.out.println("   1) Pizza ");
        System.out.println("   2) Cheeseburger ");
        System.out.println("   3) Soup ");
        System.out.println("   4) Exit ");
    }

    public static void randomNumber(Scanner scan) {

        int random = 0;
        int number = 0;
        Scanner menu = new Scanner(System.in);
        Random r = new Random();
        int counter= 0;

        do {
            System.out.print("Insert a number between 1 and 20: ");
            number = menu.nextInt();
            random = r.nextInt(20);
            System.out.println("random number is: " + random);

            if (number < 0 || number > 20) {
                System.out.println("Number has to be between 1 and 20");
                break;
            } else if (number == random) {
                System.out.println("Congrats ! " +" counter: "+ counter);
            } else {
                System.out.println("Try again!");
                counter++;
            }
        } while (number != random);
    }
}