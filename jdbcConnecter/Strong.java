package jdbcConnecter;

import java.util.Scanner;

public class Strong {

    public static int factorial(int n){
        if(n==0||n==1){
            return 1;
        }
        else{
            return n*factorial(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n  = sc.nextInt();

        for(int i=0;i<=n;i++){
            int x = factorial(n);
            x += i;
            System.out.println(i);

        }
    }
    
}
