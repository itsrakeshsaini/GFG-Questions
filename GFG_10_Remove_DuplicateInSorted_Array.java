/*

Given a sorted array arr. Return the size of the modified array which contains only distinct elements.
Note:
1. Don't use set or HashMap to solve the problem.
2. You must return the modified array size only where distinct elements are present and modify the original array such that all the distinct elements come at the beginning of the original array.

Examples :

Input: arr = [2, 2, 2, 2, 2]
Output: [2]
Explanation: After removing all the duplicates only one instance of 2 will remain i.e. [2] so modified array will contains 2 at first position and you should return 1 after modifying the array, the driver code will print the modified array elements.
 */


import java.util.ArrayList;
import java.util.List;

public class GFG_10_Remove_DuplicateInSorted_Array {

    public static int removeDup(List<Integer> arr){
//        int i=0;
//        int res=1;
//        while(res<arr.size()){
//            if(arr.get(i).equals(arr.get(res))){
//                 arr.remove(res);
//            }
//             else{
//                 i++;
//                 res++;
//             }
//        }
//
//        return arr.size();

        int res=1;
        for(int i=1; i<arr.size();i++){
            if(!arr.get(i).equals(arr.get(res))){
                arr.set(res, arr.get(i));
                res++;
            }
        }
        return res;
    }
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(20);
        arr.add(20);
        arr.add(30);
        arr.add(30);
        arr.add(40);

        System.out.print(removeDup(arr));
    }
}
