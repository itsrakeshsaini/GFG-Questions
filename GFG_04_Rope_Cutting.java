import java.util.ArrayList;
import java.util.*;

public class GFG_04_Rope_Cutting {



    public static ArrayList<Integer> RopeCutting(int arr[]) {
        // Complete the Function
        ArrayList<Integer> result = new ArrayList<>();
        Arrays.sort(arr);

        int remainingRopes = arr.length;

        for (int i = 0; i <arr.length; i++) {
            if (i==0 && arr[0] == arr[1]){
                remainingRopes--;
                continue;
            }
            if (i!=0 && arr[i] != arr[i - 1]) {
                result.add(remainingRopes);
            }
            remainingRopes--;
        }
        return result;
    }

    public static void main(String[] args) {
        int []arr={5,1,1,2,3,5};

        ArrayList<Integer> ans = GFG_04_Rope_Cutting.RopeCutting(arr);

        for(int i:ans){
            System.out.print(i+" ");
        }
    }
}
