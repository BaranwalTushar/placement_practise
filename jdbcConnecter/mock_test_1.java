package jdbcConnecter;

import java.util.Scanner;

public class mock_test_1 {
    public static void main(String[] args) {
        int sum=0;
        int sum1 =0;
        int sum2 =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("2");
        System.out.println("3");
        int n = sc.nextInt();

        
        //int n1 = sc.nextInt();

        for(int i=1;i<=n;i++){
            sum  += Math.pow(i, 2);
        }
        for(int i=1;i<=n;i++){
            sum1 += i;
            
        }
        sum2 = sum1*sum1;

        System.out.println(Math.abs(sum-sum2));
    }
    
}
