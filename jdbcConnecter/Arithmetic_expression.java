package jdbcConnecter;

import java.util.Scanner;

public class Arithmetic_expression {
    public static void main(String[] args) {
        int n,d,a,an,sum ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the nth term");
        n = sc.nextInt();

        System.out.println("Enter the the value of a1 first term");
        a=sc.nextInt();

        System.out.println("Enter the common difference");
        d=sc.nextInt();

       // an = a1+(n-1)*d; For finding nth term
         an =n/2*(2*a+(n-1)*d);//For finding sum of nth term
       
        System.out.println("The nth term will be "+an );


    }
    
}
