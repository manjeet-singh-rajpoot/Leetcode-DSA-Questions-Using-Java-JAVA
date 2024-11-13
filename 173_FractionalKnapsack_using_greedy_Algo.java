import java.util.Arrays;
import java.util.Comparator;

// Class representing an item with weight, value, and value-to-weight ratio
class Item {
    double weight, value, ratio;

    // Constructor to initialize an item with weight and value, and calculate the ratio
    Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;
    }
}

public class FractionalKnapsack {
    // Method to calculate the maximum value that can be carried in the knapsack
    public static double getMaxValue(Item[] items, double capacity) {
        // Sort items by their value-to-weight ratio in descending order
        Arrays.sort(items, new Comparator<Item>() {
            @Override
            public int compare(Item o1, Item o2) {
                return Double.compare(o2.ratio, o1.ratio);
            }
        });

        // Variable to keep track of the total value in the knapsack
        double totalValue = 0;

        // Iterate through the sorted items
        for (Item item : items) {
            if (capacity - item.weight >= 0) {
                // If the item can be completely added to the knapsack
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                // If only part of the item can be added to the knapsack
                totalValue += item.value * (capacity / item.weight);
                // No more capacity left, exit the loop
                break;
            }
        }

        // Return the total value accumulated
        return totalValue;
    }

    // Main method
    public static void main(String[] args) {
        // Array of items with specified weights and values
        Item[] items = {
            new Item(10, 60),
            new Item(20, 100),
            new Item(30, 120)
        };

        // Knapsack capacity
        double capacity = 50;

        // Calculate the maximum value that can be carried and print the result
        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}