/*
   You are given an array of integers arr . Your task is to reverse the given array.

Examples:

Input: arr = [1, 2, 3, 4]
Output: [4, 3, 2, 1]
Explanation: The elements of the array are 1 2 3 4. After reversing the array, the first element goes to the last position,
the second element goes to the second last position and so on. Hence, the answer is 4 3 2 1.
Input: arr = [1]
Output: [1]
Explanation: The array has only single element, hence the reversed array is same as the original.

 */




public class GFG_02_Reverse_an_Array {
    public static void reverseArray(int arr[]) {
        // code here
        int i=0;
        int j=arr.length-1;

        while(i<j){
            int temp = arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }

        for(int k=0; k< arr.length;k++){
            System.out.print(arr[k]+" ");
        }
    }

    public static void main(String[] args) {
        int []arr = {1,2,3,4};
        reverseArray(arr);
    }
}
