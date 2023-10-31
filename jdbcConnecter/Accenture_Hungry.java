package jdbcConnecter;

import java.util.Scanner;

public class Accenture_Hungry {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the No. of people Hungry");
        int n = sc.nextInt();

        for(int i=n+1;i<=n*2;i++){
            sum = i;
             System.out.println(sum);
        }
       
    }
    
}
