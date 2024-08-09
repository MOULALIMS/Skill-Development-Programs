import java.util.*;
public class Carry{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter num1: \n");
        int num1 = sc.nextInt();
        System.out.print("Enter num2: \n");
        int num2 = sc.nextInt();
        int res = noOfCarry(num1, num2);
        System.out.println("Result: " + res);
    }
    private static int noOfCarry(int num1, int num2){
        int count = 0;
        int carry = 0;
        while(num1!=0 || num2!=0){
            int n1 = num1%10;
            int n2 = num2%10;
            int sum = n1+n2+carry;
            if(sum>=10){
                count++;
                carry = 1;
            }
            else{
                carry = 0;
            }
            num1 = num1/10;
            num2 = num2/10;
        }
        return count;
    }
}