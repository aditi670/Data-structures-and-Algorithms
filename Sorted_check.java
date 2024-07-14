public class Sorted_check {
    public static void main(String[] args) {
        int ar[]={1,2,3,1,45,46};boolean flag=false;
        for(int i=1;i<ar.length;i++){
            if(ar[i]>=ar[i-1]){
                flag=true;
            }
            else{
                System.out.println("not a sorted array");
                System.exit(i);
            }

        }
        System.out.println("It is a sorted array");
    }
    
}
