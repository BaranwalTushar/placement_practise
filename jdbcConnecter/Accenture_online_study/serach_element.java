package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class serach_element {
    public static int search(int n,int []arr,int find){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            if(find==arr[i]){
                ans =i;
            }
            else
            {
                return -1;
            }
        }
        return (ans+1);
    }
    public static void main(String[] args) {
        int find=6;
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Size of n");
        n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(search(n, arr, find));
    }
    
}
