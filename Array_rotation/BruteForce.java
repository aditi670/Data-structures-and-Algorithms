package Array_rotation;

public class BruteForce {
    public static void main(String args[]){
        int ar[]={1,2,3,4,5,6,7};
        int d=3;
        int temp[]=new int[d];
        for(int i=0;i<d;i++){
            temp[i]=ar[i];
        }
        for(int i=d;i<ar.length;i++){
            ar[i-d]=ar[i];
            System.out.println(ar[i]);
        }
        int j=0;
        for(int i=ar.length-d;i<ar.length;i++){
            ar[i]=temp[j];
            j++;
            System.out.println(ar[i]);
        }
        
    }
    
}
