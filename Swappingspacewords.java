import java.util.*;
//given a string of words where each word is seperated by spaces
//we need to swap first and last elements in each word
public class Swappingspacewords {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String string = "hello my name is moulali";
        String res = Swappingword(string);
        System.out.println(res);
    }
    private static String Swappingword(String string){
        String[] words = string.split(" ");
        
        for(int i=0;i<words.length;i++){
            char[] c=words[i].toCharArray();
            if(c.length>1){
                char temp = c[0];
                c[0] = c[c.length-1];
                c[c.length-1]=temp;
            }
            words[i]=new String(c);
        }
        return String.join(" ",words);
    }
}
