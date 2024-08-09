import java.util.*;
public class DivisileByTwoNum {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("\n enter m: ");
        int m = sc.nextInt();
        System.out.print("\n enter n: ");
        int n = sc.nextInt();
        int res = findResult(m, n);
        System.out.println("Result: " + res);
    }
    private static int findResult(int m, int n){
        int count=0;
        for(int i=m;i<n;i++){
            if(i%3==0 && i%5==0){
                count+=i;
            }
        }
        return count;
    }
}