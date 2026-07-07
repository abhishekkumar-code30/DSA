import java.util.Scanner;

public class GreatestOfThree {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter three numbers:");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if (a > b) {
            if (a > c) {
                System.out.println("Greatest is A: " + a);
            } else {
                System.out.println("Greatest is C: " + c);
            }
        } else {
            if (b > c) {
                System.out.println("Greatest is B: " + b);
            } else {
                System.out.println("Greatest is C: " + c);
            }
        }
        sc.close();
    }
}