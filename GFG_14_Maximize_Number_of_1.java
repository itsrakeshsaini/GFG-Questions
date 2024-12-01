/*


Given a binary array arr[] (containing only 0s and 1s) and an integer k, you are allowed to flip at most k 0s to 1s. Find the maximum number of consecutive 1's that can be obtained in the array after performing the operation at most k times.

Examples:

Input: arr[] = [1, 0, 1], k = 1
Output: 3
Explanation: Maximum subarray of consecutive 1's is of size 3 which can be obtained after flipping the zero present at the 1st index.

 */

public class GFG_14_Maximize_Number_of_1 {
//    public static int maxOne(int []arr, int k){
//        int n= arr.length;
//        int maxlen=0;
//
//        for(int i=0; i<n;i++){
//            int curr=k;
//            int res=0;
//            for(int j=i;j<n;j++){
//                if(arr[j]==1){
//                    res++;
//                    maxlen= Math.max(maxlen, res);
//                }
//                else if(arr[j]==0 && curr!=0){
//                    res++;
//                    curr--;
//                    maxlen= Math.max(maxlen, res);
//                }
//                else{
//                    break;
//                }
//            }
//        }
//        return maxlen;
//    }

//    Efficient Solution

    public static int maxOne(int []arr, int k){
        int zeroCount=0;
        int maxlen= 0;
        int left=0;
        int right=0;

        while(right<arr.length){
            if(arr[right]==0){
                zeroCount++;
            }

            while(zeroCount>k){
                if(arr[left]==0){
                    zeroCount--;
                }
                left++;
            }

            maxlen= Math.max(maxlen, right-left+1);
            right++;
        }

        return maxlen;
    }

    public static void main(String[] args) {
        int []arr ={1,0,0,1,1,0,1,0,1,1,1};
        int k=2;
        System.out.println(maxOne(arr, k));
    }
}
