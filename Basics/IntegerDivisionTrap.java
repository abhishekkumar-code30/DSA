public class IntegerDivisionTrap {
    public static void main(String[] args) {
        // Integer division truncates the decimal
        int intResult = 5 / 2; 
        System.out.println("5 / 2 (Integer) = " + intResult); 
        
        // At least one operand must be a double for a precise result
        double doubleResult = 5.0 / 2;
        System.out.println("5.0 / 2 (Double) = " + doubleResult); 
    }
}