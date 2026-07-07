import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        // Nested logic: Logical elimination without using &&
        if (a > b) {
            // We mathematically know a is bigger than b here
            if (a > c) {
                System.out.println("Greatest is A: " + a);
            } else {
                System.out.println("Greatest is C: " + c);
            }
        } else {
            // We mathematically know b is bigger than or equal to a here
            if (b > c) {
                System.out.println("Greatest is B: " + b);
            } else {
                System.out.println("Greatest is C: " + c);
            }
        }
        sc.close();
    }
}