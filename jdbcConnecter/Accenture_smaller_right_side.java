package jdbcConnecter;

import java.util.Arrays;
import java.util.Stack;

public class Accenture_smaller_right_side {

    public static void right(int arr[]){
          int i;
        Stack<Integer> s = new Stack<>();
        for( i=arr.length-1;i>=0;i--){
            while(!s.empty()&&s.peek()>=arr[i]){
                s.pop();
            }
            if(s.empty()){
                System.out.println("-1");
            }
            else{
                System.out.println(s.peek());
            }
            s.push(arr[i]);
        }
        System.out.println(Arrays.toString(arr));
       
    }
    public static void main(String[] args) {
        int []arr = {3,2,11,7,6,5,6,1};
        right(arr);
        
    }
    
}
