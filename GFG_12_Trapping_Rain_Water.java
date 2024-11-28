/*
Problem- Trapping Rain Water

Given an array arr[] with non-negative integers representing the height of blocks. If the width of each block is 1, compute how much water can be trapped between the blocks during the rainy season.

Examples:

Input: arr[] = [3, 0, 0, 2, 0, 4]
Output: 10


 */



public class GFG_12_Trapping_Rain_Water {

//    public static int Trapping(int []arr){
//        int n= arr.length;
//        int res=0;
//        for(int i=1; i<n-1;i++){
//            int lmax=arr[i];
//            for(int j=0;j<i;j++){
//                lmax= Math.max(lmax, arr[j]);
//            }
//            int rmax=arr[i];
//            for(int j=i+1;j<n;j++){
//                rmax=Math.max(rmax, arr[j]);
//            }
//            res= res+(Math.min(lmax,rmax)-arr[i]);
//        }
//        return res;
//
//    }

//    Efficient solution with O(n) time complexity and Space O(n);
    public static int Trapping(int[]arr){
        int n= arr.length;
        int res=0;
        int []lmax= new int[n];
        int []rmax = new int[n];

        lmax[0]=arr[0];
        for (int i=1; i<n;i++){
            lmax[i]= Math.max(lmax[i-1], arr[i]);
        }
        rmax[n-1]= arr[n-1];
        for (int j=n-2; j>=0;j--){
            rmax[j]= Math.max(rmax[j+1], arr[j]);
        }

        for(int i=1; i<n-1;i++){
            res += Math.min(lmax[i], rmax[i])-arr[i];
        }
        return res;
    }

    public static void main(String[] args) {
        int []arr= {3, 0, 0, 2,0, 4};
        System.out.println(Trapping(arr));
    }


}
