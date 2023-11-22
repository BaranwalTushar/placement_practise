package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class Accenture_max_diffrence {
    public static void main(String[] args) {
        int maximumno = 0;
        int num =0;
        
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter the Integer");

        int n = sc.nextInt();
        int o = sc.nextInt();

        int [] arr = new int[o];
        for(int i=0;i<o;i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0;i<arr.length;i++){
            num= Math.abs(n-arr[i]);
            if(num>maximumno){
               maximumno = num;
               System.out.println(maximumno);
            }
        }

    }
    
}
