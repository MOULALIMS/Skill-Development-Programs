import java.util.*;
//we need to check for each element in array if next element is bigger then we need to 
//print it if no bigger number is available return -1
public class Greatest {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] arr = {4,6,3,2,8,1,5};
        int[] res = Sortedresult(arr);
        for(int n:res){
            System.out.print(n+" ");
        }
    }
    private static int[] Sortedresult(int[] arr){
        int[] res=new int[arr.length];
        for(int i=0;i<arr.length;i++){
            if(i!=arr.length-1){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    res[i]=arr[j];
                    break;
                }
                else{
                    res[i]=-1;
                }
            }
            }
            else{
                res[i]=-1;
            }
        }
        res[arr.length-1]=-1;
        return res;
    }
}
