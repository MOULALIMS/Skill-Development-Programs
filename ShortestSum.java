import java.util.*;
//Given an array of integers, we need to make two shortest numbers from them
//split array by half and asign new arr or int by their indices 
public class ShortestSum {
    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int arr[] = {6, 8, 4, 5, 2, 3};
        System.out.print("\nOriginal Array: ");
        for (int n : arr) {
            System.out.print(n + " ");
        }
        int sorted[] = sortArray(arr);
        System.out.print("\nSorted Array: ");
        for (int num : sorted) {
            System.out.print(num + " ");
        }
        int[][] arrays = Numberselect(sorted);
        System.out.println();
        int[] arr1 = arrays[0];
        int[] arr2 = arrays[1];
        for (int n1 : arr1) {
            System.out.print(n1 + " ");
        }
        System.out.println();
        for (int n2 : arr2) {
            System.out.print(n2 + " ");
        }
        System.out.println("Result: ");
        int res = ResultedSum(arr1, arr2);
        System.out.println("Sum: " + res);
    }

    private static int[] sortArray(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        return arr;
    }

    private static int[][] Numberselect(int[] sorted) {
        int[][] arrays = new int[2][3];
        int k = 0, m = 0;
        for (int i = 0; i < sorted.length; i++) {
            if (i % 2 == 0) {
                arrays[0][k] = sorted[i];
                k++;
            } else {
                arrays[1][m] = sorted[i];
                m++;
            }
        }
        return arrays;
    }

    private static int ResultedSum(int[] arr1, int[] arr2) {
        int num1 = arrayToInt(arr1);
        int num2 = arrayToInt(arr2);
        return num1 + num2;
    }

    private static int arrayToInt(int[] arr) {
        int result = 0;

        for (int i = 0; i < arr.length; i++) {
            result = result * 10 + arr[i];
        }

        return result;
    }
}
