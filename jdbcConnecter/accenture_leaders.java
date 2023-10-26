package jdbcConnecter;

import java.util.Scanner;

public class accenture_leaders {
    public static void main(String[] args) {
        int j;
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the size of the array");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }

        int sum =0;
        for(int i=0;i<n;i++){
            for( j= i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    break;
                }
            }
            if(j==n){
                sum += arr[i];
            }
        }
        System.out.println(sum);
    }
    
}
