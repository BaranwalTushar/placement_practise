package jdbcConnecter;

import java.util.Arrays;

public class find_smallest_positive_missisng_ {
     
    public static int missing(int []arr,int n){

        boolean[] auxiliary = new boolean[n];

        for(int i=0;i<n;i++){
            if(arr[i]>=0&& arr[i]<n){
                auxiliary[arr[i]]= true;
            }
        }
        int small = 1;
        while(auxiliary[small]){
            small++;
        }
        return small;
    }
    public static void main(String[] args) {
        int arr[] = {2,3,7,6,8,-1,-10,15};
        int n = 8;
        System.out.println(missing(arr, n));
       
        
    }
    
}
