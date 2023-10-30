package jdbcConnecter;

import java.util.Arrays;
import java.util.Collection;

public class Accenture_Shift_zero {
       public static void main(String[] args) {

        int arr[] = {1,2,0,0,6};
        int j=0,i;
        for( i=0;i<arr.length;i++){
            if(arr[i]!=0){
                arr[j] = arr[i];
                j++;
            }
        }
        for(i=j;i<arr.length;i++){
            arr[i] = 0;
        }
        System.out.println(Arrays.toString(arr));
       

    }
        
        
    }  

