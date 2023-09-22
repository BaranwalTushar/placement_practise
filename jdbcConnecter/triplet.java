package jdbcConnecter;

import java.util.Arrays;

public class triplet {
    public static int countvariable(int []arr){
        Arrays.sort(arr);
        int count =0;
        for(int i=arr.length-1;i>=0;i--){
            int start =0;
            int end = i-1;

            while(start<end){
                if(arr[start]+arr[end]==arr[i]){
                    count++;
                    end--;
                    start++;
                }
                else if(arr[start]+arr[end]>arr[i]){
                         
                    end--;
                }
                else{
                    start++;
                }
            }
        }
        return count;
    }
    public static void main(String[] args) {
        int [] arr = {1, 5, 3, 2};
        System.out.println(countvariable(arr));
    }
    
}
