/*

You are given an array A of size N. The array contains almost distinct elements with some duplicated. You have to print the elements in sorted order which appears more than once.

Input Format:
The first line of input contains T, denoting the number of testcases. T testcases follow. Each testcase contains two lines of input.  The first line of input contains size of array N. The second line contains N integers separated by spaces.

Output Format:
For each test case, in a new line, print the required answer. If there are no duplicates print -1.

Your Task:
Your task is to complete the function SortedDuplicates(arr, n) which accepts array and its size as an argument.

 */

import java.util.*;
public class GFG_05_Duplicate_Elements {
    public static void SortedDuplicates(int arr[], int n)
    {
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        ArrayList<Integer> res= new ArrayList<>();

        for(int i=0; i<n; i++){
            map.put(arr[i], map.getOrDefault(arr[i], 0)+1);
        }

        for(Map.Entry<Integer, Integer> e:map.entrySet()){
            if(e.getValue()>1){
                res.add(e.getKey());
            }

        }

        Collections.sort(res);

        if(res.size()==0){
            System.out.print("-1");
        }
        for(int num :res){
            System.out.print(num+" ");
        }

    }

    public static void main(String[] args) {
        int []arr= {3,2,1,3,5,6,1,7};
        int n= 8;
        SortedDuplicates(arr,n);
    }
}
