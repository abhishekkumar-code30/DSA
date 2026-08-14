package PatternPrinting;
import java.util.Scanner;

public class PyramidsAndDiamonds {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();

        StarPyramid.print(number);
        System.out.print("=======================\n");
        InvertedPyramid.print(number);
        System.out.print("=======================\n");
        FullDiamond.print(number);
        System.out.print("=======================\n");
        HalfDiamond.print(number);

        scan.close();
    }
}

//======================
// Star Pyramid
//======================

class StarPyramid{
    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Inverted Pyramid
//======================

class InvertedPyramid{
    public static void print(int n){
        for(int i=n;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}

//======================
// Full Diamond
//======================

class FullDiamond{
    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=n-i-1;j>0;j--){
                System.out.print(" ");
            }
            for(int k=0;k<2*i+1;k++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=n-1;i>0;i--){
            for(int j=0;j<n-i;j++){
                System.out.print(" ");
            }
            for(int k=2*i-1;k>0;k--){
                System.out.print("*");
            }
            System.out.print("\n");
        }   
    }
}

//======================
// HalfDiamond
//======================

class HalfDiamond{
    public static void print(int n){
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        for(int i=n-1;i>0;i--){
            for(int j=i;j>0;j--){
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}