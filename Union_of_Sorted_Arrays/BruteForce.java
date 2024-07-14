package Union_of_Sorted_Arrays;
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5,6};
        int b[]={1,3,4,7,8,3};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<a.length;i++){
            set.add(a[i]);
        }
        for(int i=0;i<b.length;i++){
            set.add(b[i]);
        }
        int union[]=new int[set.size()];int k=0;
        for(int i:set){
            union[k]=i;
            k++;
        }

    }
    
}
