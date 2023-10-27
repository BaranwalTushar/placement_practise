package jdbcConnecter;

import java.util.Scanner;

public class Accenture_Dice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int count =0;
        for(int i=1;i<=6;i++){
            for(int j=1;j<=6;j++){
                if(i+j==n){
                    count++;
                }
                
            }
           
        }
        System.out.println(count);
    }
    
}
