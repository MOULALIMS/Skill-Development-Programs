import java.util.*;
public class Notation{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter n value: \n");
        int n  = sc.nextInt();
        System.out.print("Enter the num value: \n");
        int num = sc.nextInt();
        String result = findQuotient(n, num);
        System.out.println("Result: " + result);
    }
    private static String findQuotient(int n, int num) {
        StringBuilder string = new StringBuilder();
        while(num!=0){
            int ele = num%n;
            string.insert(0, characterSelect(ele));
            num/=n;
        }
        return string.toString();
    }
    private static char characterSelect(int num){
        if(num>9){
            return (char)(num-9+64);
        }
        else{
            return (char)(num+'0');
        }

    }
}