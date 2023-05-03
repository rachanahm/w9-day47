//Write a JAVA program to count total number of even and odd elements in an array. 
import java.util.Scanner;
class Program5{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.print("Enter the elements of the array: ");
        for (int i = 0; i < size; i++) {
            arr[i] = scanner.nextInt();
        }
        int evenCount = 0, oddCount = 0;
        for (int i = 0; i < size; i++) {
            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }
        System.out.println("Total even elements in the array: " + evenCount);
        System.out.println("Total odd elements in the array: " + oddCount);
    }
}
