package jdbcConnecter;

import java.util.Arrays;
import java.util.Scanner;

public class Accenture_Adjacent_number {
    public static void main(String[] args) {
        int sum =0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number");
        int n = sc.nextInt();

        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        Arrays.sort(arr);
        for(int i=1;i<arr.length;i++){
         sum += Math.abs(arr[i]-arr[i-1]);
        }
        System.out.println(sum);
    }
    
}
