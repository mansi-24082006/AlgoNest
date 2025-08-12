package javaapplication;
import java.util.Scanner;
public class P9 {
    public static int minCoins(int[] coins, int amount) {
        int n = coins.length;
        int[][] dp = new int[n + 1][amount + 1];
        for (int i = 0; i <= n; i++) {
            dp[i][0] = 0;
        }
        for (int j = 1; j <= amount; j++) {
            dp[0][j] = Integer.MAX_VALUE - 1;
        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= amount; j++) {
                if (coins[i - 1] > j) {
                    dp[i][j] = dp[i - 1][j];
                }
                else {
                    dp[i][j] = Math.min(dp[i - 1][j], 1 + dp[i][j - coins[i - 1]]);
                }
            }
            System.out.print("Pass using coin " + coins[i - 1] + ": ");
            for (int j = 0; j <= amount; j++) {
                if (dp[i][j] >= Integer.MAX_VALUE - 1) {
                    System.out.print("∞ ");
                }
                else {
                    System.out.print(dp[i][j] + " ");
                }
            }
            System.out.println();
        }
        return dp[n][amount] >= Integer.MAX_VALUE - 1 ? -1 : dp[n][amount];
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of coins: ");
        int n = scanner.nextInt();
        int[] coins = new int[n];

        System.out.println("Enter coin values:");
        for (int i = 0; i < n; i++) {
            coins[i] = scanner.nextInt();
        }
        System.out.print("Enter the amount: ");
        int amount = scanner.nextInt();
        int result = minCoins(coins, amount);
        if (result == -1) {
            System.out.println("It is not possible to make change for the amount.");
        }
        else {
            System.out.println("Minimum number of coins required: " + result);
        }
    }
}








//////////////////////////Output
Enter number of coins: 3
Enter coin values:
1
4
6
Enter the amount: 8
Pass using coin 1: 0 1 2 3 4 5 6 7 8 
Pass using coin 4: 0 1 2 3 1 2 3 4 2 
Pass using coin 6: 0 1 2 3 1 2 1 2 2 
Minimum number of coins required: 2

