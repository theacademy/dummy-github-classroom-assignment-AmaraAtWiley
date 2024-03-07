package PPEX;

import java.util.ArrayList;
import java.util.Scanner;

public class Factorizer {
    // Method to check if a number is prime
    public static boolean isPrime(int num, ArrayList<Integer> factors) {
        // A number is prime if it has only two factors: 1 and itself
        if (factors.size() == 2 && factors.contains(1) && factors.contains(num)) {
            return true;
        }
        return false;
    }

    // Method to find factors of a number
    // Loop from 1 to the number and check if they can divide the number evenly
    public static ArrayList<Integer> getFactors(int Num) {
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= Num; i++) {
            if (Num % i == 0) {
                factors.add(i);
            }
        }
        return factors;
    }

    // Method to check if the sum of factors equals the input number
    public static boolean IsPerfect(int num, ArrayList<Integer> factors) {
        int total = 0;
        for (int x : factors) {
            total += x;
        }
        if (total == num) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {

        // Get user input
        System.out.println("What number would you like to factor?");
        Scanner sc = new Scanner(System.in);
        String n = sc.nextLine();
        int intValue = Integer.parseInt(n);

        // Get factors of the input number
        ArrayList<Integer> Factors = getFactors(intValue);

        // Check if the number is prime
        boolean Prime = isPrime(intValue, Factors);

        // Check if the number is perfect
        boolean isPerfect = IsPerfect(intValue, Factors);

        // Print factors of the number
        System.out.println("The factors of " + n + " are" + Factors.toString());

        // Print whether the number is perfect or not
        if (isPerfect) {
            System.out.println(n + " is a perfect number");
        } else {
            System.out.println(n + " is not a perfect number");
        }

        // Print whether the number is prime or not
        if (Prime) {
            System.out.println(n + " is a prime number");
        } else {
            System.out.println(n + " is not a prime number");
        }
    }
}
