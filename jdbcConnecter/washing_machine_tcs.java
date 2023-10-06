package jdbcConnecter;

import java.util.Scanner;

public class washing_machine_tcs {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Weight of the clothes");
        int n = sc.nextInt();

        if(n==0){
            System.out.println("Time Estimated : 0 MIN");
        }
        else if(n>=1&&n<=2000){
            System.out.println("Time Estimated : 25 MIN");
        }
        else if(n>2000&&n<=4000){
            System.out.println("Time Estimated : 35 MIN");
        }
        else if(n>4000&&n<=7000){
            System.out.println("Time Estimated : 45 MIN");
        }
        else{
            System.out.println("Invalid Input");
        }
    }
    
}
