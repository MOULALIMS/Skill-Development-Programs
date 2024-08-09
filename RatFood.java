import java.util.*;

//rat = 7 , unit = 2, houses = 8 
class RatFood {
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("No of houses required: \n");
        int row = sc.nextInt();
        int col = sc.nextInt();
        int[][] asignedarr = Enterelement(row,col);
        System.out.print("enter no of rats: ");
        int limit = sc.nextInt();
        System.out.print("Available food: ");
        int available = sc.nextInt();
        limit = limit*available;
        int required = LimitedSet(asignedarr,limit);
        System.out.println("It can be alloted to houses : "+ required);
    }
    public static int[][] Enterelement(int row,int col){
        int arr[][] = new int[row][col];
        System.out.print("Enter the capacity of each house \n");
        for(int i=0;i<row;i++){
            for(int j=0;j<col;j++){
                System.out.print("Element at position "+ i + " and " + j+" : ");
                int ele = sc.nextInt();
                arr[i][j] = ele;
            }
        }
        return arr;
    }
    private static int LimitedSet(int[][] arr,int limit){
        int sum=0;
        int count=0;
        for(int i=0;i<arr.length;i++){
            for(int j=0;j<arr[i].length;j++){
                sum+=arr[i][j];
                if(sum<=limit){
                    count+=1;
                }
                else{
                    sum-=arr[i][j];
                    break;
                }
            }
            if(sum>limit){
                break;
            }
        }
        return count;
    }
}