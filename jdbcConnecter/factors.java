package jdbcConnecter;

import java.util.Scanner;

public class factors {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Number");
        int n = sc.nextInt();

        for(int i=1;i<=n;i++){
            if(n%i==0){
                System.out.println("The factors are "+i);
            }
        }
    }
    
}
