package jdbcConnecter;

import java.util.Scanner;

public class Accenture_charity_questions {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of days");
        int n = sc.nextInt();
        for(int i=1;i<=2;i++){
           sum += Math.pow(i, 2);

        }
        System.out.println(sum);
    }
    
}
