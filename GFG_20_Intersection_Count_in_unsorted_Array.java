import java.util.HashMap;

public class GFG_20_Intersection_Count_in_unsorted_Array {
    public static int Count(int []a, int[]b){

        HashMap<Integer, Integer> map= new HashMap<Integer, Integer>();

        int res=0;
        for(int i=0; i<a.length;i++){
            if(!map.containsKey(a[i])){
                map.put(a[i], i);
            }
        }

        for(int j=0; j<b.length;j++){
            if(map.containsKey(b[j])){
                res++;
                map.remove(b[j]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int[]a= {89, 24, 75, 11, 23};
        int[]b={ 89, 2, 4, 24};

        System.out.println(Count(a, b));
    }
}
