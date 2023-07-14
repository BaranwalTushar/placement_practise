package jdbcConnecter;

import java.util.*;

public class Addition_fraction {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st numerator ");
        double numerator1 = sc.nextDouble();
        
        System.out.println("Enter 1st denominator ");
        double denominator1 = sc.nextDouble();

        System.out.println("Enter 2nd numerator");
        double numerator2 = sc.nextDouble();

        System.out.println("Enter 2nd denominator");
        double denominator2 = sc.nextDouble();

        double x = (numerator1*denominator2)+(numerator2*denominator1);
        double y = denominator1*denominator2;

        double result = x/y;
        System.out.println("Answer = "+result);


        
    }
    
}
