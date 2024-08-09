import java.util.*;
//input string of length n,it should contain numbers and hyphens
//resuls string should have these hyphens to be located at first and followed by rest of string
class Hyphens {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.println("Enter String: ");
        String s = sc.nextLine();
        String res = Removehyphens(s);
        System.out.print("Resulted String : "+ res);
    }
    private static String Removehyphens(String s){
        char[] arr = s.toCharArray();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='-'){
                for(int j=i;j>0;j--){
                    arr[j]=arr[j-1];
                }
                arr[0]='-';
            }
            else{
                continue;
            }
        }
        return new String(arr);
    }
}