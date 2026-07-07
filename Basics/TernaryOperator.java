import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        // Syntax: condition ? valueIfTrue : valueIfFalse
        // Cleanly assigning a value based on a condition
        String result = (n % 2 == 0) ? "Even" : "Odd";
        
        System.out.println("The number is " + result);
        sc.close();
    }
}