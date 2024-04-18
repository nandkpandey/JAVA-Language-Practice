package InterviewProblem;

import java.util.*;

public class ShelfManager {
    private int[] shelves;

    public ShelfManager(int numShelves) {
        // Initialize shelves array with zero items
        shelves = new int[numShelves];
    }

    // Shopkeeper adds an item to the least filled shelf
    public void addItem() {
        int minIndex = 0;
        for (int i = 1; i < shelves.length; i++) {
            if (shelves[i] < shelves[minIndex]) {
                minIndex = i;
            }
        }
        shelves[minIndex]++;
    }

    // Customer removes an item from the most filled shelf
    public void removeItem() {
        int maxIndex = 0;
        for (int i = 1; i < shelves.length; i++) {
            if (shelves[i] > shelves[maxIndex]) {
                maxIndex = i;
            }
        }
        shelves[maxIndex]--;
    }

    // Print the current state of shelves
    public void printShelves() {
        for (int i = 0; i < shelves.length; i++) {
            System.out.printf("S%d: %d, ", i + 1, shelves[i]);
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int numShelves = 3;
        ShelfManager manager = new ShelfManager(numShelves);
        List<String> operations = Arrays.asList("Shopkeeper", "Shopkeeper", "Customer", 
                                                "Shopkeeper", "Shopkeeper", "Shopkeeper", 
                                                "Customer", "Customer", "Shopkeeper", 
                                                "Customer", "Customer");

        // Execute operations and print shelves after each operation
        for (String operation : operations) {
            if (operation.equals("Shopkeeper")) {
                manager.addItem();
            } else if (operation.equals("Customer")) {
                manager.removeItem();
            }
            manager.printShelves();
        }
    }
}

