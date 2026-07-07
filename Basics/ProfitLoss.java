import java.util.Scanner;

public class ProfitLoss {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Cost Price: ");
        int cp = sc.nextInt();
        System.out.print("Enter Selling Price: ");
        int sp = sc.nextInt();
        
        // else-if ladder for mutually exclusive conditions
        if (sp > cp) {
            System.out.println("Profit of: " + (sp - cp));
        } else if (cp > sp) {
            System.out.println("Loss of: " + (cp - sp));
        } else {
            System.out.println("No Profit No Loss (Break-Even)");
        }
        sc.close();
    }
}