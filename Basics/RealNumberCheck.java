import java.util.Scanner;

public class RealNumberCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a real number (e.g., 7.5 or 7.0): ");
        double n = sc.nextDouble();
        
        // Subtracting the casted integer from the original double
        if (n - (int)n == 0) {
            System.out.println("This is a whole integer.");
        } else {
            System.out.println("This has a fractional part.");
        }
        sc.close();
    }
}