package Removing_duplicates;

import java.util.HashSet;

/**
 * BruteForce
 */
public class BruteForce {
    public static void main(String[] args) {
        int ar[]={1,2,3,2,3,1};
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<ar.length;i++){
            set.add(ar[i]);
        }int index=0;
        for(int it:set){
            ar[index]=it;
            index++;
        }
        System.out.println(index);
    }

    
}