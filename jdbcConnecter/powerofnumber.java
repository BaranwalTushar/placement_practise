package jdbcConnecter;

import java.util.Scanner;

public class powerofnumber {
    public static void main(String[] args) {
        int base ;
        int exponents;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter base");
        base = sc.nextInt();

        System.out.println("enter exponents");
        exponents = sc.nextInt();

        long result = (long) Math.pow(base, exponents);

        System.out.println("Anser = "+result);

        
    }
    
}
