package jdbcConnecter;

import java.util.Scanner;

public class Geometric_Expression {
    public static void main(String[] args) {
        double n,r,a;

         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        n = sc.nextDouble();

        System.out.println("Enter the the value of a first term");
        a=sc.nextDouble();

        System.out.println("Enter the common difference");
        r=sc.nextDouble();
        

        double S = a*((Math.pow(r, n)-1)/(r-1));
        System.out.println("The Geometric expression is "+S);
    }
    
}
