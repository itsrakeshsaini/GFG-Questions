/*

Given an array arr[] of positive integers, where each value represents the number of chocolates in a packet. Each packet can have a variable number of chocolates. There are m students, the task is to distribute chocolate packets among m students such that -
      i. Each student gets exactly one packet.
     ii. The difference between maximum number of chocolates given to a student and minimum number of chocolates given to a student is minimum and return that minimum possible difference.

 */

import java.util.*;
public class GFG_06_Chocolate_Distribution_Problem {
    public static int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        Collections.sort(arr);

        int sum=0;
        int min=0;

        // for(int i=0;i<m;i++){
        //     sum+=arr.get(i);
        // }
        int start = 0;
        int last = m-1;
        sum= arr.get(last)-arr.get(0);
        // System.out.println(sum);

        min =sum;

        for(int i=m;i<n;i++){
            min= Math.min(min, arr.get(i)-arr.get(i-last));
        }
        return min;
    }

    public static void main(String[] args) {
        int m = 5;
        ArrayList<Integer> list= new ArrayList<>();
        list.add(3);
        list.add(4);
        list.add(1);
        list.add(9);
        list.add(56);
        list.add(7);
        list.add(9);
        list.add(12);
        System.out.print(findMinDiff(list, m));


    }
}
