/*

Find out the maximum sub-array of non negative numbers from an array.

The sub-array should be contiguous i.e., a sub-array created by choosing the second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-array. Sub-array A is greater than sub-array B if sum(A) > sum(B).

Example:
a = [1, 2, 5, -7, 2, 3]
The two sub-arrays are [1, 2, 5] [2, 3].
The answer is [1, 2, 5] as its sum is larger than [2, 3]

NOTE: If there is a tie, then compare with segment's length and return segment which has maximum length.
If there is still a tie, then return the segment with minimum starting index.
If no such subarray is present return "-1"

Examples:

Input:
n = 3
a[] = {1, 2, 3}
Output: 1 2 3
Explanation: In the given array every
element is non-negative.
Input:
n = 2
a[] = {-1, 2}
Output: 2
Explanation: The only subarray [2] is
the answer.

 */





import java.util.ArrayList;

public class GFG_03_Maximum_SubArray {
    static ArrayList<Integer> findSubarray(int n, int a[]) {
        // code here
        int maxSum=0;
        int maxStart=0;
        int maxEnd=0;

        int currSum=0;
        int currStart =0;

        for(int i=0; i<a.length;i++){
            if(a[i]<0){
                currSum=0;
                currStart=i+1;
            }else{
                currSum+=a[i];

                if(currSum>maxSum){
                    maxSum= currSum;
                    maxStart= currStart;
                    maxEnd=i+1;
                }
                else if(currSum==maxSum){
                    int currDis= i+1-currStart;
                    int maxDis= maxEnd- maxStart;
                    if(currDis>maxDis){
                        maxStart= currStart;
                        maxEnd= i+1;
                    }
                }
            }
        }

        ArrayList<Integer> result= new ArrayList<>();
        for(int i=maxStart; i<maxEnd; i++){
            result.add(a[i]);
        }

        if(result.size()==0){
            result.add(-1);
        }

        return result;
    }


    public static void main(String[] args) {
        int []arr ={1,2,5,-7,2,5};
        int n= 6;
//        System.out.println();
        ArrayList<Integer> ans = GFG_03_Maximum_SubArray.findSubarray(n, arr);
        for(int i: ans){
            System.out.print(i+" ");
        }
    }
}
