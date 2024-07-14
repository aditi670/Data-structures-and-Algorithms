package Array_rotation;

public class OptimalApproach {
static void reverse(int ar[],int start,int end){
    while(start<=end){
        int temp=ar[start];
        ar[start]=ar[end];
        ar[end]=temp;
        start++;
        end--;
    }
}
static void rotate(int ar[],int n,int k){
    reverse(ar,0,k-1);
    reverse(ar,k,n-1);
    reverse(ar,0,n-1);

}


    public static void main(String[] args) {
        int ar[]={1,2,3,4,5,6,9,8,7};
        int d=3;
        rotate(ar,ar.length,d);
        for(int i:ar){
        System.out.println(i);
        }
    }
    
}
