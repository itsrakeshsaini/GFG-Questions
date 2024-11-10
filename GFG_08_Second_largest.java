/*
Given an array arr[], return the second largest element from an array. If the second largest element doesn't exist then return -1.

Note: The second largest element should not be equal to the first largest.

Examples:

Input: arr[] = [12, 35, 1, 10, 34, 1]
Output: 34
Explanation: The largest element of the array is 35 and the second largest element is 34.

 */

import java.sql.PseudoColumnUsage;
import java.util.*;
public class GFG_08_Second_largest {
    /*
//    Method 1:

    public static int second(int arr[]){
        Arrays.sort(arr);
        int j= arr.length-1;
        for(int i= arr.length-2;i>=0;i--){
            if(arr[i]<arr[j]){
                return arr[i];
            }
        }
        return -1;
    }

    method 2:
        make function for largest element and then make secondlargest function
        call largest function into second largest function and-
        secodlargest(){
            largest();
            int res=-1;
            for(i=0;i<n;i++){
                if arr[i]>arr[largest]:  res= largest; largest=i;
                else if arr[i]!=arr[largest]:  if (res==-1|| ar[i]>arr[res]) { res=i;}
            }
            return arr[res];
        }

     */

//    Efficent approach

    public static int secondLargest(int arr[]){
        int res=-1;
        int largest =0;

        for(int i=0;i<arr.length;i++){
            if(arr[i]>arr[largest]){
                res=largest;
                largest=i;
            } else if (arr[i]!=arr[largest]) {
                if(res==-1|| arr[i]>arr[res]){
                    res =i;
                }
            }
        }
        if(res==-1){
            return -1;
        }
        return arr[res];
    }


    public static void main(String[] args) {
        int [] arr= {12, 35, 1, 10, 34, 1};
        System.out.println(secondLargest(arr));
    }
}
