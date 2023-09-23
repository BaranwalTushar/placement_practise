package jdbcConnecter;

import java.util.Arrays;

public class Rearrange_Array {
    public static void main(String[] args) {
        
        //input -> 2,3,5,6,7,9
        //output->9,2,7,3,6,5
        int arr[] = {2,3,5,6,7,9};
        int left=0;int right=arr.length-1;
        int max = 100000;
        for(int i=0;i<arr.length;i++){
            if(i%2==0){
                arr[i] = arr[i] + (arr[right]%max)*max;
                right--;
            }
            else{
                arr[i] = arr[i] + (arr[left]%max)*max;
                left++;
            }

        }
        for(int i=0;i<arr.length;i++){
            arr[i] = arr[i]/max;
            
        }
        System.out.println(Arrays.toString(arr));
       
    }
    
}
