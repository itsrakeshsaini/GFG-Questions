/*

Find the index of the first occurence in an array of given input..
naive approach and Optimal (Binary Search)

 */


public class GFG_15_First_Occurence_BinarySearch {
//    Naive appraoch -- Linear Search...
//    public static int firstOccurence(int []arr, int k){
//        for(int i=0; i< arr.length;i++){
//            if(arr[i]==k){
//                return i;
//            }
//        }
//        return -1;
//    }

//    Binary Search...
    public static int firstOccurence(int []arr, int k){
        int low=0, high= arr.length-1;
        while (low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>k){
                high=mid-1;
            } else if (arr[mid]<k) {
                low= mid+1;
            }else {
                if(mid==0||arr[mid]!=arr[mid-1]){
                    return mid;
                }else {
                    high=mid-1;
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr= {0,0,1,1,1,1,2,2,3,4};
        int k =1;
        System.out.println(firstOccurence(arr, k));
    }
}
