package jdbcConnecter;

import java.util.Scanner;

public class tcs_Enter_leaving_problem {
    public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       int t = sc.nextInt();
       int entering[] = new int[t];
       int leaving[] =  new int[t];
       int max=0;
       int sum =0;
       for(int i=0;i<t;i++){
        entering[i] = sc.nextInt();
       }
       for(int i=0;i<t;i++){
        leaving[i] = sc.nextInt();
       }

       for(int i=0;i<t;i++){
        sum += entering[i]-leaving[i];
        max = Math.max(sum,max);

       }
       System.out.println(max);

       
    }
    
}
