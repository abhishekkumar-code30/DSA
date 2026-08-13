package PatternPrinting;

public class BasicPatterns {
    public static void main(String[] args) {
        SquarePattern.printSquare(5);
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