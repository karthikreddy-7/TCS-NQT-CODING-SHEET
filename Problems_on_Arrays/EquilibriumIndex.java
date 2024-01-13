package Problems_on_Arrays;

import java.util.Scanner;

public class EquilibriumIndex {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements:");
        int n = sc.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int[] leftSumSoFar = new int[n];
        int[] rightSumSoFar = new int[n];

        // Calculate the left sum at each index
        int leftSum = 0;
        for (int i = 0; i < n; i++) {
            leftSum += arr[i];
            leftSumSoFar[i] = leftSum;
        }

        // Calculate the right sum at each index
        int rightSum = 0;
        for (int i = n - 1; i >= 0; i--) {
            rightSum += arr[i];
            rightSumSoFar[i] = rightSum;
        }

        // Find the equilibrium index
        int equilibriumIndex = -1;
        for (int i = 0; i < n; i++) {
            if (leftSumSoFar[i] == rightSumSoFar[i]) {
                equilibriumIndex = i;
                break;
            }
        }

        // Print the result
        if (equilibriumIndex != -1) {
            System.out.println("Equilibrium index: " + equilibriumIndex);
        } else {
            System.out.println("No equilibrium index found.");
        }

        sc.close();
    }
}
