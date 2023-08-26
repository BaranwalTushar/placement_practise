package jdbcConnecter;

import java.util.Arrays;

public class first_and_last_occurence {

    public static int[] find(int[]arr,int x){
        int []result = {-1,-1};
        int start =0,end = arr.length-1,mid=0;

        while(start<=end){
            mid = (start+end)/2;
            if(x==arr[mid]){
                result[0] = mid;
                end = mid-1;
            }
            else if(arr[mid]<x){
                start= mid+1;
            }
            else{
                end = mid-1;
            }
        }
         start=0;
         end = arr.length-1;
         mid =0;

        while(start<=end){
            mid = (start+end)/2;
            if(x==arr[mid]){
                result[1] = mid;
                start = mid+1;
            }
            else if(arr[mid]<x){
                start = mid+1;
            }
            else{ 
                end= mid-1;
            }
        }
        return result;

    }
    public static void main(String[] args) {
        int []a = {1,3,5,5,5,5,67,123,125};
        int x = 5;
        System.out.println(Arrays.toString(find(a, x)));
        
        
    }
    
}
