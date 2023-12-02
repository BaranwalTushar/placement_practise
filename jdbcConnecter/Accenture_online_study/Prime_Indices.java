package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class Prime_Indices {
    public static boolean isprime(int num){
        if(num<=1){
            return false;
        }
        for(int i=2;i<=num/2;i++){
            if(num%i==0){
                return false;
            }

        }
        return true;
    }
    public static int primeindex(int[]arr,int n){
        int sum=0;
        for(int i=0;i<n;i++){
            if(isprime(i)){
                sum += arr[i];
            }
        }
        return sum;
    }
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size");
        int n = sc.nextInt();
        int sum=0;

        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(primeindex(arr, n));

        
        
    }
    
}
