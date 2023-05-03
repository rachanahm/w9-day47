//Write a JAVA program to count total number of negative elements in an array.
import java.util.Scanner;

 class Program6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int negativeCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] < 0) {
                negativeCount++;
            }
        }
        System.out.println("Total negative elements in the array: " + negativeCount);
    }
}
