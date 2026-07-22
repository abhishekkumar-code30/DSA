public class EvenOddAndTables {
    public static void main(String[] args) {
        // Method 1
        System.out.print("Even numbers (1 to 20) - Filter: ");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
            }
        }
        System.out.println();

        // Method 2: (Runs 10 times - Optimized)
        System.out.print("Even numbers (2 to 20) - Step: ");
        for (int i = 2; i <= 20; i += 2) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Multiplication Table
        int n = 17;
        System.out.println("\nMultiplication table of " + n + ":");
        for (int i = 1; i <= 10; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}