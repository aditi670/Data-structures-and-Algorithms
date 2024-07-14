import java.util.*;
class SecondLargest{
    public static void main(String args[]){
        int ar[]={1,4,3,7,5,9,3};
        int SecLar=Integer.MIN_VALUE;int largest=ar[0];
        for(int i=1;i<ar.length;i++){
            if(ar[i]>largest ){
                SecLar=largest;
                largest=ar[i];
            }else if(ar[i]<largest && ar[i]>SecLar){
                SecLar=ar[i];
            }

        }
        System.out.println(SecLar);
    }
}