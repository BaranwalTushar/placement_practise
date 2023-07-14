package jdbcConnecter;

import java.util.Scanner;

public class factorial {
    public static Long factoriall(int i){
        if(i==0 || i==1){
            return (long) 1;
        }
        else{
            return i*factoriall(i-1);
        }
    }
    
    public static void main(String[] args) {
       
        long fact=1;
        fact = factoriall(3);
        System.out.println(fact);

        
        
    }
    
}
