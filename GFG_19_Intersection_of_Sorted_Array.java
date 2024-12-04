import java.util.ArrayList;

public class GFG_19_Intersection_of_Sorted_Array {

    public static ArrayList<Integer> intersection(int []a, int []b){
        ArrayList<Integer> list= new ArrayList<>();
        int i=0, j=0;
        while (i<a.length && j<b.length){
            if(i>0 && a[i]==a[i-1]){
                i++;
                continue;
            }

            if(a[i]>b[j]){
                j++;
            } else if (a[i]<b[j]) {
                i++;
            }else{
                list.add(a[i]);
                i++;
                j++;
            }
        }
        return list;
    }

    public static void main(String[] args) {
        int []a= {1,20,20,40,60};
        int[]b ={2, 20,20,20,80};
        System.out.println(intersection(a, b));

    }
}
