import java.util.*;
/*For low level water, the time estimate is 25 minutes, where approximately weight is between 2000 grams or any nonzero positive number below that.
For medium level water, the time estimate is 35 minutes, where approximately weight is between 2001 grams and 4000 grams.
For high level water, the time estimate is 45 minutes, where approximately weight is above 4000 grams.
Assume the capacity of machine is maximum 7000 grams
Where approximately weight is zero, time estimate is 0 minutes.
Write a function which takes a numeric weight in the range [0,7000] as input and produces estimated time as output is: “OVERLOADED”, and for all other inputs, the output statement is
“INVALID INPUT”.
Input should be in the form of integer value –
Output must have the following format –
Time Estimated: Minutes
Example:
Input value
2000
Output value
Time Estimated: 25 minutes
*/
public class Washing {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.print("Enter the weight: \n");
        int weight = scanner.nextInt();
        CheckLevel(weight);
    }
    private static void CheckLevel(int weight){
        if(weight==0){
            System.out.println("Time Estimated: 0 minutes");
        }
        else if(weight>0 && weight<=2000){
            System.out.println("Time Estimated: 25 minutes");
        }
        else if(weight>=2001 && weight<4000){
            System.out.println("Time Estimated: 35 minutes");
        }
        else if(weight>=4000 && weight<=7000){
            System.out.println("Time Estimated: 45 minutes");
        }
        else{
            System.out.println("OVERLOAD");
        }
    }
}
