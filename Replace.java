import java.util.*;
public class Replace{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string = sc.nextLine();
        string = string.toLowerCase();
        char[] arr = string.toCharArray();
        System.out.println("Enter first char: ");
        char ch1 = sc.next().charAt(0);
        System.out.println("Enter second char: ");
        char ch2 = sc.next().charAt(0);
        Replace replace = new Replace();
        String res = replace.replaceChar(arr, ch1, ch2);
        System.out.println("Result: " + res);
        sc.close();
    }
    private String replaceChar(char[] arr, char ch1, char ch2){
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == ch1){
                arr[i] = ch2;
            }
            else if(arr[i] == ch2){
                arr[i] = ch1;
            }
        }
        return new String(arr);
    }
}