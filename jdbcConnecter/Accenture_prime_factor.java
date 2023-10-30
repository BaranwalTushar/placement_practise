package jdbcConnecter;

import java.util.Scanner;

public class Accenture_prime_factor {
    public static void main(String[] args) {
        int factor=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");

        int n = sc.nextInt();

        for(int i =2;i<=n;i++){
            if(n%i==0){
                factor =i;
                break;
            }
            
        }
        System.out.println(n-factor);
    }
    
}
