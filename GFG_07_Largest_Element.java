/*
Given an array arr[]. The task is to find the largest element and return it.

Examples:

Input: arr = [1, 8, 7, 56, 90]
Output: 90
Explanation: The largest element of the given array is 90.

 */



public class GFG_07_Largest_Element {

    public static int largest(int []arr){

        /*
        Naive Solution--
        int n = arr.length;
        boolean flag=true;
        for(int i=0 ; i<n;i++){
            flag =true;
            for (int j=0; j<n;j++){
                if(arr[j]>arr[i]){
                    flag=false;
                    break;
                }
            }
            if(flag==true ){
                return arr[i];
            }
        }
        return -1;

         */


//        Efficient Solution--
        int res=0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]>arr[res]){
                res=i;
            }
        }
        return arr[res];

    }
    public static void main(String[] args) {
        int []arr= {10, 5, 20, 6};
        System.out.print(largest(arr));
    }
}
