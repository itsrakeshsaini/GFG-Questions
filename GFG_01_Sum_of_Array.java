//Problem Name - Sum of Array

//You are given an integer array arr[]. The task is to find the sum of it.
//
//        Examples:
//
//Input: arr[] = [1, 2, 3, 4]
//Output: 10
//Explanation: 1 + 2 + 3 + 4 = 10.
//Input: arr[] = [1, 3, 3]
//Output: 7
//Explanation: 1 + 3 + 3 = 7.
//Expected Time Complexity: O(n)
//Expected Auxiliary Space: O(1)


public class GFG_01_Sum_of_Array {

//    In gfg only use "sum" function no need to add main function.
    public static int sum(int arr[]) {
        int res=0;
        for(int i=0; i<arr.length;i++){
            res = res+arr[i];
        }
        return res;

    }
    public static void main(String[] args) {
//
        int []arr = {1,2,3,4};
        int result= sum(arr);
        System.out.println(result);
    }
}
