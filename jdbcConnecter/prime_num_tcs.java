package jdbcConnecter;

import java.util.Scanner;

public class prime_num_tcs {
    public static void check(int N){
        
        Scanner sc = new Scanner(System.in);
        N = sc.nextInt();
        int count=0;

        if(N<0){
            System.out.println("Please Enter positive number");
        }
        else{
            for(int i=1;i<N/2;i++){
                if(N%i==0){
                    count++;

                }
            }
            if(count>1){
                System.out.println("Not prime");
            }
            else{
                System.out.println("prime");
            }
        }
    }
    public static void main(String[] args) {
        check(7);
        
    }
    
}
