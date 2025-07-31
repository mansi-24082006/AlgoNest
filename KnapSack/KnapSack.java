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
        // Sort items by ratio (value/weight) in descending order
        items.sort((a, b) -> Double.compare(b.ratio, a.ratio));

        double totalValue = 0;

        for (Item item : items) {
            if (capacity >= item.weight) {
                capacity -= item.weight;
                totalValue += item.value;
            } else {
                totalValue += item.value * (capacity / item.weight);
                break;
            }
        }
        return totalValue;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Take number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        List<Item> items = new ArrayList<>();

        // Input items dynamically
        for (int i = 0; i < n; i++) {
            System.out.print("Enter weight and value for item " + (i + 1) + ": ");
            double weight = sc.nextDouble();
            double value = sc.nextDouble();
            items.add(new Item(weight, value));
        }

        // Input knapsack capacity
        System.out.print("Enter knapsack capacity: ");
        double capacity = sc.nextDouble();

        double maxValue = getMaxValue(items, capacity);
        System.out.println("Maximum value in knapsack: " + maxValue);
    }
}










//////////////////////////////Output

Enter number of items: 5
Enter weight and value for item 1: 10 20
Enter weight and value for item 2: 20 30
Enter weight and value for item 3: 30 66
Enter weight and value for item 4: 40 40
Enter weight and value for item 5: 50 60
Enter knapsack capacity: 100
Maximum value in knapsack: 164.0
