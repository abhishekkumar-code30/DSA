public class CharToAscii {
    public static void main(String[] args) {
        char ch = 'A';
        
        // Explicit type casting from char to int
        int asciiValue = (int) ch; 
        
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);
    }
}