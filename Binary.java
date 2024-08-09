import java.util.*;
public class Binary{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Binary number: \n");
        String binary = sc.nextLine();
        String result = CheckValidate(binary);
        System.out.println(result);
        sc.close();
    }
    private static String CheckValidate(String binary){
        StringBuilder s=new StringBuilder();
        for(int i=0; i<binary.length(); i++){
            char c=binary.charAt(i);
            if(i==0 || i==binary.length()-1){
                s.append(c);
            }
            else{
            char left = binary.charAt(i-1);
            char right = binary.charAt(i+1);
            int leftbit = left-'0';
            int rightbit = right-'0';
            switch(c) {
                case 'A':
                    s.append(leftbit&rightbit);
                    break;
                case 'B':
                    s.append(leftbit|rightbit);
                    break;
                case 'C':
                    s.append(leftbit^rightbit);
                    break;
                default:
                    s.append(c);
                    break;
            }
        }
        }
        return s.toString();
    }
}