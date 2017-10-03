import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] values = getIntegers(5);
        sortIntegers(values);
        printArray(values);
    }

    //get integer array from user input
    public static int[] getIntegers(int number) {
        int[] values = new int[number];
        System.out.println("Enter " + number + " integer values.\r");

        for(int i = 0; i<number; i++) {
            values[i] = scanner.nextInt();
        }

        return values;
    }

    //print the elements in the array
    private static void printArray(int[] array) {
        for(int i = 0; i<array.length; i++) {
            System.out.println("Value " + i + ": " + array[i]);
        }
    }

    //Sort integer array in descending order using Insertion Sort algorithm
    private static int[] sortIntegers(int[] array) {
        for(int j = 1; j<array.length; j++) {
            int key = array[j];
            int i = j-1;
            while(i>=0 && array[i] < key) {
                array[i+1] = array[i];
                i--;
            }
            array[i+1] = key;
        }

        return array;
    }
}
