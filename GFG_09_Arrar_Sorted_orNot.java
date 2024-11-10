/*
Given an array arr[], check whether it is sorted in non-decreasing order. Return true if it is sorted otherwise false.

Examples:

Input: arr[] = [10, 20, 30, 40, 50]
Output: true
Explanation: The given array is sorted.

 */


public class GFG_09_Arrar_Sorted_orNot {
/*
    Naive approach TC n^2
    public static boolean arraySortedOrNot(int arr[]){
        int n= arr.length;
        for(int i =0; i<n-1; i++){
            for(int j =i+1;j<n;j++){
                if(arr[j]<arr[i]){
                    return false;
                }
            }
        }
        return true;
    }

 */


//    Efficent apprach
    public static boolean arraySortedOrNot(int arr[]){
        int n= arr.length;
        for(int i=1;i<n;i++){
            if(arr[i]<arr[i-1]){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int []arr={10, 20, 30, 40, 50};
        System.out.println(arraySortedOrNot(arr));
    }
}
