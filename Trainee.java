import java.util.*;
public class Trainee{
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        int trainee1 = 0;
        int trainee2 = 0;
        int trainee3 = 0;
        System.out.println("Enter the trainee measures: ");
        int[][] arr = new int[3][3];
        for(int i=0; i<arr[0].length; i++){
            for(int j=0; j<arr[1].length; j++){
                int value = sc.nextInt();
                if(value<1 || value>100){
                    System.out.println("Invalid input");
                }
                arr[i][j] = value;
            }
        }
        for(int i=0;i<arr.length;i++){
            trainee1 = trainee1 + arr[i][0];
            trainee2 = trainee2 + arr[i][1];
            trainee3 = trainee3 + arr[i][2];
            if(i==arr.length-1){
                trainee1 = trainee1/3;
                trainee2 = trainee2/3;
                trainee3 = trainee3/3;
            }
        }
        System.out.println(trainee1);
        System.out.println(trainee2);
        System.out.println(trainee3);
        if((trainee1 > trainee2) && (trainee1 > trainee3)){
            System.out.print("Trainee number: 1");
        }
        else if((trainee2 > trainee1) && (trainee2 > trainee3)){
            System.out.print("Trainee number: 2");
        }
        else if((trainee3 > trainee2) && (trainee3 > trainee1)){
            System.out.print("Trainee number: 3");
        }
        else if((trainee1 == trainee2)){
            if(trainee1 == trainee3){
                System.out.print("Trainee number: 1+6");
            }
        }
    }
}