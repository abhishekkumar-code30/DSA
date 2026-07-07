public class CharToAscii {
    public static void main(String[] args) {
        char ch = 'A';
        
        int asciiValue = (int) ch; //type casting char to int
        
        System.out.println("Character: " + ch);
        System.out.println("ASCII Value: " + asciiValue);
    }
}