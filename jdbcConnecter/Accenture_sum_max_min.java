package jdbcConnecter;

import java.util.Arrays;

public class Accenture_sum_max_min {
    public static int sum(int arr[]){
        int sum =0;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            sum = arr[0]+arr[arr.length-1];
        }
        return sum;
    }
    public static void main(String[] args) {
        int arr[] = {12,1234,45,67,1};
        System.out.println(sum(arr));
        
    }
    
}
