/*

Given a sorted (in ascending order) and rotated array arr of distinct elements which may be rotated at some point and given an element key, the task is to find the index of the given element key in the array arr. The whole array arr is given as the range to search.

Rotation shifts elements of the array by a certain number of positions, with elements that fall off one end reappearing at the other end.

Note:- 0-based indexing is followed & returns -1 if the key is not present.

Examples :

Input: arr[] = [5, 6, 7, 8, 9, 10, 1, 2, 3], key = 10
Output: 5
Explanation: 10 is found at index 5.

 */
public class GFG_18_Search_in_Rotated_Array {

    public static int searchKey(int []arr, int key){
        int low=0, high= arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;

            if(arr[mid]==key){
                return mid;
            }

            if(arr[low]<arr[mid]){
                if(key>=arr[low] &&  key<arr[mid] || key== arr[low]){
                    high= mid-1;
                }else{
                    low= mid+1;
                }
            }else{
                if(key>arr[mid] && key<=arr[high] || key==arr[high]){
                    low= mid+1;
                }else{
                    high=mid-1;
                }
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int []arr= {2,3,4,5,1};
        int key =1;
        System.out.println(searchKey(arr, key));
    }
}
