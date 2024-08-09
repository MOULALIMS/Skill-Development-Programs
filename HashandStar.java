import java.util.*;
public class HashandStar{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String string =sc.nextLine();
        String check = countingSymbols(string);
        System.out.println("Result: " + check);
        sc.close();
    }
    private static String countingSymbols(String string){
        int hashcount=0;
        int starcount=0;
        String s=null;
        for(int i=0;i<string.length();i++){
            char ch=string.charAt(i);
            if(ch=='#'){
                hashcount++;
            }
            else if(ch=='*'){
                starcount++;
            }
            else{
                continue;
            }
        }
        if(hashcount>starcount){
            s="Negative integer";
        }
        else if(starcount>starcount){
            s="Positive integer";
        }
        else{
            s="0";
        }
        return s;
    }
}