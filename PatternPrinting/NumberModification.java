package PatternPrinting;
import java.util.Scanner;

public class NumberModification {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int number = scan.nextInt();

        BinaryTriangle.print(number);
        System.out.print("=======================\n");
        NumberCrown.print(number);
        System.out.print("=======================\n");
        FloydsTriangle.print(number);

        scan.close();
    }
}

//======================
// Binary Triangle
//======================

class BinaryTriangle{
    public static void print(int n) {
        for(int i=1;i<=n;i++){
            for(int j=i;j>0;j--){
                if(j%2==1){
                    System.out.print("1");
                }
                else{
                    System.out.print("0");
                }
            }
            System.out.print("\n");
        }
    }
}

//===================================
//The standard industry practice

// class BinaryTriangle{
//     public static void print(int n) {
//         for(int i=1; i<=n; i++){
//             for(int j=1; j<=i; j++){
//                 if((i + j) % 2 == 0){
//                     System.out.print("1");
//                 }
//                 else{
//                     System.out.print("0");
//                 }
//             }
//             System.out.println();
//         }
//     }
// }
//===================================

//======================
// Number Crown
//======================

class NumberCrown{
    public static void print(int n) {
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            for(int k=0;k<=2*(n-i)-1;k++){
                System.out.print(" ");
            }
            for(int z=i;z>0;z--){
                System.out.print(z);
            }
            System.out.print("\n");
        }
    }
}

//======================
// Floyd's Triangle
//======================

class FloydsTriangle{
    public static void print(int n) {
        int count=1;
        for(int i=0;i<n;i++){
            for(int j=0;j<=i;j++){
                System.out.print(count+" ");
                count++;
            }
            System.out.print("\n");
        }
    }
}