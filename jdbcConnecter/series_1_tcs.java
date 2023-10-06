package jdbcConnecter;

import java.util.Scanner;

public class series_1_tcs {
    public static void main(String[] args) {
        
        int a=0,b=0,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Nth term");
        int n = sc.nextInt();

        if(n%2==0){
            for(int i=0;i<n/2;i++){
                a = (i*6);
            }
            System.out.println(a);
        }
        else{
            for(int i=0;i<=n/2;i++){
                b = (i*7);
            }
            System.out.println(b);
        }
        


    }
    
}
