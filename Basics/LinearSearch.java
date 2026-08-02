public class LinearSearch {
    public static void main(String[] args) {
        int[] arr = {10,20,30,40,50,60,70};
        int key = 50;

        int index = linearSearch(arr,key);

        if(index != -1){
            System.out.println("Element found at : "+index);
        }
        else{
            System.out.println("Element not found");
        }
    }
    public static int linearSearch(int[] arr, int key){
        for(int i=0; i < arr.length; i++){
            if(arr[i]==key){
                return i;
            }
        }
        return -1;
    }
}
