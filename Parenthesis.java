import java.util.*;
public class Parenthesis{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the String:\n ");
        String s = sc.nextLine();
        String res = validCheck(s);
        System.out.println("Result: " + res);
        sc.close();
    }
    private static String validCheck(String string){
        Stack<Integer> stack = new Stack<>(); 
        StringBuilder s=new StringBuilder(string);
        for(int i=0;i<string.length();i++){
            char c = s.charAt(i);
            if(c=='('){
                stack.push(i);
            }
            else if(c==')'){
                if(!stack.isEmpty()){
                stack.pop();
                }
                else{
                    s.setCharAt(i, '*');
                }
            }
        }
            while(!stack.isEmpty()){
                s.setCharAt(stack.pop(), '*');
            }
            StringBuilder result = new StringBuilder();
            for(int j= 0; j < s.length(); j++){
                char ch = s.charAt(j);
                if(ch!='*'){
                    result.append(ch);
                }
            }
        
        return result.toString();
    }
}