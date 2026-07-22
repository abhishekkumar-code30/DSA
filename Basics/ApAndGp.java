import java.util.Scanner;

public class ApAndGp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term of AP (a): ");
        int a = sc.nextInt();

        System.out.print("Enter common difference (d): ");
        int d = sc.nextInt();

        System.out.print("Enter first term of GP: ");
        int g = sc.nextInt();

        System.out.print("Enter common ratio (r): ");
        int r = sc.nextInt();

        System.out.print("Enter number of terms (n): ");
        int n = sc.nextInt();

        System.out.println("\nArithmetic Progression (AP):");
        for (int i = 1; i <= n; i++) {
            System.out.print((a + (i - 1) * d) + " ");
        }

        System.out.println("\n\nGeometric Progression (GP):");
        for (int i = 1; i <= n; i++) {
            System.out.print((int)(g * Math.pow(r, i - 1)) + " "); //typecasting can be seen here
        }

        sc.close();
    }
}
