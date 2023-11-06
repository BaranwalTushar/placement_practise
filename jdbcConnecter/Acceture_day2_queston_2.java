package jdbcConnecter;

import java.util.Arrays;

public class Acceture_day2_queston_2 {
    public static int DefLargesum(int[]arr){

        int secondlargestevennumber = Integer.MIN_VALUE;
        int secondsmallestoddnumber = Integer.MAX_VALUE;
       if(arr.length == 0||arr.length<4){
       return 0;
       }
       for(int i=0;i<arr.length;i++){
         if(i%2==0){
            if(secondlargestevennumber<arr[i]){
            secondlargestevennumber = arr[i];
            }
         }
         else{
            if(secondsmallestoddnumber>arr[i]){
                secondsmallestoddnumber = arr[i];
            }
         }
       }
       return secondlargestevennumber+secondsmallestoddnumber;
    
       
    }
   
    public static void main(String[] args) {
       int[]arr = {1,8,0,2,3,5,6};
       
       System.out.println(DefLargesum(arr));
        
    
}
}
