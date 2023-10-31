package jdbcConnecter;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Accenture_smaller_left_side {

  public static void smallerleft(int []arr){
    Stack<Integer> st = new Stack<>();
    for(int i=0;i<arr.length;i++){
        while(!st.empty()&&st.peek()>=arr[i]){
            st.pop();

        }
        if(st.empty()){
            System.out.println("-1");
            
        }
        else{
            System.out.println(st.peek());
        }
       st.push(arr[i]);
       
    }
    System.out.print(Arrays.toString(arr));
  }
    public static void main(String[] args) {
        int[]arr = {4,10,5,8,20,15,3,12};
        smallerleft(arr);
        
    }
    
}
