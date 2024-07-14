package Removing_duplicates;

public class OptimalApproach {
    public static void main(String[] args) {
        
    int ar[]={1,1,2,3,2,4,7,7,5,5,9};
    int i=0;
    for(int j=1;j<ar.length;j++){
        if(ar[j]!=ar[i]){
            ar[i+1]=ar[j];
            i++;
        }
    }
    System.out.println(i);
    }
}
