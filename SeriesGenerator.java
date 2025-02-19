import java.util.Scanner;

class SeriesGenerator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input
        System.out.print("Enter the number of terms: ");
        int n = scanner.nextInt();

        // Initialize variables
        int[] series = new int[n];
        int current = 3; // The first term of the series

        // Generate the series
        for (int i = 0; i < n; i++) {
            series[i] = current;
            // Update the current term based on the pattern
            current = current * 2 + i + 3;
        }

        // Display the series
        for (int i = 0; i < n; i++) {
            System.out.print(series[i]);
            if (i < n - 1) {
                System.out.print(", ");
            }
        }

        // Close the scanner
        scanner.close();
    }
}
