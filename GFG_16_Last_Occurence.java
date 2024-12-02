/*

find last occurence of given element from an array using both linear and binary search...
 */

public class GFG_16_Last_Occurence {
//    Linear serach...
//    public static int lastOccurence(int []arr, int k){
//        for(int i= arr.length-1; i>=0;i--){
//            if(arr[i]==k){
//                return i;
//            }
//        }
//        return -1;
//    }

//    Binary Search...
    public static int lastOccurence(int []arr, int k){
        int low=0, high=arr.length-1;
        while (low<=high){
            int mid = (low + high) / 2;
            if(arr[mid]>k){
                high= mid-1;
            } else if (arr[mid]<k) {
                low= mid+1;
            }else {
                if(mid== arr.length-1 || arr[mid]!= arr[mid+1]){
                    return mid;
                } low=mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] arr= {0,0,1,1,1,1,2,2,3,4};
        int k =1;
        System.out.println(lastOccurence(arr, k));
    }
}
