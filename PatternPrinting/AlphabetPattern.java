package PatternPrinting;
import java.util.Scanner;

public class AlphabetPattern {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scan.nextInt();

        LetterTriangle.print(number);
        System.out.print("=======================\n");
        InvertedLetterTriangle.print(number);
        System.out.print("=======================\n");
        AlphaRamp.print(number);
        System.out.print("=======================\n");
        AlphaHill.print(number);
        System.out.print("=======================\n");
        ReverseAlpha.print(number);

        scan.close();
    }
}

//======================
// Letter Triangle
//======================

class LetterTriangle {
    public static void print(int n) {
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + i; ch++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Inverted Letter Triangle
//======================

class InvertedLetterTriangle{
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = 'A'; ch <= 'A' + (n - i - 1); ch++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Alpha-Ramp
//======================

class AlphaRamp{
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            char ch = (char) ('A' + i);
            for (int j = 0; j <= i; j++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Alpha-Hill
//======================

class AlphaHill{
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" ");
            }

            char ch = 'A';
            int breakpoint = (2 * i + 1) / 2;
            for (int j = 1; j <= 2 * i + 1; j++) {
                System.out.print(ch);
                if (j <= breakpoint) ch++;
                else ch--;
            }
            System.out.print("\n");
        }
    }
}

//======================
// Reverse-Alpha
//======================

class ReverseAlpha{
    public static void print(int n){
        for (int i = 0; i < n; i++) {
            for (char ch = (char) ('A' + n - 1 - i); ch <= 'A' + n - 1; ch++) {
                System.out.print(ch + " ");
            }
            System.out.print("\n");
        }
    }
}
