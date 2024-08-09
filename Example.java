public class Example {
    public static void main(String[] args) {
        int[] arr = {3, 1, 7, 8, 0};
        int evenSecondLargest = findEvenSecondLargest(arr);
        System.out.println("Second largest even number: " + evenSecondLargest);
    }

    private static int findEvenSecondLargest(int[] arr) {
        int evensecondlargest = arr[0];
        for(int i=0;i<arr.length;i+=2){
            for(int j=0;j<arr.length-i-2;j+=2){
                if(arr[j]>arr[j+2]){
                    int temp=arr[j];
                    arr[j]=arr[j+2];
                    arr[j+2]=temp;
                }
                else{
                    continue;
                }
            }
        }
        evensecondlargest=arr[arr.length-1];
        return evensecondlargest;
    }
}
