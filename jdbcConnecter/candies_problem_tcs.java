package jdbcConnecter;

import java.util.Scanner;

public class candies_problem_tcs {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println("enter the value of k");
        int k = sc.nextInt();
         System.out.println("No. of candies sold");
         int sold = sc.nextInt();

         if(sold>=1&&sold<=5){
            System.out.println("no.of candies sold "+sold);
            System.out.println( "No.of candies left"+(N-sold));
         }
         else{
            System.out.println("Invalid Input");
            System.out.println("No.of candies left "+(N-sold));
         }

        


        
    }
    
}
