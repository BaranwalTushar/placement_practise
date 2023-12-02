package jdbcConnecter.Accenture_online_study;

import java.util.Scanner;

public class Superior_element {
    public static int superior(int []arr,int n){
        int count=0;
        int j;
        for(int i=0;i<n;i++){
            for( j=i+1;j<n;j++){//2,8,9,7,4,2
                if(arr[i]<=arr[j])
                    break;
                    
                   
            }
            if(j==n){
                        count++;
                    } 
            
            

        }
        return count;
    }
    public static void main(String[] args) {

            Superior_element sp = new Superior_element();
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int [] arr = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println(sp.superior(arr, n));
    }
    
}
