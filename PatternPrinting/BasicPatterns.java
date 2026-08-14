package PatternPrinting;
import java.util.Scanner;

public class BasicPatterns {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scan.nextInt();

        SquarePattern.printSquare(number);
        System.out.print("=======================\n");
        StarTriangle.printStarTriangle(number);
        System.out.print("=======================\n");
        NumberTriangle.printNumberTriangle(number);
        System.out.print("=======================\n");
        RepeatingTriangle.printRepeatingTriangle(number);
        System.out.print("=======================\n");
        

        scan.close();
    }    
}

//======================
// Square Patten
//======================

class SquarePattern{
    public static void printSquare(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Star Triangle
//======================

class StarTriangle{
    public static void printStarTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("* ");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Number Triangle
//======================

class NumberTriangle{
    public static void printNumberTriangle(int n){
        for(int i=0;i<n;i++){
            for(int j=1;j<=i+1;j++){
                System.out.print(j);
            }
            System.out.print("\n"); 
        }
    }
}

//======================
// Repeating Triangle
//======================

class RepeatingTriangle{
    public static void printRepeatingTriangle(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i);
            }
            System.out.print("\n");
        }
    }
}