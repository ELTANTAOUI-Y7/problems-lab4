package problem1;

import java.util.Scanner;

public class Sales {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        // Ask user for number of salespeople
        System.out.print("Enter number of salespeople: ");
        int SALESPEOPLE = scan.nextInt();

        int[] sales = new int[SALESPEOPLE];
        int sum = 0;

        // Initialize min and max
        int maxSale = 0;
        int minSale = 0;
        int maxIndex = 0;
        int minIndex = 0;

        // Read sales, compute total, track max and min
        for (int i = 0; i < sales.length; i++) {
            System.out.print("Enter sales for salesperson " + (i + 1) + ": ");
            sales[i] = scan.nextInt();
            sum += sales[i];

            if (sales[i] > maxSale) {
                maxSale = sales[i];
                maxIndex = i;
            }
            if (sales[i] < minSale) {
                minSale = sales[i];
                minIndex = i;
            }
        }

        // Display all sales and total
        System.out.println("\nSalesperson\tSales");
        System.out.println("-----------------------");
        for (int i = 0; i < sales.length; i++) {
            System.out.println((i + 1) + "\t\t" + sales[i]);
        }

        // Compute average
        double avgSale = (double) sum / sales.length;

        // Display results
        System.out.println("\nTotal sales: " + sum);
        System.out.println("Average sale: " + avgSale);
        System.out.println("Salesperson " + (maxIndex + 1) + " had the highest sale with $" + maxSale);
        System.out.println("Salesperson " + (minIndex + 1) + " had the lowest sale with $" + minSale);


        System.out.print("\nEnter a sales amount to check who exceeded it: ");
        int exce = scan.nextInt();

        int countAbove = 0;
        System.out.println("\nSalespeople who exceeded " + exce + ":");
        for (int i = 0; i < sales.length; i++) {
            if (sales[i] > exce) {
                System.out.println("Salesperson " + (i + 1) + " with $" + sales[i]);
                countAbove++;
            }
        }

        System.out.println("Total number of salespeople who exceeded " + exce + ": " + countAbove);

        scan.close();
    }
}
