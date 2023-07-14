package jdbcConnecter;

import java.util.Arrays;

public class removeelements {
    public static void main(String[] args) {
        int []arr = {10,20,30,40,50};
        System.out.println("Before Deleted "+Arrays.toString(arr));

        int removeindex = 2;
        for(int i=removeindex;i<arr.length-1;i++){
            arr[i] = arr[i+1];
        }
        System.out.println("after removing a element" +Arrays.toString(arr));
        
    }
    
}
