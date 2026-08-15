package PatternPrinting;
import java.util.Scanner;

public class AdvancedShapes {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter your number : ");
        int number = scan.nextInt();

        SymmetricVoid.print(number);
        System.out.print("=======================\n");
        ButterflyStar.print(number);
        System.out.print("=======================\n");
        HollowSquare.print(number);
        System.out.print("=======================\n");
        ConcentricDistanceMatrix.print(number);

        scan.close();
    }
}

//======================
// Symmetric Void
//======================

class SymmetricVoid{
    public static void print(int n){

    }
}

//======================
// Butterfly Star
//======================

class ButterflyStar{
    public static void print(int n){
        
    }
}

//======================
// Hollow Square
//======================

class HollowSquare{
    public static void print(int n){
        
    }
}

//======================
// Concentric Distance Matrix
//======================

class ConcentricDistanceMatrix{
    public static void print(int n){
        
    }
}