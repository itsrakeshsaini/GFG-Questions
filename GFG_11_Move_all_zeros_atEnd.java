/*
Given an array arr[]. Push all the zeros of the given array to the right end of the array while maintaining the order of non-zero elements. Do the mentioned change in the array in place.

Examples:

Input: arr[] = [1, 2, 0, 4, 3, 0, 5, 0]
Output: [1, 2, 4, 3, 5, 0, 0, 0]
Explanation: There are three 0s that are moved to the end.

 */



public class GFG_11_Move_all_zeros_atEnd {

    /*
    Naive Approach:
    idea--
    first find zero element index then check for next non zero element and then swap both.

    public static void move(int arr[]){
        for(int i=0; i<arr.length;i++){
            if(arr[i]==0){
                for(int j=i+1; j< arr.length;j++){
                    if(arr[j]!=0){
                        int temp = arr[j];
                        arr[j]= arr[i];
                        arr[i]= temp;
                    }
                }
            }
        }

        for(int i =0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

     */

    public static void move(int arr[]){
        int count=0;
        for(int i=0; i<arr.length;i++){
            if(arr[i]!=0){
                int temp =arr[i];
                arr[i]=arr[count];
                arr[count]=temp;
                count++;
            }
        }

        for(int i=0; i< arr.length;i++){
            System.out.print(arr[i]);
        }
    }

    public static void main(String[] args) {
        int []arr={3,5,0,0,4};
        move(arr);
    }
}
