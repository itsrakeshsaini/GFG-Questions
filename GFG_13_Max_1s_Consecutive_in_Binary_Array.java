/*
Given a binary array, find the count of a maximum number of consecutive 1s present in the array.

Examples :

Input: arr[] = {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1}
Output: 4
Explanation: The maximum number of consecutive 1’s in the array is 4 from index 8-11.




 */
public class GFG_13_Max_1s_Consecutive_in_Binary_Array {

    public static int maxConsOnes(int []arr){
        int count=0;
        int res=0;
//        for(int i=0;i< arr.length;i++){
//            if(arr[i]==1){
//                count++;
//                res= Math.max(res, count);
//            }else {
////                res= Math.max(res, count);
//                count=0;
//            }
//
//        }

        for(int i=0;i< arr.length;i++){
            if(arr[i]==0){
                count=0;
            }else {
                count++;
                res= Math.max(res, count);
            }

        }
        return res;
    }

    public static void main(String[] args) {
        int []arr= {1, 1, 0, 0, 1, 0, 1, 0, 1, 1, 1, 1};
        System.out.println(maxConsOnes(arr));
    }
}
