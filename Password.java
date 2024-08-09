import java.util.*;
class Password{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter Password: \n");
        String password = sc.nextLine();
        int isvalid = CheckPassword(password);
        System.out.println(isvalid);

    }
    private static int CheckPassword(String password) {
        if(password.length()<4){
            return 0;
        }
        boolean startnum = Character.isDigit(password.charAt(0));
        boolean digitvalue = false;
        boolean capital = false;
        boolean space = false;

        for(char c:password.toCharArray()){
            if(Character.isDigit(c)){
                digitvalue = true;
            }
            else if(c>='A' && c<='Z'){
                capital = true;
            }
            else if(c==' ' || c=='/'){
                space = true;
            }else{
                continue;
            }
        }
        if(startnum && digitvalue && capital && !space){
            return 1;
        }
        else{
            return 0;
        }
    }
}