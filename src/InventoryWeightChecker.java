package dev.lpa;

import java.util.Arrays;
import java.util.Scanner;

// Acts as the entry point for the app. Reads weights, prints them, and finds the lightest

public class InventoryWeightChecker {

    public static void main(String[] args) {
        int[] itemWeights = readItemWeights();  // Gets player input and stores it in an array
        System.out.println("Item weights: " + Arrays.toString(itemWeights));    // Prints full array nicely

        int lightestItem = findLightestItem(itemWeights);   // Scans & finds lowest number in the Array
        System.out.println("Lightest item weight: " + lightestItem);
    }

        // Gets how many items the player has and the weight of each item

    public static int[] readItemWeights() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many items are in your backpack? ");
        int count = scanner.nextInt();  // How many items

        int[] weights = new int[count]; // Create array to store them

        // Loop to fill in item weights
        for (int i = 0; i < count; i++) {
            System.out.print("Enter weight of item " + (i + 1) + ": ");
            weights[i] = scanner.nextInt(); // Read each weight
        }

        return weights; // Return full array
    }

        // Scans through the array and returns the smallest (lightest) number

    public static int findLightestItem(int[] array) {
        int lightest = array[0];    // Start with the first as the assumed lightest

        for (int i = 1; i < array.length; i++) {
            if (array[i] < lightest) {
                lightest = array[i];    // Found a lighter item
            }
        }

        return lightest;    // Return the lowest found
    }
}
