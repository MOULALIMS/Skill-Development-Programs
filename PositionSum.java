import java.util.*;
public class PositionSum{
    static Scanner sc = new Scanner(System.in);
    //3,4,1,5,7,9,8,3,0,11
    //odd positions - second smaller - 3,1,7,8,0 -- 7
    //even positions - second larger - 4,5,9,3,11 -- 9
    public static void main(String[] args){
        System.out.println("enter n: ");
        int n = sc.nextInt();
        if(n<=3 || n==0){
            System.out.println("0");
        }else{
        int arr[] = new int[n];
        arr = ArrayElement(n);
        int odd = findoddSum(arr);
        System.out.println("second smallest in odd position: "+odd);
        int even = findevenSum(arr);
        System.out.println("second largest in even position: "+even);
        int sum = odd+even;
        System.out.println("\nResult: "+sum);
        }
    }
    private static int findevenSum(int[] arr) {
        int evensecondlargest = arr[0];
        for(int i=0;i<arr.length;i+=2){
            for(int j=0;j<arr.length-i-2;j+=2){
                if(arr[j]>arr[j+2]){
                    int temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
                else{
                    continue;
                }
            }
        }
        for(int i:arr){
            System.out.print(i+" ");
        }
        evensecondlargest=arr[arr.length-4];
        return evensecondlargest;
    }
    private static int findoddSum(int[] arr){
        int oddsecondsmallest = arr[1];
        for(int i=1;i<arr.length;i+=2){
            for(int j=1;j<arr.length-i-1;j+=2){
                    if(arr[j]<arr[j+2]){
                        int tem = arr[j];
                        arr[j] = arr[j+2];
                        arr[j+2] = tem;
                    }
            }
        }
        oddsecondsmallest = arr[arr.length-3];
        for(int i:arr){
            System.out.print(i+" ");
        }
        return oddsecondsmallest;
    }
    private static int[] ArrayElement(int n){
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            System.out.print("enter element at position "+ i+": ");
            arr[i] =sc.nextInt();
        }
        return arr;
    }
}