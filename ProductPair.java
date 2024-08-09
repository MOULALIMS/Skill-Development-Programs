import java.util.*;
public class ProductPair{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\n sum: ");
        int sum = sc.nextInt();
        System.out.print("\n size of Array= ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        arr = arrayEntry(size);
        elementSum(arr,sum);
    }
    private static void elementSum(int[] arr, int sum) {
        if(arr.length<=2){
            System.out.println("-1");
        }
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr.length-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
            if(arr[i]+arr[i+1]<=sum){
                System.out.println(arr[i]*arr[i+1]);
                break;
            }
        }
        }
    }
    private static int[] arrayEntry(int size) {
        int array[] = new int[size];
        for(int i = 0; i < size; i++){
            System.out.print("enter element at position " + i + ": ");
            array[i] = sc.nextInt();
        }
        return array;
    }
}