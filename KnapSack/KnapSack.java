import java.util.*;

class Item {
    double weight, value, ratio;

    Item(double weight, double value) {
        this.weight = weight;
        this.value = value;
        this.ratio = value / weight;
    }
}

public class Main {

    public static double getMaxValue(List<Item> items, double capacity) {
        // Sort items by value-to-weight ratio in descending order
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;
        double remainingCapacity = capacity;

        System.out.println("\nSelected items (with fractions if needed):");
        for (Item item : items) {
            if (remainingCapacity >= item.weight) {
                System.out.printf("Take full item (weight=%.2f, value=%.2f)\n", item.weight, item.value);
                remainingCapacity -= item.weight;
                totalValue += item.value;
            } else {
                double fraction = remainingCapacity / item.weight;
                System.out.printf("Take %.2f fraction of item (weight=%.2f, value=%.2f)\n", fraction, item.weight, item.value);
                totalValue += item.value * fraction;
                break; // Knapsack is full
            }
        }

        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Step 1: Input
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        double[] weights = new double[n];
        double[] values = new double[n];
        double totalWeight = 0, totalValue = 0;

        List<Item> items = new ArrayList<>();

        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and value for item " + (i + 1) + ": ");
            double w = sc.nextDouble();
            double v = sc.nextDouble();
            weights[i] = w;
            values[i] = v;
            totalWeight += w;
            totalValue += v;
            items.add(new Item(w, v));
        }

        System.out.print("Enter knapsack capacity: ");
        double capacity = sc.nextDouble();

        // Step 2: Display arrays and totals
        System.out.println("\nWeights array: " + Arrays.toString(weights));
        System.out.println("Profits array: " + Arrays.toString(values));
        System.out.println("Total weight of all items: " + totalWeight);
        System.out.println("Total profit of all items: " + totalValue);

        // Step 3: Show sorted items
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));
        System.out.println("\nItems sorted by value-to-weight ratio:");
        for (Item item : items) {
            System.out.printf("Weight: %.2f, Value: %.2f, Ratio: %.2f\n", item.weight, item.value, item.ratio);
        }

        // Step 4: Calculate max value for knapsack
        double maxProfit = getMaxValue(items, capacity);
        System.out.printf("\nMaximum value in knapsack (capacity = %.2f): %.2f\n", capacity, maxProfit);
    }
}














////////////////////////////Output
Enter number of items: 5
Enter weight and value for item 1: 10 20
Enter weight and value for item 2: 20 30
Enter weight and value for item 3: 30 66
Enter weight and value for item 4: 40 40
Enter weight and value for item 5: 50 60
Enter knapsack capacity: 100

Weights array: [10.0, 20.0, 30.0, 40.0, 50.0]
Profits array: [20.0, 30.0, 66.0, 40.0, 60.0]
Total weight of all items: 150.0
Total profit of all items: 216.0

Items sorted by value-to-weight ratio:
Weight: 30.00, Value: 66.00, Ratio: 2.20
Weight: 10.00, Value: 20.00, Ratio: 2.00
Weight: 20.00, Value: 30.00, Ratio: 1.50
Weight: 50.00, Value: 60.00, Ratio: 1.20
Weight: 40.00, Value: 40.00, Ratio: 1.00

Selected items (with fractions if needed):
Take full item (weight=30.00, value=66.00)
Take full item (weight=10.00, value=20.00)
Take full item (weight=20.00, value=30.00)
Take 0.80 fraction of item (weight=50.00, value=60.00)

Maximum value in knapsack (capacity = 100.00): 164.00
