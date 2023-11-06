package jdbcConnecter;

import java.util.Arrays;

public class Accenture_Missing_number2 {

    public static int check(int []arr){
        int check =1;
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i++){
            if(arr[i]<check){
                return check;
            }
            else if(check==arr[i]){
                check++;
                
            }
            else{
                return check;
            }
        }
        return check;
    }
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,6};
        System.out.println(check(arr));
       
    }
    
}
