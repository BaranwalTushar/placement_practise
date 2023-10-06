package jdbcConnecter;

import java.util.Scanner;

public class series_2_tcs {
    public static void main(String[] args) {
        double a = 0;
        double b = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of N");
        int N = sc.nextInt();

        if(N>30){
            System.out.println("Inaalid");
        }
        if(N%2==0){
          for(int i=0;i<N/2;i++){
            a = Math.pow(3,i);
            
          }
          System.out.println(a);
        }
        else{
            for(int i=0;i<=N/2;i++){
                b = Math.pow(2, i);
            }
            System.out.println(b);
        }
        
    }
    
}
