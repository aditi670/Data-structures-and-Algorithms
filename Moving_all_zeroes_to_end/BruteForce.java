package Moving_all_zeroes_to_end;
import java.util.*;
public class BruteForce {
    public static void main(String[] args) {
        
    
    ArrayList<Integer> temp=new ArrayList<>();
    int ar[]={1,2,3,0,0,6,0,4,3,2,1,0};
    for(int i=0;i<ar.length;i++){
        if(ar[i]!=0){
            temp.add(ar[i]);
        }
    }
    System.out.println(temp);int  k=0;
    for(int j=0;j<temp.size();j++){
        ar[j]=temp.get(k);
        k++;
    }
    for(int f=k;f<ar.length;f++){
        ar[f]=0;

    }
    for(int l:ar){
        System.out.println(l);
    }
    }
    
}
