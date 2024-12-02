public class GFG_17_Count_Occurence_in_Sorted_Array {
    public static int firstOccurence(int []arr, int target){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>target){
                high= mid-1;
            }else if(arr[mid]<target){
                low= mid+1;
            }else{
                if(mid==0|| arr[mid]!= arr[mid-1]){
                    return mid;
                }high = mid-1;
            }
        }
        return -1;
    }

    public static int lastOccurence(int []arr, int target){
        int low=0, high=arr.length-1;
        while(low<=high){
            int mid= (low+high)/2;
            if(arr[mid]>target){
                high= mid-1;
            }else if(arr[mid]<target){
                low= mid+1;
            }else{
                if(mid==arr.length-1|| arr[mid]!= arr[mid+1]){
                    return mid;
                }low = mid+1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int []arr= {1, 1, 2, 2, 2, 2, 3};
        int target=2;
        if(firstOccurence(arr,target)==-1){
            System.out.println(0);
        }
        System.out.println(lastOccurence(arr, target)-firstOccurence(arr, target)+1);
    }
}
