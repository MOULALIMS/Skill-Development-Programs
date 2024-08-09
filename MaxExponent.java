import java.util.*;
public class MaxExponent{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a: ");
        int a = sc.nextInt();
        System.out.print("Enter b: ");
        int b = sc.nextInt();
        int res = findExponent(a, b);
        System.out.print("Result: "+res);
        sc.close();
    }   
    private static int findExponent(int a, int b){
        int max=0;
        int num=0;
        for(int i=a;i<=b;i++){
            if(i%2==0){
                int temp =count(i);
                if(temp>max){
                    max=temp;
                    num=i;
                }
            }
        }
        return num;
    }
    private static int count(int i){
        int e=0;
        while(i%2==0 && i!=0){
            e++;
            i/=2;
        }
        return e;
    }
        
}