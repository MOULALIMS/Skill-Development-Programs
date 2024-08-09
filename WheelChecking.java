import java.util.*;
public class WheelChecking{
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter v: \n");
        int v = scanner.nextInt();
        System.out.print("Enter w: \n");
        int w = scanner.nextInt();

        if(w<2 || w%2!=0 || v>=w){
            System.out.println("Invalid input");
        }
        int tw = (v*4-w)/2;
        int fw = v - tw;
        System.out.println("Four wheeler: " + fw );
        System.out.println("Two wheeler: " + tw);
    }
}