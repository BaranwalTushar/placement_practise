package jdbcConnecter;

import java.util.Scanner;

public class Accenture_Day_2_prblem_2 {
  {

    }
    public static void main(String[] args) {
        int mul =0;
        int sum=0;
        int store =0;
        Scanner sc = new Scanner(System.in);
        System.out.print("r:");
        int n = sc.nextInt();
        System.out.print("unit:");
        int n1 = sc.nextInt();

        System.out.print("n:");
        int n2 = sc.nextInt();

        int[] arr = new int[n2];
        for(int i=0;i<n2;i++){
            arr[i] = sc.nextInt();
        }

        mul = n*n1;

        for(int i=0;i<arr.length;i++){
          sum += arr[i];
          if(sum>=mul){
            store = sum;
            break;
          }

        }
        System.out.println("output");
        System.out.println(store-mul);
        
    }
    
}
