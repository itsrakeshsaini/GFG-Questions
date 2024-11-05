/*

You are given array arr of length of ropes. A cut operation is performed on ropes such that all of them are reduced by the length of the smallest rope. Return the number of ropes left after every cut operation until the length of each rope is zero.

Examples:

Input : arr[] = [5, 1, 1, 2, 3, 5]
Output : [4, 3, 2]
Explanation: In the first operation, the minimum ropes are 1 So, we reduce length 1 from all of them after reducing we left with 4 ropes and we do the same for rest.
Input : arr[] = [5, 1, 6, 9, 8, 11, 2, 2, 6, 5]
Output : [9, 7, 5, 3, 2, 1]
Explanation: In the first operation, the minimum ropes are 1 So, we reduce length 1 from all of them after reducing we left with 9 ropes and so on.

 */


import java.util.ArrayList;
import java.util.*;

public class GFG_04_Rope_Cutting {



    public static ArrayList<Integer> RopeCutting(int arr[]) {
        // Complete the Function
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        int remainingRopes = arr.length;

        for (int i = 0; i <arr.length; i++) {
            if (i==0 && arr[0] == arr[1]){
                remainingRopes--;
                continue;
            }
            if (i!=0 && arr[i] != arr[i - 1]) {
                result.add(remainingRopes);
            }
            remainingRopes--;
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={5,1,1,2,3,5};

        ArrayList<Integer> ans = GFG_04_Rope_Cutting.RopeCutting(arr);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
