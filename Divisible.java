import java.util.*;
public class Divisible{
    public static void main(String[] args){
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter n: ");
        int n = sc.nextInt();
        System.out.println("Enter m: ");
        int m = sc.nextInt();
        int res = diffCheck(n,m);
        System.out.println("Result: "+ res);
        sc.close();
    }
    private static int diffCheck(int n,int m){
        int div = 0;
        int ndiv = 0;
        for(int i=0;i<=m;i++){
            if(i%n == 0){
                div+=i;
            }
            else{
                ndiv+=i;
            }
        }
        return ndiv - div;
    }
}