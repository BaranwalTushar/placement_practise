package jdbcConnecter;

import java.util.Arrays;

public class Accenture_even_firsttheodd {
    public static void main(String[] args) {
        int l=0;
        int temp=0;
        
        int arr[] = {20,5,3,6,9,11,4};
        int r=arr.length-1;
       for(int i=0;i<arr.length;i++){
            if(arr[l]%2==0){
                l++; 
                
            }
            else{
                 temp=arr[l];
                arr[l]=arr[r];
                arr[r]=temp;
                r--;
              
            }
            

        }
        System.out.println(Arrays.toString(arr));
       
        
    }
    
}
