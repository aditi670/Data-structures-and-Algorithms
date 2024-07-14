public class SecondSmallest {
    public static void main(String args[]){
        int ar[]={1,2,3,4,2,7,1};
        int SecSmall=Integer.MAX_VALUE;int smallest=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]<smallest){
              SecSmall=smallest;
              smallest=ar[i];
            }
            else if(ar[i]>smallest && ar[i]<SecSmall){
                SecSmall=ar[i];
            }
        }
       System.out.println(SecSmall);
    }

    
    
}
