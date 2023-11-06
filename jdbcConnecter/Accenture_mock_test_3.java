package jdbcConnecter;

import java.util.Scanner;

public class Accenture_mock_test_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum =0;
        int sum1 =0;

        System.out.print("n:");
        int n= sc.nextInt();
        System.out.print("m:");

        int m = sc.nextInt();

        if(n<0&&m<0){
            System.out.println("-1");
        }
        for(int i=1;i<=m;i++){
            if(i%n==0){
                sum += i;
            }
            else{
                sum1 += i;
            }
        }
        System.out.println(sum1-sum);
    }
    
}
