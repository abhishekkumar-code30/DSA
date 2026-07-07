import java.util.Scanner;

public class AbsoluteValue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        if (n < 0) {
            n = -n; 
        }
        
        System.out.println("The absolute value is: " + n);
        sc.close();
    }
}