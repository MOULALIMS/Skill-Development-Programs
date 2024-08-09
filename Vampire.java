import java.util.*;
public class Vampire{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter number of people: \n");
        int n = sc.nextInt();
        int[] arr = buildingArray(n);
        arr = sortedArray(arr);
        for(int i:arr){
            System.out.print(i+" ");
        }
        int power = checkLevel(arr,n);
        System.out.println("Max power: " + power);
    }
    private static int[] buildingArray(int n){
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            System.out.print("Enter person " + (i+1) + " Blood level: ");
            arr[i] = sc.nextInt();
        }
        return arr;
    }
    private static int checkLevel(int[] arr,int n){
        int demon = 0;
        int stephan = 0;
        for(int i=0;i<arr.length;i++){
            demon+=arr[i];
        }
        int j=n-1;
        while(stephan<demon){
            stephan+=arr[j];
            demon-=arr[j];
            j--;
        }
        return stephan;
    }
    private static int[] sortedArray(int[] arr){
        int n=arr.length;
        for(int i=0; i<n-1; i++){
            for(int j=0; j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}