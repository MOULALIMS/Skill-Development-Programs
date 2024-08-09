/*You are required to input the size of the array then the elements of array, then you have to divide the main array in two sub array (even and odd) in such a way that element at 0 index will be considered as even and element at 1st index will be considered as odd and so on. then you have sort the even and odd matrices in ascending order then print the sum of second largest number from both the matrices
Example
•	enter the size of array : 5
•	enter element at 0 index : 3
•	enter element at 1 index : 4
•	enter element at 2 index : 1
•	enter element at 3 index : 7
•	enter element at 4 index : 9
Sorted even array : 1 3 9
Sorted odd array : 4 7
Output: 10*/
import java.util.*;
public class PositionAddsec{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("enter the size of array : ");
        int size = sc.nextInt();
        int[] arr = new int[size];
        for(int i=0; i<size; i++){
            arr[i] = sc.nextInt();
        }
        int even=0;
        int odd=0;
        if(arr.length%2==0){
            even= arr.length/2;
            odd= arr.length/2;
        }
        else{
            even= (arr.length/2)+1;
            odd = arr.length/2;
        }
        int j=0,k=0;
        int[] evenarray = new int[even];
        int[] oddarray = new int[odd];
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                evenarray[j++]=arr[i];
            }
            else{
                oddarray[k++]=arr[i];
            }
        } 
        Arrays.sort(evenarray);
        Arrays.sort(oddarray);
        int max = evenarray[evenarray.length-2];
        int min = oddarray[oddarray.length-2];
        int sum=max+min;
        System.out.println("Sum: "+sum);       
    }
}