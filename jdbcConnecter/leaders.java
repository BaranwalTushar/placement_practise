package jdbcConnecter;

import java.util.ArrayList;
import java.util.Collections;

public class leaders {
    public static ArrayList<Integer> Lead(int[] arr,int n){
       ArrayList<Integer> list = new ArrayList<>();
       int sum =0;
       int max = arr[n-1];
       list.add(arr[n-1]);
       
       for(int i=n-2;i>=0;i--){
          if(arr[i]>max){
            max = arr[i];
           
            list.add(max);
            
          }
          
       }
         
       Collections.reverse(list);
       
      
       
          return list;
    }
    public static void main(String[] args) {
         
        int n =6;
        int [] arr = {16,17,4,3,5,2};
        System.out.println(Lead(arr, n));
        

    }
    
}
