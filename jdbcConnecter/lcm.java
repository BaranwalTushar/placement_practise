package jdbcConnecter;

import java.util.Scanner;

public class lcm {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter the 1st number");
        int x = sc.nextInt();

        System.out.println("Enter 2nd number");
        int y = sc.nextInt();
        int hcf = 1;
        for(int i=1;i<=x&&i<=y;i++){
            if(x%i==0&&y%i==0){
                hcf =i;
            }
        }

        int LCM =1;
        LCM = x*y/hcf;
        System.out.println( "The LCM of two number is"+LCM);
        


    }
    
}
