package jdbcConnecter;

import java.util.Scanner;

public class series_3_tcs {
    public static void main(String[] args) {
        int a =0;
        int b =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter ");
        int n = sc.nextInt();

        if(n%2==0){
            for(int i=0;i<n/2;i++){
                a = 0+i;
            }
            System.out.println(a);
        }
        else{
            for(int i=0;i<=n/2;i++){
                b = i*2;
            }
            System.out.println(b);
        }
    }
    
}
