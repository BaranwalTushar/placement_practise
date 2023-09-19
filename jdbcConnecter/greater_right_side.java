package jdbcConnecter;

import java.util.Arrays;

public class greater_right_side {
    
    public static void main(String[] args) {
        int arr[] = {16, 17, 4, 3, 5, 2};
        int n=6;

       int max = arr[n-1];
       arr[n-1] =-1;

       for(int i=n-2;i>=0;i--){
        int temp=arr[i];
        arr[i] = max;
        if(temp>max)
        max = temp;
       }
       System.out.println(Arrays.toString(arr));
        
    }
    
}
