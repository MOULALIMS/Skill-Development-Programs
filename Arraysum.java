import java.util.*;
public class Arraysum{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter target value: ");
        int target = sc.nextInt();
        System.out.println("Enter size of array: ");
        int size = sc.nextInt();
        System.out.println("Enter element: ");
        int[] arr = new int[size];
        for(int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        }
        checkValues(arr,target);
        sc.close();
    }
    private static void checkValues(int[] arr,int target){
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]+arr[j]==target){
                    System.out.println(arr[i]+ " & " +arr[j]);
                }
                else{
                    continue;
                }
            }
        }
    }
}