import java.util.*;
public class Difference{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int num=13;
        int dif=2;
        int[] arr={12,3,12,56,77,13};
        PrintDifference(arr,num,dif);
    }
    private static void PrintDifference(int[] arr,int num,int dif){
        for(int i=0;i<arr.length;i++){
            int ele = Math.abs(arr[i]-num);
            if(ele<=dif){
                System.out.println(arr[i]);
            }
            else{
                continue;
            }
        }
    }
}