//Write a JAVA program to copy all elements from an array to another array. 
import java.util.Arrays;
import java.util.Scannner;
  class CopyArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr1 = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr1[i] = scanner.nextInt();
        }
        int[] arr2 = new int[size];
        for (int i = 0; i < size; i++) {
            arr2[i] = arr1[i];
        }
        System.out.println("Original array: " + Arrays.toString(arr1));
        System.out.println("Copied array: " + Arrays.toString(arr2));
    }
}
