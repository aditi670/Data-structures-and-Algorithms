package Moving_all_zeroes_to_end;

public class TwoPointerApproach {
    public static void main(String[] args) {
        int ar[]={1,2,3,0,0,6,0,4,3,2,1,0};
        int j=-1;
    for(int i=0;i<ar.length;i++)
    {
        if(ar[i]==0)
        {
            j=i;
            break;
        }
    }
    for(int i=j+1;i<ar.length;i++){
        if(ar[i]!=0){
            int temp=ar[i];
            ar[i]=ar[j];
            ar[j]=temp;
            j++;
        }
    }
    for(int i=0;i<ar.length;i++){
        System.out.println(ar[i]);
    }
    
}
}
